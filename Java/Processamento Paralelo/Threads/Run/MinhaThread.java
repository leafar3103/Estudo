package Run;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {//Metodo construtor
        this.nome = nome;
        this.tempo = tempo; //Parametro passado pela thread no sleep
        start();//É melhor deixar a thred iniciando direto no método construtor

    }

    public void run() { // Método Run
        // System.out.println(" Executando a thread");
        try { // É necessário colocar um try porque pode dar uma excessão
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo); //Aqui vai o parametro do tempo estipulado na Thread
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " Terminou a execução!");
    }
}
