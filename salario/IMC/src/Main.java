import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Calculando o Imc ");
        System.out.println("Qual seu nome?");
        p.setNome(sc.nextLine());

        System.out.println("Qual seu peso? ");
        p.setPeso(sc.nextDouble());

        System.out.println("Qual sua altura?");
        p.setAltura(sc.nextDouble());

        p.calc();

        System.out.println("Nome: "+ p.getNome());
        System.out.println("Peso: "+ p.getPeso());
        System.out.println("Altura: "+ p.getAltura());
        System.out.println("IMC: "+ p.getImc());


    }
}