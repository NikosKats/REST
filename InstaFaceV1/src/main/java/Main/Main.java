/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Dimension;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author nikoskatsilidis
 */
public class Main {
    public static void main(String[] args) {
        
        Register1 r = new Register1();
        
        r.setTitle("Register");
        r.setMinimumSize(new Dimension(700,450));
        r.setMaximumSize(new Dimension(700,450));
        r.setVisible(true);
        r.setLocationRelativeTo(null);
        r.setResizable(false);
        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
    }
  
            
}
