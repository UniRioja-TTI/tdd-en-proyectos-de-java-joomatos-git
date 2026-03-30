package com.tt1.test;

/**
 * Esta clase es una implementación de prueba de la interfaz MailerInterface.
 * Se utiliza para simular el envío de correos imprimiendo por consola.
 * * @author JOOMATOS
 * @version 1.0
 */
public class MailerStub implements MailerInterface {

    private String dir;
    private String mensaje;

    /**
     * Constructor de la clase MailerStub.
     * @param dir La dirección de correo electrónico del destinatario.
     * @param mensaje El cuerpo del mensaje a enviar.
     */
    public MailerStub(String dir, String mensaje){
        this.dir = dir;
        this.mensaje = mensaje;
    }

    /**
     * Este método simula el envío de un correo mostrando el destinatario y el mensaje por consola
     * @return Devuelve siempre true tras realizar el print.
     */
    @Override
    public Boolean enviarMail(){
        System.out.println(this.dir + ": " + this.mensaje);
        return true;
    }
}