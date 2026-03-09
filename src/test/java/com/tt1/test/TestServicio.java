package com.tt1.test;

import org.junit.jupiter.api.*;

import com.tt1.test.mocks.MailerMock;
import com.tt1.test.mocks.RepositorioMock;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestServicio {

    private Servicio servicio;

    @BeforeEach
    void setUp() {
        servicio = new Servicio(new RepositorioMock(), new MailerMock());
    }

    @AfterEach
    void tearDown() {
        servicio = null;
    }

    @Test
    void testCrearTodoDevuelveTrue() {
        assertTrue(servicio.crearTodo("Limpiar coche", "2026-05-28"));
    }

    @Test
    void testAñadirEmailDevuelveTrue() {
        assertTrue(servicio.añadirEmail("jmomatosa@unirioja.es"));
    }

    @Test
    void testMarcarCompletadaDevuelveTrue() {
        servicio.crearTodo("Limpiar coche", "2026-05-28");
        assertTrue(servicio.marcarCompletada("Limpiar coche"));
    }

    @Test
    void testListarPendientess() {
        servicio.crearTodo("Pendiente", "2026-05-28");
        servicio.crearTodo("Hecha", "2026-04-21");
        servicio.marcarCompletada("Hecha");

        List<ToDo> pendientes = servicio.listarPendientes();
        assertEquals(1, pendientes.size());
        assertEquals("Pendiente", pendientes.getFirst().getNombre());
    }
}