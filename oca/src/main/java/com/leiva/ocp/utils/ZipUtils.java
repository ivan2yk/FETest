package com.leiva.ocp.utils;

import java.io.IOException;
import java.nio.file.Path;

public interface ZipUtils {

    void unzip(Path zip, Path target) throws IOException;

}
