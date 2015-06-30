package com.negocio;

import com.accesodatos.Conexion;

public class Persona {
    private int id_persona;
    private String nombre;
    private String apepat;
    private String apemat;
    private Conexion con;
    public int getId_persona() {
        return id_persona;
    }
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApepat() {
        return apepat;
    }
    public void setApepat(String apepat) {
        this.apepat = apepat;
    }
    public String getApemat() {
        return apemat;
    }
    public void setApemat(String apemat) {
        this.apemat = apemat;
    }
    public void setCrear(){
         con=new Conexion();
         con.setEjecutar("insert into Personas(nombre,apepat,apemat) values('"+this.getNombre()+"','"+this.getApepat()+"','"+this.getApemat()+"')");
         con.cerrarConexion();
    }
    public void setActualizar(String sql){
         con=new Conexion();
         con.setEjecutar("update Personas set nombre='"+this.getNombre()+"',apepat='"+this.getApepat()+"',apemat='"+this.getApemat()+"' where id_persona='"+this.getId_persona() +"'");
         con.cerrarConexion();
    }
    public void setEliminar(String sql){
         con=new Conexion();
         con.setEjecutar("delete from Personas where id_persona='"+this.getId_persona()+"'");
         con.cerrarConexion();
    }
}
