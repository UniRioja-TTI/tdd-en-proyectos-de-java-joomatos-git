package com.tt1.test;

import com.tt1.test.mocks.RepositorioMock;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRepositorio {

    private RepositorioMock repositorio;
    private ToDo todo;

    @BeforeEach
    void setUp() {
        todo = new ToDo("Tarea1", "Desc", "2025-06-01");
        repositorio = new RepositorioMock();
    }

    @AfterEach
    void tearDown() {
        repositorio = null;
    }

    @Test
    void testGuardarYEncontrarTodo() {
        repositorio.addToDo(todo);
        assertEquals(todo, repositorio.getToDo("Tarea1"));
    }
}

/* hola */

