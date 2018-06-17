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
public class FacebookAdapter extends API_Facebook implements FacebookInterf {

    public FacebookAdapter(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void autenticar(String sigaalogin, String sigaapw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificar(String login, String post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postar(String login, String post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
