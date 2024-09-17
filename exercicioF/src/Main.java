import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        int r;


        do {
            System.out.println("Aluno, digite: [1], professor, digite: [2]");
            int x = sc2.nextInt();
            switch (x) {
                case 1:

                    System.out.println("Nos informe o nome do aluno");
                    a.setNome(sc3.nextLine());

                    System.out.println("Primeira nota?");
                    a.setNota1(sc.nextDouble());

                    System.out.println("Segunda nota?");
                    a.setNota2(sc.nextDouble());

                    System.out.println("Terceira nota?");
                    a.setNota3(sc.nextDouble());

                    a.calc_media();
                    a.detalhes();
                    break;

                case 2:


                    System.out.println("Nome do professor");
                    p.setNome(sc.nextLine());

                    System.out.println("Qual a carga horaria?");
                    p.setHora_trabalhada(sc2.nextInt());

                    System.out.println("Valor da hora trabalhada?");
                    p.setValor_hora(sc2.nextDouble());

                    p.calc_salario();
                    p.Detalhes();



            }
            System.out.println("Para repetir digite [0]");
            r = sc.nextInt();
        }while (r == 0);
    }
}