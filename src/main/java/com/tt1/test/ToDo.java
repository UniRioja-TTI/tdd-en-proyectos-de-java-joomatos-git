package com.tt1.test;

import java.util.Date;

public class ToDo {
    private String nombre;
    private String descripcion;
    private String fechaLimite; // YYYY-MM-DD
    private boolean completado;

    public ToDo(){

    }

    public ToDo(String n, String fL){
        this.nombre = n;
        this.fechaLimite=fL;
        this.completado=false;
        this.descripcion="";
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String d){
        this.descripcion = d;
    }

    public String getFechaLimite(){
        return fechaLimite;
    }
    public void setFechaLimite(String f){
        this.fechaLimite=f;
    }

    public boolean isCompeltado(){
        return completado;
    }
    public void setCompletado(boolean c){
        this.completado=c;
    }
}
