/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.control;

import Business.control.ConexaoBD;
import Business.model.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Thuane
 */
public class UsuarioDAO {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void CadastrarUsuario(Usuarios usuario) throws ClassNotFoundException {

        String sql = "Insert into usuario (matricula,nome,senha, curso) values(?,?,?, ?)";
        con = ConexaoBD.conexaobd();

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getMatricula());
            pst.setString(2, usuario.getNome());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getCurso());

            pst.execute();
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }

    }

    public void excluirUsuario(Usuarios usuario) throws SQLException, ClassNotFoundException {

        String sql = "delete from usuario where cpf = " + usuario.getMatricula();
        con = ConexaoBD.conexaobd();
        pst = con.prepareStatement(sql);
        pst.execute();
    }

    public void alterarUsuario(Usuarios usuario) throws SQLException, ClassNotFoundException {
        String sql = "update usuario set matricula = ?, nome = ?, senha = ?, curso = ? where cpf = '" + usuario.getMatricula() + "';";
        System.out.println(sql);
        con = ConexaoBD.conexaobd();
        pst = con.prepareStatement(sql);

        pst.setString(1, usuario.getNome());
        pst.setString(2, usuario.getMatricula());
        pst.setString(3, usuario.getSenha());
        pst.setString(4, usuario.getCurso());
        pst.executeUpdate();

    }

}
