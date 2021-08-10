
package com.mycompany.clase7;

import java.util.Scanner;

public class telefono {
    String marca,modelo,color,almacenamiento; 
    double llamar,finalizar,duracion;
    public static void main(String[] args) {
        telefono iphone = new telefono ();
        iphone.marca = "Apple";
        iphone.color = "negro";
        iphone.modelo = "12 pro max";
        iphone.almacenamiento = "256gb";
        iphone.llamar = 0;
        iphone.finalizar = 0;
        iphone.duracion = 0;
        
        System.out.println("La marca del telefono es "+ iphone.marca);
        System.out.println("El color del telefono es "+ iphone.color);
        System.out.println("El modelo del telefono es "+ iphone.modelo);
        System.out.println("El almacenamiento del telefono es "+ iphone.almacenamiento);
        
        
        telefono huawei = new telefono ();
         huawei.marca = "Huawei";
        huawei.color = "azul";
        huawei.modelo = "P40";
        huawei.almacenamiento = "128gb";
        huawei.llamar = 0;
        huawei.finalizar = 0;
        huawei.duracion = 0;
        
        System.out.println("La marca del telefono es "+ huawei.marca);
        System.out.println("El color del telefono es "+ huawei.color);
        System.out.println("El modelo del telefono es "+ huawei.modelo);
        System.out.println("El almacenamiento del telefono es "+ huawei.almacenamiento);
        
        telefono samsung = new telefono ();
        samsung.marca = "Samsung";
      samsung.color = "blanco";
       samsung.modelo = "S20+";
       samsung.almacenamiento = "512gb";
       samsung.llamar = 0;
       samsung.finalizar = 0;
        samsung.duracion = 0;
        
        System.out.println("La marca del telefono es "+ samsung.marca);
        System.out.println("El color del telefono es "+ samsung.color);
        System.out.println("El modelo del telefono es "+ samsung.modelo);
        System.out.println("El almacenamiento del telefono es "+ samsung.almacenamiento);
         
        
        
    }
}
   
