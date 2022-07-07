/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author invitado
 */
public class AnalizadorDeArchivo {
    private int numPalabras;
    private int numLineas;
    private int numPalabraEspecifica;
    private int numLetraEspecifica;
    
    String palabraEspecifica;
    String letraEspecifica;
    
    StringTokenizer cadenaToken;
    
    File archivo;
    String line;
    
    public AnalizadorDeArchivo(){
        try{
            archivo = new File("src/archivos/cotizacion_5.txt");
            
        }catch(Exception e) {
            System.out.println("Error, archivo no encontrado");
        }
        numLetraEspecifica = 0;
        numPalabraEspecifica = 0;
        numLineas = 0;
        numPalabras = 0;
    }
    
    public void setPalabraEspecifica(String palabra){
        palabraEspecifica = palabra;
    }
    
    public void setLetraEspecifica(String letra){
        letraEspecifica = letra;
    }
    
    public void calcularNumPalabras() throws IOException{
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while( (line = br.readLine()) != null){
            cadenaToken = new StringTokenizer(line, " ");
            int total = cadenaToken.countTokens();
            numPalabras += total;
        }  
    }
    
    public void calcularNumLineas() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while((line = br.readLine()) != null){
            numLineas += 1;
        }
    }
    
    public void calcularPalabraEspecifica() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while( (line = br.readLine()) != null){
            cadenaToken = new StringTokenizer(line, " ");
            while(cadenaToken.hasMoreTokens()){
                if(palabraEspecifica.equals(cadenaToken.nextToken())){
                    numPalabraEspecifica += 1;
                }
            }
        }  
    }
    
    public void calcularletrasEspecifica() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while( (line = br.readLine()) != null){
            cadenaToken = new StringTokenizer(line, " ");
            while(cadenaToken.hasMoreTokens()){
                String aux = Character.toString(cadenaToken.nextToken().charAt(0));
                if(aux.equals(letraEspecifica)){
                    numLetraEspecifica += 1;
                }
            }
        }  
    }

    public int getNumPalabras() {
        return numPalabras;
    }

    public int getNumLineas() {
        return numLineas;
    }

    public int getNumPalabraEspecifica() {
        return numPalabraEspecifica;
    }

    public int getNumLetraEspecifica() {
        return numLetraEspecifica;
    }
}
