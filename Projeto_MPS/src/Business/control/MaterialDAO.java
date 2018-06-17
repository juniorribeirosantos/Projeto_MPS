/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.control;

import Business.control.ConexaoBD;
import Business.model.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Thuane
 */
public class MaterialDAO {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void CadastrarMaterial(Material material) throws ClassNotFoundException {

        String sql = "Insert into material (nome,descricao) values(?,?)";
        con = ConexaoBD.conexaobd();

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, material.getNome());
            pst.setString(2, material.getDescricao());

            pst.execute();
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO");

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);
        }

    }

}
