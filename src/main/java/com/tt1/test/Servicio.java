package com.tt1.test;

import java.util.List;

public class Servicio {
    private RepositorioInterface repositorio;
    private MailerInterface mailer;

    public Servicio(RepositorioInterface repositorio, MailerInterface mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public boolean crearTodo(String nombre, String fechaLimite) {
        if (nombre == null || nombre.isEmpty()) return false;
        ToDo todo = new ToDo(nombre, "", fechaLimite);
        return repositorio.addToDo(todo);
    }

    public boolean añadirEmail(String email) {
        if (email == null || !email.contains("@")) return false;
        return repositorio.addMail(email);
    }

    public boolean marcarCompletada(String nombre) {
        return repositorio.completeToDo(nombre);
    }

    public List<ToDo> listarPendientes() {
        return repositorio.getPending();
    }
}