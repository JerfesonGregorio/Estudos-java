package escola;

import java.util.*;
public class Professor extends Pessoa{

    private String forcamacaoAcademica;
    private double salario;

    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;

    public Professor() {
        disciplinas = new ArrayList<Disciplina>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void excluirDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplinas() {
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }

    public String getForcamacaoAcademica() {
        return forcamacaoAcademica;
    }

    public void setForcamacaoAcademica(String forcamacaoAcademica) {
        this.forcamacaoAcademica = forcamacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aplicarAvaliacao() {

    }
}
