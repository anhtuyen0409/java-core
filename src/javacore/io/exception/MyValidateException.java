/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.io.exception;

/**
 *
 * @author HS
 */
public class MyValidateException extends RuntimeException{
    
    private static final long serialVersID = 1L;
    
    public MyValidateException(String msg){
        super(msg);
    }
}
