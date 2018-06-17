package Util;

/**
 *
 * @author JR
 */
public class PasswordInvalidoException extends Exception {
    public PasswordInvalidoException(){}
    
    public PasswordInvalidoException(String message){
        super(message);
    }
}
