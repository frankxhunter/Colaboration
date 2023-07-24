package ourTools;

import java.io.File;
import java.io.FileNotFoundException;

public class Validation {
    public static void existFile(File file) throws FileNotFoundException {
        if(!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath()+" (El sistema no puede encontrar la ruta especificada)");
    }
}
