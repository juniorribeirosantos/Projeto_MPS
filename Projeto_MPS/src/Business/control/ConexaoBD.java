package Business.control;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JR
 */
public class ConexaoBD {

    public static Connection conexaobd() throws ClassNotFoundException {

        try {

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/compartilhae", "postgres", "u6h2f3i2");
            JOptionPane.showMessageDialog(null, "CONECTADO COM SUCESSO");
            return con;

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error);
            return null;
        }

    }

}
