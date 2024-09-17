import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();


        System.out.println("Nos informe o nome do aluno");
        a.setNome(sc.nextLine());

        System.out.println("Primeira nota?");
        a.setNota1(sc.nextDouble());

        System.out.println("Segunda nota?");
        a.setNota2(sc.nextDouble());

        System.out.println("Terceira nota?");
        a.setNota3(sc.nextDouble());

        a.calc_media();
        a.detalhes();

    }
}
