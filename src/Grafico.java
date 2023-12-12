import java.awt.Graphics;
import java.awt.Color;
public class Grafico {
    int centerX = 0;
    int centerY = 0;
    int radius = 0;
    double total = 0;
    double gastosAngle = 0;
    double economiaAngle = 0;
    double gastos = 0;

    public void grafico(int centerX, int centerY, int radius, double ganhos, double gastos) {
        this.gastos = gastos;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;

         total = ganhos + gastos;
         gastosAngle = (int) Math.round((gastos / total) * 360);
         economiaAngle = 360 - gastosAngle;

        
    }

    
public void drawPieChart(Graphics g) {
    int gastosAngle = (int) Math.round((gastos / total) * 360);
    int economiaAngle = 360 - gastosAngle;

    // Define a cor dos gastos
    g.setColor(new Color(255, 0, 0));
    g.fillArc(centerX - radius, centerY - radius, 2 * radius, 2 * radius, 0, gastosAngle);

    // Define a cor da economia
    g.setColor(new Color(0, 255, 0));
    g.fillArc(centerX - radius, centerY - radius, 2 * radius, 2 * radius, gastosAngle, economiaAngle);
}
      
      
      
       
   }

   
   

