/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.control;

import Business.control.ConexaoBD;
import Business.model.Grupo_Estudo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Thuane
 */
public class GrupoEstudoDAO {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void CadastrarGrupo(Grupo_Estudo grupodeestudo) throws ClassNotFoundException {

        String sql = "Insert into grupodeestudo (nome,descricao, local,data) values(?,?, ?, ?)";
        con = ConexaoBD.conexaobd();

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, grupodeestudo.getNome());
            pst.setString(2, grupodeestudo.getDescricao());
            pst.setString(3, grupodeestudo.getLocal());
            pst.setString(4, grupodeestudo.getData());

            pst.execute();
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }

    }

}
