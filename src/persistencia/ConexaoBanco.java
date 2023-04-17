/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Natan Fraga
 * @since 21:21 - 08/07/2018
 * @version Vinil II
 */
public class ConexaoBanco {
    private static final String URL="jdbc:mysql://localhost:3306/vinil";
    private static final String USUARIO="root";
    private static final String SENHA="";

    public static Connection getConexao() throws SQLException{
        
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) { 
            throw new SQLException("Erro ao se conectar com o Banco de Dados! "+se.getMessage());
        }
        
        return c;
    }
}//fecha classe ConexaoBanco
