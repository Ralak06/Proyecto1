
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karla
 */
public class Lista {
   

    String Nombre;
    String cedula;
    LinkedList<String> Lista = new LinkedList();

    public Lista() {
    }

    public Lista(String Nombre, String cedula ) {
        this.Nombre = Nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getcedula() {
        return cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setcedula(String cedula ) {
        this.cedula = cedula ;
    }

    @Override
    public String toString() {
        return "PacienteList{" + "\nNombre=" + Nombre + ", cedula =" + cedula  + '}';
    }

  
    
  
    
}
