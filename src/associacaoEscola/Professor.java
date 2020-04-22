package associacaoEscola;

public class Professor {
    private String matr;
    private String nome;
    private String endereco;
    private Aluno aluno;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Professor(String matr, String nome, String endereco, Aluno aluno, Origem origem) {
        this.matr = matr;
        this.nome = nome;
        this.endereco = endereco;
        this.aluno = aluno;
        this.origem = origem;
    }
    
    public String toString(){
        return "\n Matrícula: " +getMatr() +
               "\n Nome: " + getNome() +
               "\n endereço: " + getEndereco() +
               "\n Aluno: " + getAluno() +
               "\n Origem: " + getOrigem(); 
    }    
}
