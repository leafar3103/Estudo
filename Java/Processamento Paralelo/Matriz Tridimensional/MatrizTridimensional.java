public class MatrizTridimensional{
    public static void main(String[] args){
        int lar=1;
        int alt=10;
        int prof=10;
        int [][][] matrizTridimensional = new int [lar][alt][prof];
        System.out.println();
        for (int a=0; a<matrizTridimensional.length;a++){
            for (int b=0;b<matrizTridimensional[a].length;b++){ // Aqui é o vetor do B
                for (int c=0;c<matrizTridimensional[a][b].length;c++){ // Aqui é o vetor do C
                    //matrizTridimensional[a][b][c]= (int)Math.round(Math.random()*30); //Tentativa de implementar o random
                    System.out.println("a=" + a + " b="+ b + " c="+ c); // Aqui é feito o debug do array
                    matrizTridimensional[a][b][c] = a+b+c;
                    System.out.println(matrizTridimensional[a][b][c]);
                     
                }
                System.out.println(); 

            }
              
        }
        
    }

}