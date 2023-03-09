package Factura_code;


public class DatosFact{
    private boolean Activo;
    private String Descrip;
    private float Precio;
    private int id;
    
    public DatosFact(boolean Activo, String Descrip, float Precio){
        this.Activo = Activo;
        this.Descrip = Descrip;
        this.Precio = Precio;
    }
    
    public boolean getActivo(){
        return Activo;
    }
    
    public String getDescrip(){
        return Descrip;
    }
    
    public float getPrecio(){
        return Precio;
    }
    
    public void setActivo(boolean inpActivo){
        this.Activo = inpActivo;
    }
    
    public void setDescrip(String inpDescrip){
        this.Descrip = inpDescrip;
    }
    
    public void setPrecio(int inpPrecio){
        this.Precio = inpPrecio;
    }
}
