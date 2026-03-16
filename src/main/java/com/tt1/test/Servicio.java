package com.tt1.test;

import java.util.List;

public class Servicio {
    private RepositorioInterface repositorio;
    private MailerInterface mailer;

    public Servicio(RepositorioInterface repositorio, MailerInterface mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

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

    public boolean addMail(String email) {
        if(email==null){
            return false;
        }
        if(!email.contains("@")){
            return false;
        }
        return repositorio.addMail(email);
    }

    public boolean completeToDo(String nombre) {
        return repositorio.completeToDo(nombre);
    }

    public List<ToDo> listPending() {
        return repositorio.getPending();
    }
}