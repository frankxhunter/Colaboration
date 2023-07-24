/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LZ77_GraphCompress;

import HuffmanCompress.HuffmanBytes;
import ourTools.Convert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Bender
 */
public class Test {

    public static void cantidadCoincidencias(ArrayList<Nodo> grafo){
        int x= 0;
        int pos=0;
        int numeroAristas=0;
        int longitudreducida=0;
        int nuevalong=0;
        for (Nodo s : grafo) {
            nuevalong+=s.getBloque().length;
            if(s.getEnlace().size()>0) {

                for (Enlace z : s.getEnlace()){
                    numeroAristas++;
                   longitudreducida+=z.getLongitud();
            }

            }
        pos++;
        }
        System.out.println("Longitud total: "+nuevalong);
        System.out.println("numero de aristas: "+numeroAristas);
        System.out.println("Coincidencias long: "+longitudreducida);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File a = new File("adelanto.docx");
//        File a = new File("prueba.txt");
          File a = new File("adelanto.docx");
          RandomAccessFile raf= new RandomAccessFile(a , "rw");
          byte[]infoOriginal= new byte[(int)raf.length()];
          raf.read(infoOriginal);
          raf.close();
//         TODO code application logic here
         raf = new RandomAccessFile(a, "rw");

        //Obtengo el grafo
        Grafo graph = Compresor_FF.separar_en_bloques_convertir_en_grafos(raf, (int)raf.length(), 500,
                500, 100);
        raf.close();
        //Serilizo el grafo
        LinkedList<byte[]> serializarGrafo= Convert.SerializarGrafo(graph);


        /////
            Grafo grafo = Convert.obtainGraphToSerialization(serializarGrafo);
            byte[] info2= Compresor_FF.graphToInfo(grafo);
            if(Arrays.equals(infoOriginal,info2))
                System.out.println("yes");
            else
                System.out.println("no");
        /////

        //Uso huffman para comprimir el grafo, la parte de la informacion
        LinkedList<byte[]> huffmanCompress= HuffmanBytes.HuffmanBytesCompress(serializarGrafo.get(1));
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Descomprimir con huffman
        LinkedList<byte[]> listaGrafo = new LinkedList<>();
        listaGrafo.add(HuffmanBytes.HuffmanBytesDescompress(huffmanCompress));

        listaGrafo.addFirst( serializarGrafo.get(0));

        //Obtengo el grafo
        Grafo graph2= Convert.obtainGraphToSerialization(listaGrafo);
        byte[] infoFinal= Compresor_FF.graphToInfo(graph2);

        if(comparaGrafos(graph, graph2))
            System.out.println("yes");

        System.out.println();
        if(Arrays.equals(infoFinal, infoOriginal))
            System.out.println("yes");
        else {
            System.out.println("no");
            System.out.println("Info original: "+ infoOriginal.length);

            System.out.println("Info final: "+ infoFinal.length);
        }
    }
    public static boolean comparaGrafos(Grafo graph, Grafo grafo3){
        boolean iguales = true;
        for (int i=0; i<grafo3.getListaVertices().size() && iguales;i++)
            if(!Arrays.equals(graph.getListaVertices().get(i).getBloque(), grafo3.getListaVertices().get(i).getBloque()))
                iguales= false;

        return iguales;
    }

    }


