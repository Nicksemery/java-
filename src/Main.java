import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Seu nome: ");
        p.setNome(sc.next());

        System.out.println("Sua idade: ");
        p.setIdade(sc.nextInt());


        System.out.println("Seu salário");
        p.setSalario(sc.nextDouble());


        System.out.println("Nome: "+ p.getNome());
        System.out.println("idade: " + p.getIdade());
        System.out.println("Salário: "+ p.getSalario());
    }
}