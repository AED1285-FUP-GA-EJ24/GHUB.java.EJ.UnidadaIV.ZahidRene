package promedio;
/*
 * capturar calificaciones de un grupo y calcular su promedio utilizando
 * Zahid Rene Jimenez Olivas
 * 23/5/2024
 */

import java.util.Scanner;

public class Promedio {
    public void promedio() {
        Scanner teclado=new Scanner(System.in);
        float calf[]; 

        int n;
        System.out.println("Cuantas calificaciones capturaras?");
        n=teclado.nextInt();
        calf=new float[n];
        float acum_calif=0;
        for(int i=0;i<n;i++){
            System.out.println("Prporciona la calificacion"+i+1+":");
            calf[i]=teclado.nextFloat();
            acum_calif=acum_calif+calf[i];
        }
        float prom= acum_calif/n;
        System.out.println("Promedio: "+prom);
    }
    public void capturar() {
        
    }
    public void () {
        
    }
}
