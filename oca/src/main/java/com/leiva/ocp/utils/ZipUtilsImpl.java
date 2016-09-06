package com.leiva.ocp.utils;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public final class ZipUtilsImpl implements ZipUtils {

    @Override
    public void unzip(Path zip, Path target) throws IOException {
        if (Files.notExists(target)) {
            Files.createDirectories(target);
        }

        try (FileSystem fs = FileSystems.newFileSystem(zip, null)) {
            Path root = fs.getPath("/");
            Files.walkFileTree(root, new UnzipFileVisitor(target));
        }
    }

    private static final class UnzipFileVisitor extends SimpleFileVisitor<Path> {

        private final Path target;

        private UnzipFileVisitor(Path target) {
            this.target = target;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Path destFile = Paths.get(target.toString(), file.toString());
            Files.copy(file, destFile, StandardCopyOption.REPLACE_EXISTING);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Path dirToCreate = Paths.get(target.toString(), dir.toString());
            if (Files.notExists(dirToCreate)) {
                Files.createDirectory(dirToCreate);
            }
            return FileVisitResult.CONTINUE;
        }

    }

}
