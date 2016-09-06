package com.leiva.ocp.utils;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public final class FileUtilsImpl implements FileUtils {

    @Override
    public void delete(Path source) throws IOException {
        Files.walkFileTree(source, new DeleteFileVisitor());
    }

    @Override
    public List<Path> copy(Path source, Path target) throws IOException {
        CopyFileVisitor cfv = new CopyFileVisitor(source, target);
        Files.walkFileTree(source, cfv);
        return cfv.getCopyPaths();
    }

    @Override
    public boolean pathExists(Path path) {
        return Files.exists(path);
    }

    private static class DeleteFileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.delete(file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
            Files.delete(dir);
            return FileVisitResult.CONTINUE;
        }
    }

    private static class CopyFileVisitor extends SimpleFileVisitor<Path> {

        private final Path source;
        private final Path target;
        private final List<Path> paths;

        private CopyFileVisitor(Path source, Path target) {
            this.source = source;
            this.target = target;
            paths = new ArrayList<>();
        }

        public List<Path> getCopyPaths() {
            return paths;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Path newTarget = target.resolve(source.relativize(dir));
            boolean newTargetIsOneLevelBelowTarget = !target.equals(newTarget)
                    && newTarget.getParent().equals(target);

            if (newTargetIsOneLevelBelowTarget) {
                paths.add(newTarget);
            }

            if (!Files.exists(newTarget)) {
                Files.createDirectory(newTarget);
            }

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.copy(file, target.resolve(source.relativize(file)),
                    StandardCopyOption.REPLACE_EXISTING);
            return FileVisitResult.CONTINUE;
        }
    }

}
