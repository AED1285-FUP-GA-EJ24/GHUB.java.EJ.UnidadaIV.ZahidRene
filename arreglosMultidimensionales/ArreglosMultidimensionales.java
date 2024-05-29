package arreglosMultidimensionales;

public class ArreglosMultidimensionales {

    public void arreglosMultidimensionales() {
        //Sintaxis
        /*
         * forma1
         * <tipo de datoElemento> <>nombre arreglos[][];
         * forma2
         * <tipo de datoElemento> [][]<tipo de datoElemento>
         */
        char pantalla[][];
        int puestos[][];
        double [][]matriz;


        pantalla=new char[80][24];
        puestos=new int[10][5];
        final int N=4;
        matriz=new double[N][N];
        
        puestos[0][0]= 1;
        puestos[0][1]= 2;
        puestos[0][2]= 3;
        puestos[0][3]= 4;
        puestos[0][4]= 5;

        puestos[1][0]= 1;
        puestos[1][1]= 2;
        puestos[1][2]= 3;
        puestos[1][3]= 4;
        puestos[1][4]= 5;
        
        puestos[2][0]= 1;
        puestos[2][1]= 2;
        puestos[2][2]= 3;
        puestos[2][3]= 4;
        puestos[2][4]= 5;
        
        puestos[3][0]= 1;
        puestos[3][1]= 2;
        puestos[3][2]= 3;
        puestos[3][3]= 4;
        puestos[3][4]= 5;
        
        puestos[4][0]= 1;
        puestos[4][1]= 2;
        puestos[4][2]= 3;
        puestos[4][3]= 4;
        puestos[4][4]= 5;

        puestos[5][0]= 1;
        puestos[5][1]= 2;
        puestos[5][2]= 3;
        puestos[5][3]= 4;
        puestos[5][4]= 5;

        puestos[6][0]= 1;
        puestos[6][1]= 2;
        puestos[6][2]= 3;
        puestos[6][3]= 4;
        puestos[6][4]= 5;

        puestos[7][0]= 1;
        puestos[7][1]= 2;
        puestos[7][2]= 3;
        puestos[7][3]= 4;
        puestos[7][4]= 5;

        puestos[8][0]= 1;
        puestos[8][1]= 2;
        puestos[8][2]= 3;
        puestos[8][3]= 4;
        puestos[8][4]= 5;
        
        puestos[9][0]= 1;
        puestos[9][1]= 2;
        puestos[9][2]= 3;
        puestos[9][3]= 4;
        puestos[9][4]= 5;


        for(int i=0;i<80;i++){
            System.out.println("Valores de renglon"+i+": ");
            System.out.println(puestos[i][0]+" "+puestos[i][1]+" "+puestos[i][2]+" "+puestos[i][3]);
        }
    }
}
