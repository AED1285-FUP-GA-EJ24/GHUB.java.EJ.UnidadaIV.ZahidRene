package sumaArreglos;

import java.util.Scanner;

public class SumaArreglo {
    public void sumaArreglos() {
        Scanner teclado= new Scanner(System.in);
        int []a;
        a = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Proporciona elemento:"+i+":");
            a[i] = teclado.nextInt();

        }
        int acum =0;
        for(int i=0;i<a.length;i++){
            acum = acum + a[i];

        }
        System.out.println("La suma ="+acum);
    }
}
