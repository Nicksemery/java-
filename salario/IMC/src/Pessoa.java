public class Pessoa {

    private String Nome;
    private double Peso, Altura, Imc;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getImc() {
        return Imc;
    }

    public void calc(){
        Imc = Peso / (Altura * Altura);
    }
}
