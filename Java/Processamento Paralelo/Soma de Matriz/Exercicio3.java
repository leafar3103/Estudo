import java.util.Random;

public class Exercicio3 {
    
    public static void main(String[] args) {
        int lin = 3;
        int col = 3;
        int [][] matrizA = new int[lin][col];
        int [][]matrizB = new int[lin][col];
        int [][]matrizC = new int[lin][col];
        Random gerador = new Random();
        
        
            // Matriz A
        for (int i=0; i<matrizA.length;i++){           // gera números randômicos i=>linhas
            for (int j=0; j<matrizA[i].length;j++){       // j=>colunas
                matrizA[i][j]=0;
            }
        } 
            // Matriz B
        for (int i=0; i<matrizB.length;i++){           // gera números randômicos i=>linhas
            for (int j=0; j<matrizB[i].length;j++){       // j=>colunas
                matrizB[i][j]=gerador.nextInt(10);
            }
        }
            // Matriz C
        for (int i=0; i<matrizC.length;i++){           // gera números randômicos i=>linhas
            for (int j=0; j<matrizC[i].length;j++){       // j=>colunas
                matrizC[i][j]=gerador.nextInt(10);
            }
        }

            // Mostra matriz B
        System.out.println("\n Matriz B\n");
        for (int i=0; i<matrizB.length;i++){           
            for (int j=0; j<matrizB[i].length;j++){       
                System.out.print(matrizB[i][j]+ "\t");
            }
            System.out.println();
        }
            // Mostra matriz C
        System.out.println("\n Matriz C\n");
        for (int i=0; i<matrizC.length;i++){           
            for (int j=0; j<matrizC[i].length;j++){       
                System.out.print(matrizC[i][j]+ "\t");
            }
            System.out.println();
        }
            // Soma as matrizes A = B + C

        System.out.println("\n Matriz A = B + C\n");
        for (int i=0; i<matrizA.length;i++){           
            for (int j=0; j<matrizA[i].length;j++){
                matrizA[i][j]= matrizB[i][j] + matrizC[i][j];
                System.out.print(matrizA[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
