package demoArreglo;

import java.util.Scanner;

public class DemoArreglos{

    public void demoArreglos(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Demostración de arreglos unidimensionales");
        //declarando un arreglo de tamaño 10;
        
        int []c;
        c= new int[10];
        c[0]=2;
        c[1]=4;
        c[2]=6;
        c[3]=8;
        c[4]=10;
        c[5]=12;
        c[6]=14;
        c[7]=16;
        c[8]=18;
        c[9]=20;
        for(int i=0;i<10;i++){
            System.out.println("Valor de c["+i+"]="+c[i]);
        }
        for(int i=0;i<N;i++){
            System.out.println("Valor de vector["+i+"]="+vector[i]);
        }



        int []mes=new int [12];
        float salarios[];
        salarios=new float[25];
        mes[4]=5;
        System.out.println(salarios[mes[4]*3]);
        double []v= new double[15];
        System.out.println(v.length);
        teclado.close();
    }
}