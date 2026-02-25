package com.tt1.test;

public class MailerStub {

    public static boolean enviarCorreo(String direccion, String mensaje){
        System.out.println(direccion);
        System.out.println(mensaje);
        return true;
    }

}
