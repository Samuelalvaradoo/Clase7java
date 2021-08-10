
package com.mycompany.clase7;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ingenieria {
    DecimalFormat df = new DecimalFormat("#.00");
    double promedio,primerparcial,segundoparcial,tercerparcial;
    public void programacion () {
        primerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        segundoparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        tercerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial"));
        
        promedio = (primerparcial+segundoparcial+tercerparcial)/3;
        JOptionPane.showMessageDialog(null,"El promedio es :"+df.format(promedio));
        
    }
   public void calculo () {
        primerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        segundoparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        tercerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial"));
        
        promedio = (primerparcial+segundoparcial+tercerparcial)/3;
        JOptionPane.showMessageDialog(null,"El promedio es :"+df.format(promedio));
   }
   public void ingles () {
       primerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        segundoparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        tercerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial"));
        
        promedio = (primerparcial+segundoparcial+tercerparcial)/3;
        JOptionPane.showMessageDialog(null,"El promedio es :"+df.format(promedio));
   }
   public void algebra  () {
        primerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        segundoparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        tercerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial"));
        
        promedio = (primerparcial+segundoparcial+tercerparcial)/3;
        JOptionPane.showMessageDialog(null,"El promedio es :"+df.format(promedio));
        
   }
    public void Administracion  () {
        primerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        segundoparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        tercerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial"));
        
        promedio = (primerparcial+segundoparcial+tercerparcial)/3;
        JOptionPane.showMessageDialog(null,"El promedio es :"+df.format(promedio));
        }
    public void basedatos  () {
         primerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        segundoparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        tercerparcial=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tercer parcial"));
        
        promedio = (primerparcial+segundoparcial+tercerparcial)/3;
        JOptionPane.showMessageDialog(null,"El promedio es :"+df.format(promedio));
    }
       public static void main(String[] args) {
        ingenieria notas = new ingenieria ();
        int menu;
        do  {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Promedio de las siguientes materias"
            +"\n 1) programacion"
            +"\n 2) calculo"
            +"\n 3) ingles"
            +"\n 4) algebra"
            +"\n 5) administracion" 
            +"\n 6) base de datos"
            +"\n 7) salir"));
            
            switch (menu) {
                case 1:
                    notas.programacion();
                    break;
                case 2:
                    notas.calculo();
                    break;
                case 3:
                    notas.ingles();
                    break;
                case 4:
                    notas.algebra();
                    break;
                case 5:
                    notas.Administracion();
                    break;
                case 6:
                    notas.basedatos();
                    break;
            }
            
        }while(menu!=7);
    }
}
