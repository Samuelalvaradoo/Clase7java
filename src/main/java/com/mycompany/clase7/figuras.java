
package com.mycompany.clase7;

import javax.swing.JOptionPane;


public class figuras {
public void cuadrado () { //metodo
        int lado,area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado del cuadrado"));
        area = lado * lado;
        
        JOptionPane.showMessageDialog(null,"el area del cuadrado es :"+ area);
}
public void triangulo () { //metodo
    int base,altura,area;
    base = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida de la base del triangulo"));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida de la altura del triangulo"));
    area = base*altura/2;
    JOptionPane.showMessageDialog(null,"el area del triangulo es :"+area);
    
}
public void rectangulo () {
    int base,altura,area;
     base = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida de la base del rectangulo"));
      altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la medida de la altura del rectangulo"));
      area = base * altura;
      JOptionPane.showMessageDialog(null, "el area del cuadrado es :"+area);
}
public void circulo () {
    double radio,pi=3.1416,area;
    radio = Integer.parseInt(JOptionPane.showInputDialog("Digite el radio del circulo"));
    area = pi*Math.pow(radio, 2);
    JOptionPane.showMessageDialog(null, "el area del circulo es :"+area);
}
    
}

