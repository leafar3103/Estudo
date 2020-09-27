public class ThreadSemaforo implements Runnable {
    
   private CorSemaforo cor; //Chama as cores configuradas no Enumerate
   private boolean parar; // Criação de flags para marcação das Threads
   private boolean corMudou; // Criação de flags para marcação das Threads

   public ThreadSemaforo(){
        this.cor = CorSemaforo.VERMELHO;
        this.parar = false;
        this.corMudou = false;
    

        new Thread(this).start();
   }
    
   public void run(){
        while(!parar){
            try{ // Na primeira versão do código era usado o Switch
            /*switch(this.cor){
                case VERMELHO:
                    Thread.sleep(2000);    
                    break;
                case AMARELO:
                    Thread.sleep(300);
                    break;
                case VERDE:
                    Thread.sleep(1000);
                    break;
                default:
                    break;
                }*/
                Thread.sleep(this.cor.getTempoEspera()); // Tempo de espera no Enum para mudança da cor
                this.mudarCor();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

   }
private synchronized void mudarCor(){
    switch (this.cor){
        case VERMELHO:
            this.cor = CorSemaforo.VERDE;
            break;
        case AMARELO:
            this.cor = CorSemaforo.VERMELHO;
            break;
        case VERDE:
            this.cor = CorSemaforo.AMARELO;
            break;
        default:
            break;
    }
    this.corMudou = true;
    notify(); //Notificação da Thread
}
public synchronized void esperaCorMudar(){ //Comando para sincronizar as Threads
    while(!this.corMudou){
        try{            // para trabalhar com a thread necessário usar try catch
            wait();     //Aguarda a notificação
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    this.corMudou = false;
}
public synchronized void desligarSemaforo(){ // Metodo para finalizar a execução dos processos
    this.parar = true;
}
public CorSemaforo getCor(){ //Metodo Acessor das cores
    return cor;
}
}
