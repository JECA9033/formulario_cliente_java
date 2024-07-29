/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author jealv
 */
public class Cliente extends Persona {
    private String Nit;
    
    //constructor
    public Cliente (){}
    public Cliente(String Nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
      super (nombres, apellidos, direccion, telefono, fecha_nacimiento);
       this.Nit = Nit;
    }

    public Cliente(String Nit) {
        this.Nit = Nit;
    }
    

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }
    
    @Override
    protected String[] crear(){
        try{
            String datos [] = new String[6];
            datos[0] = this.getNit();
            datos[1] = this.getNombres();
            datos[2] = this.getApellidos();
            datos[3] = this.getDireccion();
            datos[4] = this.getTelefono();
            datos[5] = this.getFecha_nacimiento();
            
           //Se realizo una correccion ya que retornaba null 
            return datos;
        }catch (Exception ex){
            System.out.println("algo salio mal: " + ex.getMessage());
        }
    return null;
}

    
}
