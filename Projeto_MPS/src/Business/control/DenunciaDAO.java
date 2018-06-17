/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.control;

import Business.model.Denuncia;
import Business.model.Grupo_Estudo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior Ribeiro
 */
public class DenunciaDAO {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void CadastrarDenuncia(Denuncia denuncia) throws ClassNotFoundException {

        String sql = "Insert into denuncia (nome,descricao) values(?,?)";
        con = ConexaoBD.conexaobd();

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, denuncia.getNome());
            pst.setString(2, denuncia.getDescricao());

            pst.execute();
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }
}
