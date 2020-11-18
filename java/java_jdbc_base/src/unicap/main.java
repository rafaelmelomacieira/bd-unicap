package unicap;
import db.myConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class main {
    public static void main(String[] args) {
        try{
            myConnection myConn = new myConnection();
            Connection psqlConn = myConn.getPostgresConn();
            String sql = "SELECT codigo, nome, sobrenome, idade, salario FROM funcionario";
            PreparedStatement ps = psqlConn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString(2);
                String sobreNome = rs.getString("sobrenome");
                String nomeCompleto = nome.concat(" "+sobreNome);
                int idade = rs.getInt("idade");
                Double salario = rs.getDouble("salario");
                System.out.printf("Código %d: %s - %d | Salário: %f \n",codigo, nomeCompleto, idade, salario);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
