package com.tt1.test;

import java.util.List;

public interface RepositorioInterface {
    boolean addToDo(ToDo todo);
    ToDo getToDo(String nombre);
    boolean completeToDo(String nombre);
    List<ToDo> getPending();
    boolean addMail(String email);
    List<String> getMails();
}