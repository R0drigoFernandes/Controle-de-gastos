import java.awt.Graphics;
import java.awt.Color;
public class Grafico {
   public int anguloGreen, anguloRed;
Ganhos ganho = new Ganhos();
Gasto gasto = new Gasto();

    
   public void grafico(Graphics g){
       
        if(ganho.getGanhos() > 0){
        anguloGreen = 360;
       g.setColor(Color.green);
       g.fillArc(100, 100, 100, 100, 0, anguloGreen);
        }
       if(gasto.getGasto() > 0){
           anguloRed = (int) (gasto.getGasto() * 3.6);
           g.setColor(Color.red);
       g.fillArc(100, 100, 100, 100, 0, anguloRed); 
       }
      
      
      
       
   }

   
   
}
