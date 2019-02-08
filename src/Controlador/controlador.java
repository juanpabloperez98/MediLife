/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author juan
 */
public class controlador {
    
    private modelo model;
    private vista view;
    private int ayuda_carga;
    private int ayuda=0;
    
    public controlador(modelo _model, vista _view) {
        this.model = _model;
        this.view = _view;
        
        //-----Acciones para TODOS los botones de la ventana login general----
        this.view.login_general.Boton_PACIENTE.addActionListener(new Action("paciente_login"));
        this.view.login_general.Boton_DOCTOR.addActionListener(new Action("doctor_login"));
        this.view.login_general.Boton_FARMACEUTA.addActionListener(new Action("farmaceuta_login"));
        //-----Acciones para TODOS los componentes de la ventana panel paciente----
        this.view.paciente.Boton_Volver.addActionListener(new Action("panel_paciente_volver"));
        this.view.paciente.Boton_Ingresar.addActionListener(new Action("panel_paciente_iniciar_sesion"));
        
        
        //-----Acciones para La barra de carga................
        this.view.carga_barra.barra_progreso.addChangeListener(new Progreso("inicio_progreso_"));
    }
    
    public void iniciar(){        
        //centramos todas las ventanas
        view.login_general.setLocationRelativeTo(null);
        view.paciente.setLocationRelativeTo(null);
        view.doctor.setLocationRelativeTo(null);
        view.farmaceuta.setLocationRelativeTo(null);
        view.panel_paciente.setLocationRelativeTo(null);
        view.carga_barra.setLocationRelativeTo(null);
    }
    
    class Action implements ActionListener{
        
        
        private String op;
        public Action(String op) {
            this.op = op;            
        }
        
        

        @Override
        public void actionPerformed(ActionEvent e) {
            
            switch(op){
                //-------Casos del login principal----------------
                case"paciente_login":
                    view.paciente.setVisible(true);
                    view.login_general.setVisible(false);
                    break;
                case"doctor_login":
                    view.doctor.setVisible(true);
                    view.login_general.setVisible(false);
                    break;
                case"farmaceuta_login":
                    view.farmaceuta.setVisible(true);
                    view.login_general.setVisible(false);
                    break;
                
                //--------Casos del login paciente----------------                
                case "panel_paciente_volver":
                    view.login_general.setVisible(true);
                    view.paciente.setVisible(false);
                    break;
                case "panel_paciente_iniciar_sesion":
                    model.paciente.setEmail(view.paciente.Cuadro_Email.getText());
                    model.paciente.setPass(new String(view.paciente.Cuadro_Pass.getPassword()));
                    ayuda = model.verificar_sesion(0,view.paciente.Cuadro_Email.getText(),new String(view.paciente.Cuadro_Pass.getPassword()));
                    if(ayuda==1){
                        view.carga_barra.setVisible(true);
                        view.paciente.setVisible(false);
                        model.cargar_sesion(view.carga_barra.barra_progreso);
                    }else if(ayuda == 0) {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese todos los espacios");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se pudo encontrar el usuario, asegurese que este registrado\nde no ser asi por favor cree una cuenta");
                    }
                    break;
                
                
            }
            
        }
        
    }
    
    
     class Progreso implements ChangeListener{
         
        
        String op;
        
        public Progreso(String op) {
            this.op = op;
        }
         
         

        @Override
        public void stateChanged(ChangeEvent e) {
            switch(op){
                case "inicio_progreso_":
                    if (view.carga_barra.barra_progreso.getValue()==99){
                        view.carga_barra.dispose();
                        JOptionPane.showMessageDialog(null, "Sesion Iniciada con exito","Verificado",JOptionPane.INFORMATION_MESSAGE);
                        switch(ayuda_carga){
                            case 0:
                                view.panel_paciente.setVisible(true);
                                break;
                                
                        }
                    }
                    break;
            }
            
        }
         
     }
}
    
    
    
    
    
    
    

