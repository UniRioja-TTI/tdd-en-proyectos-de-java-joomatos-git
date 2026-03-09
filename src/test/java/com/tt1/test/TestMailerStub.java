package com.tt1.test;

import com.tt1.test.mocks.MailerMock;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TestMailerStub {

    private MailerMock mailer;

    @BeforeEach
    void setUp() {
        mailer = new MailerMock();
        mailer.enviarMail();
    }

    @AfterEach
    void tearDown() {
        mailer = null;
    }

    @Test
    void testEnviarMailDevuelveTrue() {
        assertTrue(mailer.enviarMail());
    }

    @Test
    void testMailEnviadoenSetUphasidoenviado(){
        assertTrue(mailer.isSent());
    }
}