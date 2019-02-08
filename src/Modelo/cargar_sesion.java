/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author juan
 */
public class cargar_sesion extends Thread{
    
    JProgressBar progreso;
    public cargar_sesion(JProgressBar progreso_) {
        super();
        this.progreso = progreso_;        
    }
    
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            this.progreso.setValue(i);
            try {
                sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(cargar_sesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    
    }
    
    
    
    

    
}
