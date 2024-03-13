package relacionamentos;

import modelos.*;

public class AssociacaoMuitosParaMuitos {

    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matemática");
        disciplina1.setCargaHoraria(80);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Português");
        disciplina2.setCargaHoraria(60);

        Professor professor1 = new Professor();
        professor1.setNome("Sumeilton");
        professor1.setMatricula(12);
        professor1.setForcamacaoAcademica("Mestre");
        professor1.setSalario(12000.00);

        Professor professor2 = new Professor();
        professor2.setNome("Lúcia");
        professor2.setMatricula(15);
        professor2.setForcamacaoAcademica("Doutor(a)");
        professor2.setSalario(8000.00);

        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);
        disciplina1.adicionarProfessor(professor2);

        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);

        for (int i = 0; i < disciplina1.quantidadeProfessor(); i++) {
            System.out.println(disciplina1.getProfessor(i).getNome());
        }
    }

}
