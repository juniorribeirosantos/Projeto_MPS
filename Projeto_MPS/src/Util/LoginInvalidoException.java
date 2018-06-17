package Util;

/**
 *
 * @author JR
 */
public class LoginInvalidoException extends Exception{
   
    public LoginInvalidoException(){}
    
    public LoginInvalidoException(String message){
        super(message);
    }
}
