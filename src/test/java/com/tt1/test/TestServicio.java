package com.tt1.test;


import com.tt1.test.mocks.MailerMock;
import com.tt1.test.mocks.RepositorioMock;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestServicio {

    private Servicio servicio;
    private MailerMock MailerMock;
    private RepositorioMock RepositorioMock;

    @BeforeEach
    void setUp() {
        MailerMock = new MailerMock();
        RepositorioMock = new RepositorioMock();
        servicio = new Servicio(RepositorioMock, MailerMock);
    }

    @AfterEach
    void tearDown() {
        servicio = null;
        MailerMock = null;
        RepositorioMock = null;
    }

    @Test
    void testCreateToDo() {
        assertTrue(servicio.createToDo("mailejemplo", "2026/03/16"));
    }



    @Test
    void testNameNull() {
        servicio.createToDo(null, "2026-10-03");
        assertFalse(MailerMock.isSent());
    }

    @Test
    void testAddMail() {
        assertTrue(servicio.addMail("mailejemplo@gmail.com"));
    }

    @Test
    void testAddMailInvalido() {
        assertFalse(servicio.addMail("correo"));
    }

    @Test
    void testCompletar() {
        servicio.createToDo("task1", "2026/03/16");
        assertTrue(servicio.completeToDo("task1"));
    }

    @Test
    void testPendingSoloPending() {
        servicio.createToDo("pending", "2026/03/16");
        servicio.createToDo("done", "2026/03/16");
        servicio.completeToDo("done");

        List<ToDo> pending = servicio.listPending();
        assertEquals(1, pending.size());
        assertEquals("pending", pending.get(0).getNombre());
    }


}
