package main.java.filme.novofilme;

import main.java.filme.modelos.Filme;

public class NovoFilme {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Miranha");
        meuFilme.setAnoDeLancamento(2012);

        meuFilme.exibeFichaTecnica();
    }
}
