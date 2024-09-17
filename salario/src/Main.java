import java.util.Scanner;

// Faça um programa que calcule o salário de um funcionário com base
//no valor da hora trabalhada de R$ 15.00 e na quantidade de
//40 horas trabalhadas e exiba o salário.
public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionário? ");
        f.setNome(sc.nextLine());

        System.out.println("Hora trabalhada? ");
        f.setHora(sc.nextInt());

        System.out.println("Valor por hora? ");
        f.setValorH(sc.nextDouble());
        f.CalcSalario();

        System.out.println("Funcionário: "+ f.getNome());
        System.out.println("Valor por hora: "+ f.getValorH());
        System.out.println("Salário final: "+ f.getSalario());


    }
}