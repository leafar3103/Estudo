package Runnable;

public class Teste {
    public static void main(String[] args) {
        
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500); //Aqui foi só implementada o método Runnable.
        /*Thread t1 = new Thread(thread1);
        t1.start();*/ // Quando passado esses parametros para implementação e inicialização da Thread fora do método construtor
                     // é necessário fazer o processo para cada nova Thread.
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 300); 

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800); // Novas Threads sendo construidas

    }
}
