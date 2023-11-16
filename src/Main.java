import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
public class Main implements KeyListener{




    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame();
        frame.addKeyListener(new Main());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        Graphics g = panel.getGraphics();
        


        char opcao;
        double total = 0;
       

        Gasto gasto = new Gasto();
        Ganhos ganhos = new Ganhos();
        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("Pressione G para registrar um ganho e H para registrar um gasto", 10, 10);
        opcao = scanner.nextLine().charAt(0);
         
        if (opcao == 'g') {
            ganhos.setBotãoGanho(true);
        }else if (opcao == 'h') {
            gasto.setBotãoGasto(true);
        }
        
       
        if (ganhos.isBotãoGanho()) {
           ganhos.ganhos();
        }

        if(gasto.isBotãoGasto()) {
            gasto.gasto();
            
            total = ganhos.getGanhos() - gasto.getGasto();
            if(total < 0) {
                System.out.println("Voce ultrapassou o orcamento");
            }else{
                System.out.println("Voce tem um total de: " + total + "para guardar");
            }
            
        }



        


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_G) {
            ganhos.setBotãoGanho(true);
        }else if(keyCode == KeyEvent.VK_H) {
            gasto.setBotãoGasto(true);
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}