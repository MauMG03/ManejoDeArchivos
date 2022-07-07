/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_archivosdetexto;

import java.io.IOException;
import java.util.Scanner;
import modelo.AnalizadorDeArchivo;

/**
 *
 * @author invitado
 */
public class Ejercicio_ArchivosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        AnalizadorDeArchivo miArchivo = new AnalizadorDeArchivo();
        
        System.out.println("Bienvenido, vamos a verificar algunas caracteristicas del archivo corizacion_5.txt");
        System.out.println("Ingrese la opcion para realizar lo que desee");
        
        System.out.println("1) calcular numero de palabras.\n"
                + "2) calcular numero de lineas.\n"
                + "3) calcular el numero de veces que aparece una palabra.\n"
                + "4) calcular el numero de palabras que empiezan con una letra.\n");
        
        Scanner sc = new Scanner(System.in);
        int opcion = Integer.parseInt(sc.next());
        
        switch(opcion){
            case 1:
                miArchivo.calcularNumPalabras();
                System.out.println("El numero de palabras es de " + miArchivo.getNumPalabras());
                break;
            case 2:
                miArchivo.calcularNumLineas();
                System.out.println("El numero de lineas es de " +miArchivo.getNumLineas());
                break;
            case 3:
                Scanner aux = new Scanner(System.in);
                System.out.println("Introduce la palabra que deseas:");
                String auxString = sc.next();
                miArchivo.setPalabraEspecifica(auxString);
                System.out.println("El numero de veces que se repite la palabra es de " 
                                 + miArchivo.getNumPalabraEspecifica());
                break;
            case 4:
                
        }
        
        
        
        
        
        miArchivo.calcularPalabraEspecifica();
        
        miArchivo.setLetraEspecifica("C");
        miArchivo.calcularletrasEspecifica();
        
        
        
        
        System.out.println(miArchivo.getNumLetraEspecifica());
    }
    
}
