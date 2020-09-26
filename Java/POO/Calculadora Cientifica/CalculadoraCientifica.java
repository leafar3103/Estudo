import java.lang.Math; 
public class CalculadoraCientifica {
    public double raiz(int num){
        return Math.sqrt(num);
    }
    public double raiz(double num){
        return Math.sqrt(num);
    }
    public double raiz(String txt){
        double num = Double.parseDouble(txt);
        return Math.sqrt(num);
    }
    public double potencia(byte a, byte b){
        return Math.pow(a, b);
    }
    public double potencia(String s1, String s2){
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        return Math.pow(a, b);
    }
    public double potencia(int a, Double b){
        return Math.pow(a, b);
    }


}