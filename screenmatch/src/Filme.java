public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome + "\n" + "Ano de lançamento: " + anoDeLancamento);
    }
}
