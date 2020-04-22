package associacaoEscola;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Aluno aluno;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina(String nome, int cargaHoraria, Aluno aluno, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.aluno = aluno;
        this.professor = professor;
    }
    
    public String toString(){
        return "\n Nome: " + getNome() +
               "\n Carga Horária: " + getCargaHoraria() +
               "\n Aluno: " + getAluno() +
               "\n Professor: " + getProfessor(); 
    }
}
