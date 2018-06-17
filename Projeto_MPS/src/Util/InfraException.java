package Util;

/**
 *
 * @author JR
 */
public class InfraException extends Exception {
   
    public InfraException(){}
	private static final long serialVersionUID = -4176717944228612029L;

    //Exception Constructor
    public InfraException(String message) {
	super(message);
    }
}
