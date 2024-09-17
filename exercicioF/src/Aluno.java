public class Aluno extends Pessoa {

    private double nota1 , nota2, nota3, media;


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calc_media(){
        media = (nota1 + nota2 + nota3)/3;
    }

    public String situacao() {
        if (media >= 7.0) {
             return ("aprovado");
        } else if (media >= 5.0 && media <= 6.9){
            return ("Recuperação");
        } else{
           return ("Reprovado");
        }
    }

    public void detalhes(){

        System.out.println("situação do aluno.");
        System.out.println("Média do aluno: " + getNome());
        System.out.println(getMedia());
        System.out.println("Quadro de notas " + getNota1()+ "/" + getNota2()+ "/" + getNota3());
        System.out.println("Situação:" + situacao());
    }
}
