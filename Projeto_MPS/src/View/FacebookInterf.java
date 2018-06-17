/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Junior Ribeiro
 */
public interface FacebookInterf extends RedeSocial {

    void autenticar(String sigaalogin, String sigaapw);

    void notificar(String login, String post);

    void postar(String login, String post);
}
