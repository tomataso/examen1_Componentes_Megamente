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
    
    int numTurno = 0;
    int turnosRestantes = 8;
    
    int numAParciales = 0;
    int numATotales = 0;
    
    
    Logica(GestorFormulario gFormulario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Logica() {
    }

    
    
    
    public void generarCodigo() {

        char[] colores = new char[6];

        colores[0] = 'a';
        colores[1] = 'r';
        colores[2] = 'b';
        colores[3] = 'n';
        colores[4] = 'v';
        colores[5] = 'm';

        
        int[] noUsarNum = new int[4];
        
        // Asigna la clave
        for (int i = 0; i < 4; i++) {

            
            int indice = numRandomEntreRango(0, 6);

            noUsarNum[i] = indice;
/*
            while (indice == noUsarNum[0] || indice == noUsarNum[1] || indice == noUsarNum[2] || indice == noUsarNum[3]) {

                indice = numRandomEntreRango(0, 6);

                noUsarNum[i] = indice;

            }
             */   
                 clavePartida[i] = colores[indice];  
                
            
           
            
           

        }

        // Imprime en Consola para prueba la clave
        System.out.println("+ La Clave de la Partida es:");
        for (char c : clavePartida) {
            System.out.println(c);

        }

    }

    private char[] separarCaracteres(String palabra) {

        // Crea un array de strings del tamaño del array
        char[] palabraSeparada = new char[palabra.length()];

        // Copia caracter por caracter en el array
        for (int i = 0; i < palabra.length(); i++) {
            palabraSeparada[i] = palabra.charAt(i);
        }

        
        
        
        // Imprime en Consola para prueba
        
                                    System.out.println("El Separador Uso:");
        for (char c : palabraSeparada) {
            System.out.println(c);

        }

        return palabraSeparada;
    }
    


    public void comparar(String inputUsuario) {

        char[] palabraSeparada = separarCaracteres(inputUsuario);

        int aciertoTotal = 0;
        int aciertoParcial = 0;

        for (int i = 0; i < 4; i++) {

                            if (palabraSeparada[i] == clavePartida[0]) {

                                                if (i == 0) {

                                                    aciertoTotal++;

                                                } else {

                                                  
                                                }
                                                
                                                  aciertoParcial++;

                            } else if (palabraSeparada[i] == clavePartida[1]) {

                                                if (i == 1) {

                                                    aciertoTotal++;

                                                } else {

                                                    
                                                }

                                                
                                                aciertoParcial++;
                                                
                            } else if (palabraSeparada[i] == clavePartida[2]) {

                                                if (i == 2) {

                                                    aciertoTotal++;

                                                } else {

                                                   
                                                }
                                                
                                                 aciertoParcial++;

                            } else if (palabraSeparada[i] == clavePartida[3]) {

                                                if (i == 3) {

                                                    aciertoTotal++;

                                                } else {

                                                   
                                                }

                                                
                                                 aciertoParcial++;
                            } else {
                                
                                // Imprime para prueba
                                    System.out.println("No pego nada");
                            }

            
            
            
            
        }
     
     actualizarDatosPartida(aciertoTotal, aciertoParcial);
     

}    
        
    
    
     
    
    
        int numRandomEntreRango(int min, int max) {

        // Genera Numero Random en un rango determinado.

        return (int) ((Math.random() * (max - min)) + min);

    }


      private void actualizarDatosPartida(int aciertosTotales, int AciertosParciales){
               
          numAParciales = AciertosParciales;
          numATotales = aciertosTotales;
          numTurno = numTurno + 1;
          turnosRestantes = turnosRestantes - 1;
          
          
              // Imprime para prueba
                                    System.out.println("Numero aciertos parciales = " + numAParciales);
                                    System.out.println("Numero aciertos Totales = " +numATotales);
                                    System.out.println("Numero de Turno = " + numTurno);
                                    System.out.println("Numero de Turno Restante= " + turnosRestantes);
               
           }

    public char[] getTextoUsuario() {
        return textoUsuario;
    }

    public void setTextoUsuario(char[] textoUsuario) {
        this.textoUsuario = textoUsuario;
    }

    public char[] getClavePartida() {
        return clavePartida;
    }

    public void setClavePartida(char[] clavePartida) {
        this.clavePartida = clavePartida;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public int getTurnosRestantes() {
        return turnosRestantes;
    }

    public void setTurnosRestantes(int turnosRestantes) {
        this.turnosRestantes = turnosRestantes;
    }

    public int getNumAParciales() {
        return numAParciales;
    }

    public void setNumAParciales(int numAParciales) {
        this.numAParciales = numAParciales;
    }

    public int getNumATotales() {
        return numATotales;
    }

    public void setNumATotales(int numATotales) {
        this.numATotales = numATotales;
    }

        
      
      
      
        }
    
    
    
    

