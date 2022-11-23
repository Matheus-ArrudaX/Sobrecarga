import javax.swing.*;

public class CalculadoraCientifica {


    public void raiz(int a) {
        System.out.println(Math.sqrt(a));
    }

    public void raiz(double a){
        System.out.println(Math.sqrt(a));
    }

    public void raiz(String a) {
        System.out.println(Math.sqrt(Double.parseDouble(a)));
    }
    public void potencia(byte a, byte b){
        System.out.println(Math.pow(a, b));
    }
    public void potencia(String a, String b){
        double string1 = Double.valueOf(a);
        double string2 = Double.valueOf(b);
        System.out.println(Math.pow(string1, string2));
    }
    public void potencia(int a, double b){
        System.out.println(Math.pow(a, b));
    }
}









                









