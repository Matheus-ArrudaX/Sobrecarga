import java.util.Scanner;

public class TesteCalculadoraCientifica {
    public static void main(String[] args) {

        int Inum1 = 0, Inum2 = 0;
        double Dnum1 = 0, Dnum2 = 0;
        String nome1, nome2, nome3;
        byte Bnum1 = 0, Bnum2 = 0;

        Scanner sc = new Scanner(System.in);

        Inum1 = sc.nextInt();
        Inum2 = sc.nextInt();
        Dnum1 = sc.nextDouble();
        Dnum2 = sc.nextDouble();
        nome1 = sc.nextLine();
        nome2 = sc.nextLine();
        nome3 = sc.nextLine();
        Bnum1 = sc.nextByte();
        Bnum2 = sc.nextByte();

        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        calculadoraCientifica.raiz(Inum1);
        calculadoraCientifica.raiz(Dnum1);
        calculadoraCientifica.raiz(nome1);
        calculadoraCientifica.potencia(Bnum1, Bnum2);
        calculadoraCientifica.potencia(nome2, nome3);
        calculadoraCientifica.potencia(Inum2, Dnum2);



    }
}
