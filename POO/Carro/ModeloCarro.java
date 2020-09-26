//package exercicio01;
public class ModeloCarro {
    public static void main(String[] args) {
        Carro c0 = new Carro();
        c0.modelo = "Gol";
        c0.cor = "Azul";
        c0.setPotencia(1.8f); // Utilizando o método seter. Ele é utilizado para modificar o atributo. 
        c0.status();
        
        Carro c1 = new Carro ();
        c1.modelo = "Mustang";
        c1.cor = "Vermelho";
        c1.ligar();
        c1.status();
        c1.dirigir();
        
        
        Carro c2 = new Carro ();
        c2.modelo = "Corolla";
        c2.cor = "Preto";
        c2.desligar();
        c2.status();
        c2.dirigir();
        
        Carro c3 = new Carro();
        c3.setPotencia(2.0f); // Modificando o valor padrão do objeto produzido pelo método construtor. 
        c3.setLigado(true);
        //System.out.println(c3.dirigir(l));
        System.out.println("A potencia do carro é " + c3.getPotencia() + " e esta " + c3.getLigado()); // Utilizando o get eu consigo realizar consulta do atributo público. 
       // c3.ligado = true; // Caso eu queira fazer modificações no método ligado eu preciso usar os get e set. 
       // c3.dirigir()= false; 
        c3.status();
    }
    
    }
   
