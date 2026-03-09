package com.tt1.test;

public class MailerStub implements MailerInterface {

    private String dir;
    private String mensaje;
    public MailerStub(String dir, String mensaje){
        this.dir=dir;
        this.mensaje=mensaje;
    }

    @Override
    public Boolean enviarMail(){
        System.out.println(this.dir+": "+this.mensaje);
        return true;
    }


}
