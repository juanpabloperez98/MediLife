package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Paciente extends Persona{

    Conexion_BD con = new Conexion_BD();
    
    
    public Paciente() {
        
    }
    
    
    public void  logear_paciente(int cc_,String nombre_,String apellido_,String email_, String pass_){
        
        setCc(cc_);
        setNombre(nombre_);
        setApellido(apellido_);
        setEmail(email_);
        setPass(pass_);     
                
    }
    
    public void mostrar_medicos(){
        mostrar_medicos_BD();        
    }
    
    
    private void mostrar_medicos_BD(){
        try {
        
        Connection reg=con.getconnection();
        
        PreparedStatement st;
        ResultSet res;
        
        st = (PreparedStatement) reg.prepareStatement("SELECT * FROM medico");
        res=(ResultSet) st.executeQuery();
        
        while(res.next()){
            //System.out.println("Nombre:" + res.getString("nombre") + "\nApellido" + res.getString("apellido") );
        }

        } catch (Exception e) {
        }
                
    }
    
    
  
    
    
    
}
