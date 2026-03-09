package com.tt1.test.mocks;

import com.tt1.test.MailerInterface;

public class MailerMock implements MailerInterface {
    private String lastMail = null;
    private boolean sent = false;

    public MailerMock(){

    }

    @Override
    public Boolean enviarMail() {
        sent = true;
        return true;
    }
    public boolean isSent() {
        return sent;
    }

    public void reset() {
        sent = false;
    }
}