package com.tt1.test;

import java.util.List;

/**
 * Esta clase proporciona la lógica de negocio de la aplicación.
 * @author JOOMATOS
 * @version 1.0
 */
public class Servicio {
    private RepositorioInterface repositorio;
    private MailerInterface mailer;

    /**
     * Constructor de la clase Servicio.
     * @param repositorio La implementación del repositorio para el acceso a datos.
     * @param mailer La implementación del servicio de correo para notificaciones.
     */
    public Servicio(RepositorioInterface repositorio, MailerInterface mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    /**
     * Este método crea un nuevo objeto ToDo y lo guarda en el repositorio.
     * Incluye validaciones para asegurar que el nombre no sea nulo ni vacío.
     * @param nombre El nombre identificador de la tarea.
     * @param fechaLimite La fecha tope para finalizar la tarea.
     * @return true si la tarea se creó y guardó correctamente; false si el nombre es inválido.
     */
    public boolean createToDo(String nombre, String fechaLimite) {
        if (nombre == null) {
            return false;
        }
        if (nombre.isEmpty()){
            return false;
        }
        ToDo todo = new ToDo(nombre, "", fechaLimite);
        return repositorio.addToDo(todo);
    }

    /**
     * Este método registra un email en el sistema tras validar su formato básico.
     * @param email La dirección de correo electrónico a registrar.
     * @return true si el email contiene un carácter '@' y se guarda con éxito; false en caso contrario.
     */
    public boolean addMail(String email) {
        if(email==null){
            return false;
        }
        if(!email.contains("@")){
            return false;
        }
        return repositorio.addMail(email);
    }

    /**
     * Este método marca una tarea específica como completada a través del repositorio.
     * @param nombre El nombre de la tarea que se desea completar.
     * @return true si la operación se realizó correctamente.
     */
    public boolean completeToDo(String nombre) {
        return repositorio.completeToDo(nombre);
    }

    /**
     * Este método recupera todas las tareas que aún están pendientes de finalizar.
     * @return Una lista de objetos ToDo con estado incompleto.
     */
    public List<ToDo> listPending() {
        return repositorio.getPending();
    }
}