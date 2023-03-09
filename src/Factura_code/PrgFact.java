package Factura_code;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class PrgFact {
    public static FormFact F1 = new FormFact();
    public static FormPro F2 = new FormPro();    
    public static void loadImages(JLabel ctn, String image){
        ImageIcon imagen = new ImageIcon(image);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ctn.getWidth(), ctn.getHeight(), Image.SCALE_DEFAULT));
        ctn.setIcon(icono);
    }
    public static Image iconWindow(){
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/IconWindow.png"));
        return icon;
    }
            
    public static void main(String[] args) {
        F1.setVisible(true);
    }
}
