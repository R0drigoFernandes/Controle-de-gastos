import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
public class Main implements KeyListener{




    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame("Controle de gastos");
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.addKeyListener(new Main());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        JButton botãoGasto = new JButton("Gasto");
        JButton botãoGanho = new JButton("Ganho");
        botãoGanho.setBounds(100, 100, 100, 70);
        botãoGasto.setBounds(200, 100, 100, 70);
        frame.add(botãoGasto);
        frame.add(botãoGanho);



        char opcao;
        double total = 0;


        Gasto gasto = new Gasto();
        Ganhos ganhos = new Ganhos();


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

        }else if(keyCode == KeyEvent.VK_H) {

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}