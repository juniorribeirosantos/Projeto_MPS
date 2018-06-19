package Business.model;

import Business.control.MaterialDAO;
import Business.control.Memento;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JR
 */
public class Material {

    private String nome, descricao;

    public Material(String nome, String descricao) {

        super();
        this.nome = nome;
        this.descricao = descricao;

    }

    public Material() {
    }

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

    public void salvar(Material material) throws SQLException, ClassNotFoundException {
        MaterialDAO materialDAO = new MaterialDAO();
        materialDAO.CadastrarMaterial(material);
    }


}
