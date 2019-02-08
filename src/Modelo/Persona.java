package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class Persona {
    
    protected int cc;
    protected String nombre,apellido,email,pass;
    protected Conexion_BD con;
    
    public Persona() {
        
    }
    
    public Conexion_BD getcon(){
        return this.con;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }   
    
    
    
    //--------FUnciones privadas funcionamiento de la BD----------------
    
    /*Me verifica que el paciente tenga una cuenta, de lo contrario le pedira
      que cree una */
    private int verificar_sesion(int i,String _email,String _pass){
        
        con=new Conexion_BD();
        Connection reg=con.getconnection();
        
        String sql="";
        int help=0;
        
        boolean ayuda = verificar_cuadros_texto(_email, _pass);
        
        if (ayuda){
            if(i==0){
            sql="SELECT email,pass,cc FROM paciente";            
            //System.out.println("entra");
        }
        if(i==1){
             sql="SELECT correo,contraseña,cedula FROM medicos";
        }
        
        try {
            //System.out.println(_usuario);
            
            
            PreparedStatement consulta;
            ResultSet res;
            
            consulta=(PreparedStatement) reg.prepareStatement(sql);
            res=(ResultSet) consulta.executeQuery();
            
            while(res.next()){
                //System.out.println(res.getString(1));
                if(res.getString(1).equals(getEmail()) && res.getString(2).equals(getPass())){
                    help=1;                   
                }         
            }
            
            if(help!=1){
                help=2;
            }
            
            
            
            
        } catch (Exception e) {
            System.out.println("Error en la base de datos " + e );
        }        
        }
        
        return help;        
        
        
        
    }
    
    private boolean verificar_cuadros_texto(String _email,String _pass){
        boolean help=true;
        if (_email.equals("") || _pass.equals("")){
            help = false;
        }
        
        return help;
        
    }
    
    //-------Funciones publicas que me llaman a las otras funciones de esta clase--------------   
    public int verificar_sesion_BD(int num,String _email,String _pass){
        return verificar_sesion(num,_email,_pass);
    }
    
    
    
    
    
}
