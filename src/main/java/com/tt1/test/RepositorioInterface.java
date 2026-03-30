package com.tt1.test;

import java.util.List;

/**
 * Interfaz que define las operaciones permitidas para la gestión de tareas y correos.
 * Establece el contrato que cualquier implementación de repositorio debe cumplir.
 * * @author JOOMATOS
 * @version 1.0
 */
public interface RepositorioInterface {

    /**
     * Define la especificación para añadir una nueva tarea al sistema.
     * @param todo El objeto ToDo que se desea registrar.
     * @return true si la operación fue exitosa, false en caso contrario.
     */
    boolean addToDo(ToDo todo);

    /**
     * Define la especificación para recuperar una tarea específica.
     * @param nombre El nombre identificador de la tarea.
     * @return El objeto ToDo correspondiente al nombre, o null si no se encuentra.
     */
    ToDo getToDo(String nombre);

    /**
     * Define la especificación para marcar una tarea existente como completada.
     * @param nombre El nombre de la tarea a actualizar.
     * @return true si la tarea se encontró y se marcó como completada.
     */
    boolean completeToDo(String nombre);

    /**
     * Define la especificación para obtener todas las tareas que no han sido finalizadas.
     * @return Una lista de objetos ToDo cuyo estado es pendiente.
     */
    List<ToDo> getPending();

    /**
     * Define la especificación para registrar una nueva dirección de correo electrónico.
     * @param email El String con la dirección de correo a almacenar.
     * @return true si el email se guardó correctamente.
     */
    boolean addMail(String email);

    /**
     * Define la especificación para obtener la lista de todos los correos registrados.
     * @return Una lista de Strings con todas las direcciones de email.
     */
    List<String> getMails();
}