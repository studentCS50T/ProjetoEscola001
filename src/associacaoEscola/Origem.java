package associacaoEscola;

public class Origem {
    private String nomePai;
    private String nomeMae;
    private Cidade cidade;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomMae) {
        this.nomeMae = nomMae;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Origem(String nomePai, String nomeMae, Cidade cidade) {
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.cidade = cidade;
    }

   
    
    public String toString(){
        return "\n Nome do Pai: " + getNomePai() +
               "\n Nome Mãe: " + getNomeMae() + 
               "\n Cidade: " + getCidade(); 
    }
}
