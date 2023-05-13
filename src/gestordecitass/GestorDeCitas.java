/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitass;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Fabritzio
 */
public class GestorDeCitas {
    
    public static List<Cita> citasPROGRAMADAS;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    public static List<String> Horariodispo=new ArrayList<>();
    public static List<String> DiasDisponibles=new ArrayList<>();
    
    
    public static void main(String[] args){
        
        //Genero las listas en blanco para todo el sistema hasta que se cierre
        citasPROGRAMADAS=new ArrayList<>();
        
        listaDePacientes=new ArrayList<>();
        
        listaDeMedicos=new ArrayList<>();
        
        Horariodispo.add("9:00am");
        Horariodispo.add("9:30am");
        Horariodispo.add("10:00am");
        Horariodispo.add("10:30am");
        Horariodispo.add("11:00am");
        Horariodispo.add("11:30am");
        Horariodispo.add("12:00am");
        
        
        DiasDisponibles.add("05/05/2023");
        DiasDisponibles.add("06/05/2023");
        DiasDisponibles.add("07/05/2023");
        DiasDisponibles.add("08/05/2023");
        DiasDisponibles.add("09/05/2023");
        
        
        //Inicio la ventana principal de gestor de citas.
        
        JFrameGestorDeCitas framePrincipal= new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null); //Centra el Formulario
        framePrincipal.setVisible(true);//Propiedad que me permite mostrar la pantalla
                                         
        
        
    }
    
}
