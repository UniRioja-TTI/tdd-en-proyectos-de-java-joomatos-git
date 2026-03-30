package com.tt1.test;

/**
 * Esta clase representa una tarea individual.
 * @author JOOMATOS
 * @version 1.0
 */
public class ToDo {
    private String nombre;
    private String descripcion;
    private String fecha;
    private Boolean completado;

    /**
     * Constructor por defecto de la clase ToDo.
     */
    public ToDo() {}

    /**
     * Constructor con parámetros para inicializar una tarea.
     * Al crearse, el estado de la tarea se establece automáticamente como no completado.
     * @param n El nombre de la tarea.
     * @param d La descripción detallada de la tarea.
     * @param f La fecha límite en formato YYYY/MM/DD.
     */
    public ToDo(String n, String d, String f){
        this.nombre=n;
        this.descripcion=d;
        this.fecha=f; //formato YYYY/MM/DD
        this.completado=false;
    }

    /**
     * Obtiene el nombre de la tarea.
     * @return El nombre de la tarea.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Establece el nombre de la tarea.
     * @param n El nuevo nombre de la tarea.
     */
    public void setNombre(String n){
        this.nombre=n;
    }

    /**
     * Obtiene la descripción de la tarea.
     * @return La descripción actual.
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * Establece la descripción de la tarea.
     * @param n El nuevo texto descriptivo.
     */
    public void setDescripcion(String n){
        this.descripcion=n;
    }

    /**
     * Obtiene la fecha límite de la tarea.
     * @return La fecha en formato String.
     */
    public String getFecha(){
        return this.fecha;
    }

    /**
     * Establece la fecha límite de la tarea.
     * @param n La nueva fecha en formato YYYY/MM/DD.
     */
    public void setFecha(String n){
        this.fecha=n;
    }

    /**
     * Establece el estado de finalización de la tarea.
     * @param n Verdadero si está completada, falso si está pendiente.
     */
    public void setCompletado(Boolean n){
        this.completado=n;
    }

    /**
     * Indica si la tarea ha sido completada o no.
     * @return El estado booleano de la tarea.
     */
    public Boolean getCompletado(){
        return this.completado;
    }
}