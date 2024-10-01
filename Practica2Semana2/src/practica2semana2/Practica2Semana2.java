/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Practica2Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nota = "";
        double notaDouble=0;
        nota = JOptionPane.showInputDialog("Indique su nota final");
       notaDouble = Double.parseDouble(nota);
       
       if (notaDouble>=70){
            JOptionPane.showMessageDialog(null, "Aprobó");    
        }else{
        JOptionPane.showMessageDialog(null, "No Aprobado");
        }
    }
    
}
