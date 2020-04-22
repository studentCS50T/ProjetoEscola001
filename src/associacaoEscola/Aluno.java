package associacaoEscola;

public class Aluno {
     private String matr;
     private String nome;
     private Origem origem;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Aluno(String matr, String nome, Origem origem) {
        this.matr = matr;
        this.nome = nome;
        this.origem = origem;
    }
    
    public String toString(){
        return "\n Matrícula: " + getMatr() +
               "\n Nome: " + getNome() +
               "\n Origem: " + getOrigem(); 
    }
}
