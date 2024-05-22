package productoArreglo;

import java.util.Scanner;

public class ProductoArreglo {
    public void ProductoArreglo() {
        Scanner teclado = new Scanner(System.in);
        int []a;
        a = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Proporciona elemento="+i+":");
            a[i]=teclado.nextInt();
        }

        int acum = 1;
        for(int i=0;i<a.length;i++){
            acum=acum*a[i];
        }
        System.out.println("El producto= "+acum);

    }
}
