package generacionNombres;

public class GeneracionNombres {

    public void generacionNombres() {
        String nombres[]={"Ana","Beto","Cecilia","Juan","Ines","Tomas","Luis","Maria","Lucia","Zulema"};
        System.out.println("cantidad de nombres="+nombres.length);
        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        for(int i=0;i<10;i++){
         int numero =(int)(Math.random()*10);
         System.out.println("Número aleatorio generado : "+numero);
         System.out.println("Nombre Aleatorio:"+nombres[numero]);
        }
    }
}