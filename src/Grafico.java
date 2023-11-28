import java.awt.Graphics;
import java.awt.Color;
public class Grafico {
    double x , y;
    
    public Grafico(double x , double y) {
        this.x = x;
        this.y = y;
    
    }
    public void grafico(Graphics g) {
    
        g.setColor(Color.GREEN);
        g.fillRect(100, 300 , 20, (int) (y - x));



    }
}
