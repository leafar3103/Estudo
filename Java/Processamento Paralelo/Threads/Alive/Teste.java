package Alive;

public class Teste {
    public static void main(String[] args) {
        
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500); //Aqui foi só implementada o método Runnable.
        /*Thread t1 = new Thread(thread1);
        t1.start();*/ // Quando passado esses parametros para implementação e inicialização da Thread fora do método construtor
                     // é necessário fazer o processo para cada nova Thread.
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500); 

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500); // Novas Threads sendo construidas

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();
        
        try {
            for (int i=0;i<15;i++){
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        System.out.println("Programa finalizado");
    }
}
