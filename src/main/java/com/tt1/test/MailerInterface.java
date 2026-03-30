package com.tt1.test;

/**
 * Interfaz que define el contrato para el envío de correos electrónicos.
 * @author JOOMATOS
 * @version 1.0
 */
public interface MailerInterface {

    /**
     * Define la especificación para el método de envío de un correo.
     * * @return Boolean indicando si el proceso de envío se inició correctamente.
     */
    Boolean enviarMail();
}