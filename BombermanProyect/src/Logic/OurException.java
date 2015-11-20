/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author _ADRIAN_
 */
public class OurException extends Exception{

    public OurException() {
        super("Error");
    }
    public OurException(String msg) {
        super(msg);
    }
    
    
}
