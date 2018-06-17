/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.model;

/**
 *
 * @author Junior Ribeiro
 */
public class Denuncia {

    String nome, descricao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Denuncia(String nome, String descricao) {

        super();
        this.nome = nome;
        this.descricao = descricao;

    }

}
