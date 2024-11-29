package DAO;

//import java.util.List;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Prof. Corredato - Controle de conexão com o banco de dados
 */
public class connectDAO {

    Connection con;

    public Connection connectDB() {
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;";
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
        }
        return con;
        // con.close();
    }

    public void insereRegistroJFBD(String tabela, String strDados) {

        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;encrypt=true;trustServerCertificate=true;";
        String usuario = "sa";
        String senha = ".";

        //if (banco.equals(banco2)) {
            try {
                con = DriverManager.getConnection(caminho, usuario, senha);
                //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => " + erro.getErrorCode());
            }
            Statement stmt;
            try {
              stmt = con.createStatement();
              String sql = "INSERT INTO dbo."+tabela+" "+" VALUES ("+strDados+")";
              JOptionPane.showMessageDialog(null,"String de insert> "+sql);
              
              try{
                  stmt.executeUpdate(sql);
                  JOptionPane.showMessageDialog(null, "Insert executado com sucesso!");
              } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem: " + erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado: " + erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código: " + erro.getErrorCode());
            }
              con.close();
            } catch (SQLException ex){
                Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        //}
    }
    
    public void alteraRegistroJFDB (String tabela, String strDados,String pesquisaId){    }
        
        public clientes pesquisaClienteJFBD (String tabela, String pesquisaId){
            
            String tabelaSGBD = "CLIENTES";
            if(tabela.equals(tabelaSGBD)){
                clientes clientesReturn = new clientes();
                
                con = connectDB();
                
                Statement stmt;
                try {
                    stmt = con.createStatement();
                    
                    String sql = "SELECT * FROM " + tabela + "WHERE " + pesquisaId;
                    
                    try {
                        ResultSet dados;
                        dados = stmt.executeQuery(sql);
                        if (dados.next() == false){
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado para ...");
                        
                    } else{
                            clientesReturn.setIdCli(dados.getInt(1));
                            clientesReturn.setNomeCli(dados.getString(3));
                            clientesReturn.setEndeCli(dados.getString(4));
                            clientesReturn.setBairCli(dados.getString(5));
                            clientesReturn.setCidaCli(dados.getString(6));
                            clientesReturn.setUfCli(dados.getString(7));
                            clientesReturn.setFoneCli(dados.getString(8));
                            clientesReturn.set(dados.getString(9));
                            clientesReturn.setDataNasc(dados.getString(10));
                            clientesReturn.set(dados.getString(11));
                            clientesReturn.set(dados.getString(2));
                        }
                        con.close();
                        return clientesReturn;
                    } catch (SQLException erro){
                        JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO Consulta - ...");
                        JOptionPane.showMessageDialog(null, "\n Erro de conxão, ConnectDAO - Estado =>...");
                        JOptionPane.showMessageDialog(null, "\n Erro de conxão, ConnectDAO - Código =>...");
                    }
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            
        }

}
