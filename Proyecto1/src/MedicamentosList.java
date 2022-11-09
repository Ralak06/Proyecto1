
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla
 */
public class MedicamentosList  extends Lista {
  String NombrePaciente;
  String asiganado;
   LinkedList<String> MedicacmentosList = new LinkedList();

    public MedicamentosList() {
    }

    public MedicamentosList(String NombrePaciente, String asiganado) {
        this.NombrePaciente = NombrePaciente;
        this.asiganado = asiganado;
    }

    public MedicamentosList(String NombrePaciente, String asiganado, String Nombre, String cedula) {
        super(Nombre, cedula);
        this.NombrePaciente = NombrePaciente;
        this.asiganado = asiganado;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public String getAsiganado() {
        return asiganado;
    }

    public LinkedList<String> getMedicacmentosList() {
        return MedicacmentosList;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public LinkedList<String> getLista() {
        return Lista;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public void setAsiganado(String asiganado) {
        this.asiganado = asiganado;
    }

    public void setMedicacmentosList(LinkedList<String> MedicacmentosList) {
        this.MedicacmentosList = MedicacmentosList;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLista(LinkedList<String> Lista) {
        this.Lista = Lista;
    }

    @Override
    public String toString() {
        return "MedicamentosList{" + "NombrePaciente=" + NombrePaciente + ", asiganado=" + asiganado + ", MedicacmentosList=" + MedicacmentosList + '}';
    }




}
   
  
