import java.awt.Graphics;
import java.awt.Color;
public class Grafico {
   public int anguloGreen, anguloRed;


    
   public void grafico(Graphics g){
       g.setColor(Color.white);
       g.fillRect(100, 100, 100, 100);
       g.setColor(Color.green);
       g.fillArc(100, 100, 100, 100, 0, anguloGreen);
       g.setColor(Color.red);
       g.fillArc(100, 100, 100, 100, 0, anguloRed);
      
      
       
   }

   
   
}
