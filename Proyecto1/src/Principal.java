
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void Introducir(LinkedList<String> Lista, Scanner entrada) {
        Lista.push(entrada.next());
       
               

    }

    public static void Imprimir(LinkedList<String> Lista, Scanner entrada) {
        System.out.println("Su lista de Pacientes  es " + Lista);

    }

    public static void Buscar(LinkedList<String> Lista, Scanner entrada) {
        String Nombre = entrada.next();
        System.out.println("Introduce el dato a buscar ");
        if (Lista.contains(Nombre)) {
            System.out.println("EL nombre se encuentra en la posicion " + Lista.indexOf(Nombre)+"   "+Nombre);
            
            

        } else {
            System.out.println("EL dato no se encuentra en el lista  ");
        }

    }

    public static void EliminarPaciente(LinkedList<String> Lista, Scanner entrada) {
        String Nombre = entrada.next();
        System.out.println("Introduce el dato a Eliminar ");
        if (Lista.contains(Nombre)) {
            Lista.remove(Nombre);
            System.out.println("el Paciente " + Nombre + "fue eliminado");

        } else {
            System.out.println("el Nombre no se encuntra en la lista ");
        }
    }

    public static void IngresarMedicamentos(LinkedList<String> MedicamentosList, Scanner entradaPaciente) {
        MedicamentosList.push(entradaPaciente.next());
    }

    public static void BuscarMedicamento(LinkedList<String> MedicamentosList, Scanner entradaPaciente) {
        String NombrePaciente = entradaPaciente.next();
        System.out.println("Introduce el dato a buscar ");
        if (MedicamentosList.contains(NombrePaciente)) {
            System.out.println("EL nombre" + NombrePaciente + "se encuentra en la posicion " + MedicamentosList.indexOf(NombrePaciente));

        } else {
            System.out.println("EL dato no se encuentra en el lista  ");
        }

    }

    public static void EliminarMedicamento(LinkedList<String> MedicamentosList, Scanner entradaPaciente) {
        String NombrePaciente = entradaPaciente.next();
        System.out.println("Introduce el dato a Eliminar ");
        if (MedicamentosList.contains(NombrePaciente)) {
            MedicamentosList.remove(NombrePaciente);
            System.out.println("el nombre" + NombrePaciente + "fue eliminado");

        } else {
            System.out.println("el Nombre no se encuntra en la lista ");

        }

    }

    public static void AsignarMedicamento(LinkedList<String> MedicamentosList, Scanner entradaPaciente) {
        
        MedicamentosList.push(entradaPaciente.next());

    }

    public static void mostrarReceta(LinkedList<String> MedicamentosList, Scanner entradaPaciente, LinkedList<String> Lista, Scanner entrada) {
        System.out.println("Su lista de Pacientes  es " + Lista + "medicamento asignado" + MedicamentosList);
    }

    public static void main(String[] args) {
        LinkedList<String> Lista = new LinkedList();
        LinkedList<String> MedicamentosList = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaPaciente = new Scanner(System.in);
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Paciente\n2."
                    + ".Introducir Medicamento \n3"
                    + ".Mostrar \n4"
                    + ".Buscar \n5"
                    + ".Eliminar \n6"
                    + ".Mostrar Medicamentos\n7"
                    + ".Buscar madicamentos\n8"
                    + ".Eliminar Medicamento \n9"
                    + ".Medicamento a Paciente \n10"
                    + ".Mostrar RECETA\n11"
                    + " Salir"));

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el Paciente ");
                    Introducir(Lista, entrada);
                    break;
                case 2:
                    System.out.println("Estas Introduciendo  Medicamento");
                    IngresarMedicamentos(MedicamentosList, entradaPaciente);
                    break;
                case 3:
                    System.out.println("Lista de Pacientes");
                    Imprimir(Lista, entrada);

                    break;

                case 4:
                    System.out.println("Estas Buscando Pacientes ,FAVOR Ingrese el Paciente a Buscar  ");
                    Buscar(Lista, entrada);

                    break;
                case 5:
                    System.out.println("Estas Eliminando pacientes");
                    EliminarPaciente(Lista, entrada);

                    break;
                case 6:
                    System.out.println("Vamos a Mostrar los Medicamentos");
                    System.out.println("Su lista de Medicamentos   es " + MedicamentosList);
                    break;
                case 7:
                    System.out.println("Vamos a buscar los Medicamentos");
                    BuscarMedicamento(MedicamentosList, entradaPaciente);
                    break;

                case 8:
                    System.out.println("Estas Eliminando Medicametos ");
                    EliminarPaciente(MedicamentosList, entradaPaciente);

                    break;

                case 9:
                    System.out.println("Introduce el dato a buscar ");
                    String Nombre = entrada.next();
      
        if (Lista.contains(Nombre)) {
             System.out.println("EL nombre se encuentra en la posicion " + Lista.indexOf(Nombre)+"   "+Nombre);
          
        
        } else {
            System.out.println("EL dato no se encuentra en el lista  ");
    
        
        
            
               
                
            }
            
         
                    
                    int op = -1;
            System.out.println("Desea ingresar otro medicamento: "
                    + "\n1)Si"
                    + "\n2)No");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("Ingrese el medicamento: ");
                
              IngresarMedicamentos(MedicamentosList, entradaPaciente);
       

    
            
                

            } else {
                System.out.println("Regresando al menu principal");
            }
        
        
      break;
        
        
       
           
            
            case 10:
                    System.out.println("Los medicamentos Asociados a los pacientes son :");
                    mostrarReceta(Lista , entrada , MedicamentosList , entradaPaciente);

                default:
            }
        } while (opcion != 11);
        }

    

    
    

}
