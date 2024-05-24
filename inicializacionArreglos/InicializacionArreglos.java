package inicializacionArreglos;

import java.util.Scanner;

public class InicializacionArreglos {
    public void inicializacionArreglos() {
        int arreglo1[];
        arreglo1 = new int[3];
        for(int i=0;i<arreglo1.length;i++){
            System.out.println("Elemento"+i+": "+arreglo1[i]+" ");

        }
        System.out.println();
        double arreglo2[]=new double[5];
        for(int i=0;i<arreglo2.length;i++){
            System.out.println("Elemento"+i+": "+arreglo2[i]+" ");
        }
        System.out.println();
        arreglo2[0]=5.5;
        arreglo2[1]=5.3;
        arreglo2[2]=7.1;
        arreglo2[3]=8.9;
        arreglo2[4]=101.23;
        for(int i=0;i<arreglo2.length;i++){
            System.out.println("Elemento"+i+": "+arreglo2[i]+" ");
        }
        System.out.println();
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa valores");
        for(int j=0;j<arreglo1.length;j++){
            System.out.println("Introduce valor del elemento "+j+" =");
            arreglo1[j]=entrada.nextInt();
        }
        for(int i=0;i<arreglo1.length;i++){
            System.out.println("Elemnto "+i+": "+arreglo1+" ");
        }
        System.out.println();
        int numero[]={10,20,30,40,50,60};
        for(int i=0;i<6;i++){
            System.out.println("NUmeros["+i+"]: "+numero[i]+" ");
        }
        System.out.println();
        int []nms={3,4,5};
        System.out.println(nms[0]);// valor 2
        System.out.println(nms[1]);// valor 4
        System.out.println(nms[2]);// valor 5
        System.out.println();
        char c[]={'L','U','I','S'};
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println();
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        System.out.println();
        final int ENE = 31, FEB = 28, MAR = 31, ABR = 30, MAY = 31,
        JUN = 30, JUL = 31, AGO = 31, SEP = 30, OCT=31,
        NOV = 30, DIC=31;

    int meses[]={ENE,FEB,MAR,ABR,MAY,JUN,
                 JUL,AGO,SEP, OCT,NOV,DIC};
    System.out.println(meses[0]); //

    System.out.println(meses[11]); //

    System.out.println(meses[1]);
    }
}
