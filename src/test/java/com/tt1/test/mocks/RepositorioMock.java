package com.tt1.test.mocks;

import com.tt1.test.RepositorioInterface;
import com.tt1.test.ToDo;

import java.util.*;

public class RepositorioMock implements RepositorioInterface {

    private final Map<String, ToDo> tasks = new HashMap<>();
    private final List<String> mails = new ArrayList<>();

    public RepositorioMock(){

    }

    @Override
    public boolean addToDo(ToDo todo) {
        tasks.put(todo.getNombre(), todo);
        return true;
    }

    @Override
    public ToDo getToDo(String nombre) {
        return tasks.get(nombre);
    }

    @Override
    public boolean completeToDo(String nombre) {
        ToDo t = tasks.get(nombre);
        if (t == null) return false;
        t.setCompletado(true);
        return true;
    }

    @Override
    public List<ToDo> getPending() {
        List<ToDo> pendientes = new ArrayList<>();
        for (ToDo t : tasks.values()) {
            if (!t.getCompletado()) pendientes.add(t);
        }
        return pendientes;
    }

    @Override
    public boolean addMail(String email) {
        mails.add(email);
        return true;
    }

    @Override
    public List<String> getMails() {
        return mails;
    }
}