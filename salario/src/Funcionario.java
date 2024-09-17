public class Funcionario {

    private String Nome;
    private double ValorH, salario;
    private int Hora;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getValorH() {
        return ValorH;
    }

    public void setValorH(double valorH) {
        ValorH = valorH;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int hora) {
        Hora = hora;
    }

    public double getSalario() {
        return salario;
    }

    public void CalcSalario(){
        salario = ValorH * Hora;
    }
}
