package Business.model;

import Business.control.UsuarioDAO;
import java.sql.SQLException;

/**
 *
 * @author JR
 */
public class Usuarios {

    private String matricula, nome, senha, curso;

    public Usuarios(String matricula, String nome, String senha,String curso) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public Usuarios() {
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void salvar(Usuarios usuario) throws SQLException, ClassNotFoundException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.CadastrarUsuario(usuario);
    }
}
