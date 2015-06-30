/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_console_git;

import com.negocio.Persona;

/**
 *
 * @author ricardotoledo
 */
public class CRUD_CONSOLE_GIT {
    public static void main(String[] args) {
        System.out.println("INSERTAR");
        Persona p=new Persona();
        p.setNombre("RICARDO");
        p.setApepat("TOLEDO");
        p.setApemat("BARRIA");
        p.setCrear();
    }
    
}
