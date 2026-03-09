package com.tt1.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBStub {

    private Map<String, ToDo> tareas = new HashMap<>();
    private List<String> mails = new ArrayList<>();

    public boolean createTarea(ToDo todo) {
        if (todo == null || todo.getNombre() == null) return false;
        tareas.put(todo.getNombre(), todo);
        return true;
    }

    public ToDo getTarea(String nombre) {
        return tareas.get(nombre);
    }

    public List<ToDo> listTareas() {
        return new ArrayList<>(tareas.values());
    }

    public boolean updateTarea(ToDo todo) {
        if (!tareas.containsKey(todo.getNombre())) return false;
        tareas.put(todo.getNombre(), todo);
        return true;
    }

    public boolean deleteTodo(String nombre) {
        return tareas.remove(nombre) != null;
    }
    public boolean createMail(String email) {
        if (email == null || email.isEmpty()) return false;
        mails.add(email);
        return true;
    }

    public List<String> getMails() {
        return new ArrayList<>(mails);
    }
}