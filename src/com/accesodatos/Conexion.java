package com.accesodatos;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Conexion {
    private String bdd="CRUD_CONSOLE_GIT";
    private String usuario="root";
    private String clave="q1w2e3r4t5";
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    public Conexion(){
         try{
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+bdd,usuario,clave);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void setEjecutar(String sql){
        try{
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void setConsulta(String sql){
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public ResultSet getRs() throws SQLException{
        return rs;
    }
    public void cerrarConexion(){
        try{
            this.con.close();
        }catch(Exception ex){
            System.out.println("Error de conexion:"+ex.getMessage());
        }
    }
}
