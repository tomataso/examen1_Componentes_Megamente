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
public class gestorFormulario {
    
    
    String inputUsuario;
    String numTurno;
    String aciertosParciales;
    String aciertosTotales;
    String intentosRestantes;

    public gestorFormulario(String inputUsuario, String numTurno, String aciertosParciales, String aciertosTotales, String intentosRestantes) {
        this.inputUsuario = inputUsuario;
        this.numTurno = numTurno;
        this.aciertosParciales = aciertosParciales;
        this.aciertosTotales = aciertosTotales;
        this.intentosRestantes = intentosRestantes;
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




    
}
