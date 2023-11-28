import java.awt.Graphics;
import java.awt.Color;
public class Grafico {
    
    public void drawArc(int x , int y, int width, int height, int startAngle, int arcAngle){
        Graphics g = null;
            
        
        g.setColor(Color.WHITE);
        g.drawRect(100, 150, 50, 50);
        g.setColor(Color.GREEN);
        g.drawArc(x, y, width, height, startAngle, arcAngle);
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
}
