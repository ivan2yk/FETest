package com.leiva.ocp.utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileUtils {

    void delete(Path source) throws IOException;

    List<Path> copy(Path source, Path target) throws IOException;

    boolean pathExists(Path path);

}
