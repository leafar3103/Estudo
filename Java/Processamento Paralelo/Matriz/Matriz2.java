import java.sql.SQLOutput;

public class Matriz2 {
    public static void main(String [] args){
        int lin = 2;
        int col = 2;
        int [][] matriz = new int[lin][col]; //criação do objeto da matriz
        int menor = matriz[0][0];
        int maior = matriz[0][0];

        System.out.println();

        for (int i = 0; i< matriz.length;i++){ //incremento do primeiro vetor do array
            for (int j = 0; j<matriz[i].length;j++){ // incremento do segundo vetor do array
                matriz[i][j] = (int)Math.round(Math.random()*99); // O range de números dinâmicos gerados
                if (matriz[i][j]>maior){
                    maior = matriz[i][j];
                }
                else{
                    if (matriz[i][j]<menor){
                        menor = matriz [i][j];
                    }
                }
                System.out.print(matriz[i][j] +" \t"); // Saída da matriz na tela
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("O maior valor encontrado foi: " + maior);
        System.out.println("O menor valor encontrado foi: " + menor);
    }
}
