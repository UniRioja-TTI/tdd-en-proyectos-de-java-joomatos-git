package com.tt1.test;
import java.util.List;
import java.util.stream.Collectors;

public class Repositorio implements RepositorioInterface {

    private DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }

    public boolean addToDo(ToDo todo) {
        return db.createTarea(todo);
    }

    public ToDo getToDo(String nombre) {
        return db.getTarea(nombre);
    }

    public boolean completeToDo(String nombre) {
        ToDo todo = db.getTarea(nombre);
        if (todo == null) return false;
        todo.setCompletado(true);
        return db.updateTarea(todo);
    }

    public List<ToDo> getPending() {
        return db.listTareas().stream()
            .filter(t -> !t.getCompletado())
            .collect(Collectors.toList());
    }

    public boolean addMail(String email) {
        return db.createMail(email);
    }

    public List<String> getMails() {
        return db.getMails();
    }
}