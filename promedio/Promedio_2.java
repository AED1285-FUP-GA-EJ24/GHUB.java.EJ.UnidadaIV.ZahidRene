package promedio;

import java.util.Scanner;

public class Promedio_2 {
    Scanner teclado = new Scanner(System.in);
    public void promedio_2() {
        //declarar el arreglo
        float calf[]; //declarando un arreglo de nombre calf y de tipo float
        int n;//almacena el número de calificaciones
        System.out.println("¿cuántas calificaciones capturaras?");
        n = teclado.nextInt();
        calf=new float[n]; //creando el arreglo calf con n elementos
        
        //capturar
        capturar(calf); //invoco al método capturar y mando como un argumento
                        //el arrglo donde se almacenaran las calificaciones
        //calcular promedio
        calcularPromedio(calf); //invoco al método calcular promedio y mando como
                                //argumero el arreglo en donde estas las calificaciones
       
    }
    public void capturar(float calf[]){
        for(int i=0;i<calf.length;i++){ //length regresa el tamaño del arrego
            System.out.print("Proporciona la calificación "+ (i+1) +": ");
            calf[i]= teclado.nextFloat();
        }
    }
    public void calcularPromedio(float calf[]){
        float acum_calf=0;
        for(int i=0;i<calf.length;i++){
            //acum_calf = acum_calf+calf[i];
            acum_calf += calf[i];
        }
        float prom = acum_calf/calf.length;
        System.out.println("Promedio = "+prom);

    }
}
