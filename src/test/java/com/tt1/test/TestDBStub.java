package com.tt1.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TestDBStub {

    private DBStub db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
    }

    @AfterEach
    void tearDown() {
        db = null;
    }

    @Test
    void testCrearYBuscarTodo() {
        ToDo todo = new ToDo("Leer", "Libro de Java", "2025-07-01");
        db.createTarea(todo);
        assertEquals(todo, db.getTarea("Leer"));
    }

    @Test
    void testBuscarTodoInexistente() {
        assertNull(db.getTarea("NoExiste"));
    }

    @Test
    void testGetTodosDevuelveLista() {
        db.createTarea(new ToDo("T1", "desc", "2025-07-01"));
        db.createTarea(new ToDo("T2", "desc", "2025-07-01"));
        assertEquals(2, db.listTareas().size());
    }

    @Test
    void testAñadirEmail() {
        assertTrue(db.createMail("joomatos@unirioja.es"));
        assertEquals(1, db.getMails().size());
    }

    @Test
    void testAñadirEmailNuloDevuelveFalse() {
        assertFalse(db.createMail(null));
    }
}