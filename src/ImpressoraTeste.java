import java.util.Scanner;

public class ImpressoraTeste {
    public static void main(String[] args) {

        int Inum1 = 0, Inum2 = 0;
        float Fnum3 = 0, Fnum4 = 0, Fnum5 = 0;
        String nome1, nome2, nome3;

        Scanner sc = new Scanner(System.in);

        Inum1 = sc.nextInt();
        Inum2 = sc.nextInt();
        Fnum3 = sc.nextFloat();
        Fnum4 = sc.nextFloat();
        Fnum5 = sc.nextFloat();
        nome1 = sc.nextLine();
        nome2 = sc.nextLine();
        nome3 = sc.nextLine();

        Impressora impressora = new Impressora();

        impressora.exibir(Fnum3);
        impressora.exibir(Fnum3, Fnum4);
        impressora.exibir(Fnum3, nome2);
        impressora.exibir(nome1, Fnum4);
        impressora.exibir(nome1, nome2, nome3);
        impressora.exibir(Inum1, Inum2, nome3);

    }

}
