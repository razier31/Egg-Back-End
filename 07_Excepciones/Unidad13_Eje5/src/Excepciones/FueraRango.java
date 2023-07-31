/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Ramiro
 */
public class FueraRango extends Exception {

    /**
     * Creates a new instance of <code>FueraRango</code> without detail message.
     */
    public FueraRango() {
    }

    /**
     * Constructs an instance of <code>FueraRango</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public FueraRango(String msg) {
        super(msg);
    }
}
