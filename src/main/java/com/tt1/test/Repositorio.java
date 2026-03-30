package com.tt1.test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase actúa como repositorio para gestionar las operaciones de la base de datos.
 * Implementa la interfaz RepositorioInterface y utiliza un DBStub como fuente de datos.
 * @author JOOMATOS
 * @version 1.0
 */
public class Repositorio implements RepositorioInterface {

    private DBStub db;

    /**
     * Constructor de la clase Repositorio.
     * @param db La instancia de DBStub que se utilizará como base de datos.
     */
    public Repositorio(DBStub db) {
        this.db = db;
    }

    /**
     * Este método añade una nueva tarea al repositorio.
     * @param todo El objeto ToDo que se desea guardar.
     * @return true si la tarea se creó correctamente, false en caso contrario.
     */
    public boolean addToDo(ToDo todo) {
        return db.createTarea(todo);
    }

    /**
     * Este método busca y devuelve una tarea específica por su nombre.
     * @param nombre El nombre de la tarea a buscar.
     * @return El objeto ToDo encontrado o null si no existe.
     */
    public ToDo getToDo(String nombre) {
        return db.getTarea(nombre);
    }

    /**
     * Este método marca una tarea como completada.
     * @param nombre El nombre de la tarea que se desea completar.
     * @return true si la tarea existía y se pudo actualizar, false si no se encontró.
     */
    public boolean completeToDo(String nombre) {
        ToDo todo = db.getTarea(nombre);
        if (todo == null) return false;
        todo.setCompletado(true);
        return db.updateTarea(todo);
    }

    /**
     * Este método obtiene una lista de todas las tareas que aún no han sido completadas.
     * @return Una lista de objetos ToDo cuyo estado de completado es falso.
     */
    public List<ToDo> getPending() {
        return db.listTareas().stream()
            .filter(t -> !t.getCompletado())
            .collect(Collectors.toList());
    }

    /**
     * Este método registra un nuevo email en la base de datos.
     * @param email El String con la dirección de correo a guardar.
     * @return true si el email se añadió correctamente.
     */
    public boolean addMail(String email) {
        return db.createMail(email);
    }

    /**
     * Este método obtiene la lista completa de emails registrados.
     * @return Una lista de Strings conteniendo todos los emails.
     */
    public List<String> getMails() {
        return db.getMails();
    }
}