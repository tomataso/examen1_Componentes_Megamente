/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.componentes.controlMegamenteVisual;

/**
 *
 * @author tomat
 */
public class GestorFormulario {
    
    
    String inputUsuario;
    String  numTurno;
    String aciertosParciales;
    String aciertosTotales;
    String intentosRestantes;
    
    int estadoPartatida = 3;

   
    
      Logica logic = new Logica();

    public GestorFormulario() {
    }

    public GestorFormulario(String inputUsuario, String numTurno, String aciertosParciales, String aciertosTotales, String intentosRestantes) {
        this.inputUsuario = inputUsuario;
        this.numTurno = numTurno;
        this.aciertosParciales = aciertosParciales;
        this.aciertosTotales = aciertosTotales;
        this.intentosRestantes = intentosRestantes;
    }
    
    
    public void iniciarJuego(){
        
        logic.generarCodigo();
        
        
        
    }
    
    public void revisarJugada(String inputUsuario){
        
        // Aca se lleva a la logica para que se compare y se hace minuscula para que sea digerible por la rutina.
        
        logic.comparar(inputUsuario.toLowerCase());
        actualizarDatos();
    }
    
    public void actualizarDatos(){
        
        numTurno = Integer.toString(logic.getNumTurno());
        intentosRestantes = Integer.toString(logic.getTurnosRestantes());
        aciertosParciales = Integer.toString(logic.getNumAParciales());
        aciertosTotales = Integer.toString(logic.getNumATotales());
        
        setEstadoPartatida(logic.ganoOPerdio());
      
        
        
    }
    
    public void resetJuego(){
        
        
        logic.setEstadoPartida(3);
        logic.setNumTurno(0);
        logic.setNumAParciales(0);
        logic.setNumATotales(0);
        logic.setTurnosRestantes(8);
    }
    

    public String getInputUsuario() {
        return inputUsuario;
    }

    public void setInputUsuario(String inputUsuario) {
        this.inputUsuario = inputUsuario;
    }

    public String getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(String numTurno) {
        this.numTurno = numTurno;
    }

    public String getAciertosParciales() {
        return aciertosParciales;
    }

    public void setAciertosParciales(String aciertosParciales) {
        this.aciertosParciales = aciertosParciales;
    }

    public String getAciertosTotales() {
        return aciertosTotales;
    }

    public void setAciertosTotales(String aciertosTotales) {
        this.aciertosTotales = aciertosTotales;
    }

    public String getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(String intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    
     public int getEstadoPartatida() {
        return estadoPartatida;
    }

    public void setEstadoPartatida(int estadoPartatida) {
        this.estadoPartatida = estadoPartatida;
    }
}
