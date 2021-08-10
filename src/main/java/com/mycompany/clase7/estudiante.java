
package com.mycompany.clase7;

import java.util.Scanner;


public class estudiante {
    Scanner entrada = new Scanner (System.in);
    String grado;
    String nombre;
    String cedula;
    double nota1,nota2,nota3,nota4,promedio;
    
    public void datos() {
        System.out.println("Datos de los estudiantes");
        System.out.println("Nombre del estudiante");
        nombre = entrada.next();
        System.out.println("Cedula del estudiante");
        cedula = entrada.next();
        System.out.println("Grado del estudiante");
        grado = entrada.next();
        
    }
    public void notas () {
        System.out.println("Digite la primera nota");
        nota1 = entrada.nextDouble();
        System.out.println("Digite la segunda nota");
        nota2 = entrada.nextDouble();
        System.out.println("Digite la tercera nota");
        nota3 = entrada.nextDouble();
        System.out.println("Digite la cuarta nota");
        nota4 = entrada.nextDouble();
        promedio = (nota1+nota2+nota3+nota4)/4;
    }
   public void promediofinal () {
       System.out.println("El estudiante "+ nombre + "de grado "+ grado + "de cedula número "+cedula);
       System.out.println("Tiene un promedio final de "+promedio);
}
   
   
}
