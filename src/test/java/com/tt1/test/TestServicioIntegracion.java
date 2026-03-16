package com.tt1.test;

import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestServicioIntegracion {

    private Servicio servicio;

    @BeforeEach
    void setUp() {
        Repositorio repositorio = new Repositorio(new DBStub());
        MailerStub mailer = new MailerStub("mailejemplo@gmail.com", "aaaaa");
        servicio = new Servicio(repositorio, mailer);
    }

    @AfterEach
    void tearDown() {
        servicio = null;
    }



    @Test
    void testCreateComplete() {
        servicio.createToDo("task1", "2026/16/03");
        servicio.completeToDo("task1");

        List<ToDo> pendientes = servicio.listPending();
        assertEquals(0, pendientes.size());
    }

    @Test
    void testCreateListpending() {
        servicio.createToDo("task1", "2026/16/03");
        servicio.createToDo("task2", "2026/16/03");

        List<ToDo> pending = servicio.listPending();
        assertEquals(2, pending.size());
    }

    @Test
    void testCreateCompleteListPending(){
        servicio.createToDo("taskToBeCompleted","2026/16/03");
        servicio.createToDo("task1", "2026/16/03");
        servicio.completeToDo("taskToBeCompleted");

        List<ToDo> pending = servicio.listPending();
        assertEquals(1, pending.size());
        assertEquals("task1", pending.get(0).getNombre());

    }
}