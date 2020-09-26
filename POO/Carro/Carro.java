//package exercicio01;
public class Carro {
    String modelo;
    String cor;
    private float potencia; // Quando eu coloco o atributo privado eu preciso utilizar metodos Get and Set para acessar
    private boolean ligado;
    
    public Carro(){ // Método Construtor ele já cria o objeto com os parametros abaixo
        this.cor = "Laranja";
        this.ligado = false;
    }
    
    void status(){
    System.out.println("O Carro escolhido é o " + this.modelo + " seu motor é " + this.potencia + " e sua cor é " + this.cor);
    System.out.println("O Carro esta " + this.ligado);
    }
    void dirigir(){
        if (this.ligado == true){
            System.out.println("Bora dar um role");
        }
        else {
            System.out.println("Não podemos dar um role por que o carro esta desligado");
        }
    }
    void ligar(){
        this.ligado = true;
    }    
    void desligar(){
        this.ligado = false;
    }    
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean l){
        this.ligado = l; // l é quem vai receber o parametro do set
    }
    
    public float getPotencia(){ // Método get para acesso ao atributo privado. Sem ele declarado não consigo fazer a leitura do valor na classe.
        return this.potencia;
    }
    public void setPotencia(float p){ //Método set, para poder realizar as modificações no atributo privado. 
        this.potencia = p;
    }
}

