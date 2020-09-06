package com.wtdev.courtcounter;

public class Contadores {
   private int aumento;
   private String contadorActual;
   private int contadorFinal;

    public Contadores(int aumento, String contadorActual) {
        this.aumento = aumento;
        this.contadorActual = contadorActual;
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }

    public String getContadorActual() {
        return contadorActual;
    }

    public void setContadorActual(String contadorActual) {
        this.contadorActual = contadorActual;
    }

    public int getContadorFinal() {
        return contadorFinal;
    }

    public void setContadorFinal(int contadorFinal) {
        this.contadorFinal = contadorFinal;
    }
    public int Accion(){
        this.contadorFinal = Integer.parseInt(this.contadorActual);
        contadorFinal = contadorFinal + aumento;
        return contadorFinal;
    }
}
