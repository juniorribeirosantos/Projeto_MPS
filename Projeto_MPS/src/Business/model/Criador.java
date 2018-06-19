/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.model;

import Business.control.Memento;
import java.util.ArrayList;

/**
 *
 * @author Junior Ribeiro
 */
public class Criador {

    protected ArrayList<Memento> estados;

    public Criador() {
        estados = new ArrayList<Memento>();
    }

    public void adicionarMemento(Memento memento) {
        estados.add(memento);
    }

    public Memento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new Memento("");
        }
        Memento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }

}
