import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class screen implements ActionListener{
    public void screen(){
         JFrame frame = new JFrame("Controle de gastos");
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        JButton botãoGasto = new JButton("Gasto");
        JButton botãoGanho = new JButton("Ganho");
        botãoGanho.setBounds(300, 400, 100, 70);
        botãoGasto.setBounds(400, 400, 100, 70);
        Font font = new Font("Arial", Font.BOLD, 20);
        botãoGanho.setFont(font);
        botãoGasto.setFont(font);
        botãoGanho.setBackground(Color.green);
        botãoGasto.setBackground(Color.RED);
        botãoGanho.setForeground(Color.BLACK);
        botãoGasto.setForeground(Color.BLACK);
        frame.add(botãoGasto);
        frame.add(botãoGanho);
        botãoGanho.addActionListener(this);
        botãoGasto.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
