package associacaoEscola;

public class TestaCurso {

    public static void main(String[] args) {
        Curso curso = new Curso("Técnico em Informática",4,3500,
                      new Disciplina ("LTP2",120,
                              new Aluno("26603-5","Timóteo Dima",
                                      new Origem("Pai Timóteo","Mãe Timóteo",
                                              new Cidade("Taguatinga",
                                                      new Estado("Taguatinga","DF")))),
                              new Professor("12345","Vinícius Cruz","Rua Torres",
                                      new Aluno("26603-5","Timóteo Dima",
                                              new Origem("Pai Timóteo","Mãe Timóteo",
                                                      new Cidade("Taguatinga",
                                                            new Estado("Taguatinga","DF")))),
                               new Origem("Pai Vinícius","Mãe Vinícius",
                                              new Cidade("Brasília",
                                                      new Estado("Brasília","DF"))))),
                      new Aluno("215487","João",
                              new Origem("Pai João","Mãe João",
                                      new Cidade("Brasília",
                                              new Estado("Brasília","DF")))));
        System.out.println(curso);
    }
    
}
