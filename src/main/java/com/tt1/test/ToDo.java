package com.tt1.test;

import java.util.Date;

public class ToDo {
    private String nombre;
    private String descripcion;
    private String fechaLimite; // YYYY-MM-DD
    private boolean completado;

    private ToDo(){

    }

    private String getNombre(){
        return nombre;
    }
    private void setNombre(String n){
        this.nombre = n;
    }

    private String getDescripcion(){
        return descripcion;
    }
    private void setDescripcion(String d){
        this.descripcion = d;
    }

    private String getFechaLimite(){
        return fechaLimite;
    }
    private void setFechaLimite(String f){
        this.fechaLimite=f;
    }

    private boolean isCompeltado(){
        return completado;
    }
    private void setCompletado(boolean c){
        this.completado=c;
    }
}
