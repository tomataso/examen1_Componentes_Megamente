/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.componentes.controlMegamenteVisual;
import java.util.ArrayList; 



public class Logica {

    
   // ArrayList<String> clave = new ArrayList<String>();
    
    char[]   textoUsuario = new char [4]; 
    char[]   clavePartida = new char [4]; 
    
    
    Logica(GestorFormulario gFormulario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      void generarCodigo(){
        
       char[]  colores = new char [6]; 
       
          colores[0] = 'a';
          colores[1] = 'r';
          colores[2] = 'b';
          colores[3] = 'n';
          colores[4] = 'v';
          colores[5] = 'm';

          
          // Asigna la clave
          for (int i = 0; i < 4; i++) { 
           
            clavePartida[i] =  colores[numRandomEntreRango(0,6)];
              
        } 
          
           // Imprime en Consola para prueba la clave
        for (char c : clavePartida) { 
            System.out.println(c); 
               
        } 
          
          
    }
    
 
    
    
    
        char[] separarCaracteres(String palabra){
        
        // Crea un array de strings del tamaño del array
        char[] palabraSeparada = new char[palabra.length()]; 
  
        // Copia caracter por caracter en el array
        for (int i = 0; i < palabra.length(); i++) { 
            palabraSeparada[i] = palabra.charAt(i); 
        } 
  
        // Imprime en Consola para prueba
        for (char c : palabraSeparada) { 
            System.out.println(c); 
               
        } 
        
        
      
        
        return palabraSeparada;
    } 
    


 void comparar(){



}    
        
    
       public int numRandomEntreRango(int min, int max) {

        // Genera Numero Random en un rango determinado.

        return (int) ((Math.random() * (max - min)) + min);

    }




        
        }
    
    
    
    

