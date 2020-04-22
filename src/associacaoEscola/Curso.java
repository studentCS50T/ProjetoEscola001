package associacaoEscola;

public class Curso {
    private String nome;
    private int qtdSemestres;
    private int cargaHoraria;
    private Disciplina disciplina;
    private Aluno aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdSemestres() {
        return qtdSemestres;
    }

    public void setQtdSemestres(int qtdSemestres) {
        this.qtdSemestres = qtdSemestres;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso(String nome, int qtdSemestres, int cargaHoraria, Disciplina disciplina, Aluno aluno) {
        this.nome = nome;
        this.qtdSemestres = qtdSemestres;
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }
    
    public String toString(){
        return "\n Dados do Curso" + 
               "\n Nome: " + getNome() +
               "\n Quantidade de Semestres: " + getQtdSemestres() +
               "\n Carga Horária: " + getCargaHoraria() +
               "\n Disciplina: " + getDisciplina() +
               "\n Aluno: " + getAluno(); 
    }
}
