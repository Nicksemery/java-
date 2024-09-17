public class Professor extends Pessoa {

    private double Valor_hora, salario;
    private int hora_trabalhada;

    public double getValor_hora() {
        return Valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        Valor_hora = valor_hora;
    }

    public int getHora_trabalhada() {
        return hora_trabalhada;
    }

    public void setHora_trabalhada(int hora_trabalhada) {
        this.hora_trabalhada = hora_trabalhada;
    }

    public double getSalario() {
        return salario;
    }

    public double calc_salario(){
        salario = hora_trabalhada * Valor_hora;
        return salario;
    }

    public void Detalhes(){

        System.out.println("Professor(a): "+ getNome());
        System.out.println("Hora trabalhada: "+ getHora_trabalhada());
        System.out.println("Valor da hora: "+ getValor_hora());
        System.out.println("Salário: "+ calc_salario());
    }
}
