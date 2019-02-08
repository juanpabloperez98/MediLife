/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author juan
 */
public class modelo {
    
    public Paciente paciente = new Paciente();
    public Medico doctor = new Medico();
    public Farmaceuta farmaceuta = new Farmaceuta();
    private cargar_sesion cs;
            
    
    public modelo(){
    }
    
    public int verificar_sesion(int i,String _email,String _pass){
        int ayuda=0;
        if(i==0){
             ayuda = paciente.verificar_sesion_BD(i,_email,_pass);     
            
        }else if(i==1){
            
        }else{
            
        }
        
        return ayuda;
    }
    
    public void cargar_sesion(JProgressBar barra){
        
        cs = new cargar_sesion(barra);
        cs.start();
        
        
        
    }
    
    
    
   
    
}
