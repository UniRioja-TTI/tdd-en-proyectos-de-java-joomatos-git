package com.tt1.test;

import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestServicioIntegracion {

    private Servicio servicio;

    @BeforeEach
    void setUp() {
        Repositorio repositorio = new Repositorio(new DBStub());
        MailerStub mailer = new MailerStub("joomatos@unirioja.com", "test1");
        servicio = new Servicio(repositorio, mailer);
    }

    @AfterEach
    void tearDown() {
        servicio = null;
    }

    @Test
    void testFlujoCompletoCrearYListar() {
        servicio.crearTodo("Tarea1", "2025-08-01");
        servicio.crearTodo("Tarea2", "2025-08-01");

        List<ToDo> pendientes = servicio.listarPendientes();
        assertEquals(2, pendientes.size());
    }

    @Test
    void testFlujoCompletoMarcarCompletada() {
        servicio.crearTodo("Tarea1", "2025-08-01");
        servicio.marcarCompletada("Tarea1");

        List<ToDo> pendientes = servicio.listarPendientes();
        assertEquals(0, pendientes.size());
    }
}