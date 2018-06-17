package Util;

/**
 *
 * @author JR
 */
public class Validador {

    public static void validateName(String login) throws LoginInvalidoException {

        if (login.length() > 20 || login.length() == 0) {
            throw new LoginInvalidoException(" Login Inválido - O login precisa ter entre 0 e 20 caracteres.");
        } else if (login.matches(".*[0-9].*")) {
            throw new LoginInvalidoException("Login Inválido - O Login não pode conter números");
        }
    }

    public static void validatePassword(String senha) throws PasswordInvalidoException {
        if (senha.length()> 12 || senha.length() < 8) {
            throw new PasswordInvalidoException("Senha Inválida: Sua senha precisa ter entre 8 e 12 caracteres");
        } else if (!(senha.matches( "..*[0-9].*[0-9].*"))) {
            throw new PasswordInvalidoException("Senha Inválida: A senha deve conter 2 numeros.");

        }
    }

}
