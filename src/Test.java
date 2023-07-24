import CodeMan_Compress.CodeMan;

import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;

public class Test {

    public static void main(String[] args) {
        //Prueba Real del metodo
        try {
            File entrada= CodeMan.compress(new File("C:\\Comprimir\\prueba.txt"), "C:\\Comprimir\\", 700,10000, 12 );
//            File salida= CodeMan.descompress(new File("C:\\Comprimir\\prueba.cod"), "C:\\Comprimir\\");



        }
        catch (StreamCorruptedException e) {
            System.out.println("Archivo corrupto o dañado");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
