/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.control;

/**
 *
 * @author Junior Ribeiro
 */
public class Memento {

    protected String estado;

    public Memento(String estadoSalvar) {
        this.estado = estadoSalvar;
    }

    public String getEstadoSalvo() {
        return estado;
    }

}
