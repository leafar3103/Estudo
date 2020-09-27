package Run;

public class Teste {
    public static void main(String[] args){
        MinhaThread thread = new MinhaThread("Thread #1", 600); // Tempo de sleep da thread 600
        //thread.start(); //Chamada para executar o método Run para inciar a Thread
        MinhaThread thread2 = new MinhaThread("Thread #2",300); // Segunda Thread

        MinhaThread thread3 = new MinhaThread("Thread #3", 900);

    }
}
