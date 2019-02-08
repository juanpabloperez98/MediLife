package MVC;

import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;


public class MediLife {

  
    public static void main(String[] args) {
        
       modelo model = new modelo();
       vista view = new vista();
       controlador control = new controlador(model, view);
       
       control.iniciar();
       view.login_general.setVisible(true);
        
    }
    
}
