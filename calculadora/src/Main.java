import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int r;
        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do{
            System.out.println("Escolha dois números");
            double n1, n2;

            System.out.println("Primeiro número");
            n1 = sc.nextDouble();
            System.out.println("Segundo número");
            n2 = sc.nextDouble();

            System.out.println("Digite: [1] para somar, [2] para subtrair, [3] para multiplicar, [4] para dividir");
            int x = sc2.nextInt();
            switch (x){
                case 1:
                    System.out.println("Somar:");
                    c.somar(n1,n2)

            }
        }


        }
    }