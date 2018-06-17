/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.model;

import Business.control.GrupoEstudoDAO;
import java.sql.SQLException;

/**
 *
 * @author Junior Ribeiro
 */
public class Grupo_Estudo {

    private String nome, descricao, local, data;

    public Grupo_Estudo(String nome, String descricao, String local, String data) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.local = local;
        this.data = data;

    }

    public Grupo_Estudo() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public void salvar(Grupo_Estudo grupodeestudo) throws SQLException, ClassNotFoundException {
        GrupoEstudoDAO grupoestudoDAO = new GrupoEstudoDAO();
        grupoestudoDAO.CadastrarGrupo(grupodeestudo);
    }

}
