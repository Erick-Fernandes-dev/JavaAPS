package br.ufpb.dcx.aps.atividades.atv04;

public class App {

    public static void main(String[] argsadd){


        CursoFacade curso = new CursoFacade("Sistemas de Informação");

        Aluno aluno1 = new Aluno("123", "João");
        Aluno aluno2 = new Aluno("456", "Maria");
        Aluno aluno3 = new Aluno("789", "José");

        curso.matricular(aluno1);
        curso.matricular(aluno2);
        curso.matricular(aluno3);

        Disciplina disciplina1 = curso.criarDisciplina("123", "Programação Orientada a Objetos");
        Disciplina disciplina2 = curso.criarDisciplina("456", "Estrutura de Dados");
        Disciplina disciplina3 = curso.criarDisciplina("789", "Banco de Dados");

        Professor professor1 = new Professor("123", "João");
        Professor professor2 = new Professor("456", "Maria");
        Professor professor3 = new Professor("789", "José");



        Turma turma1 = disciplina1.criarTurma(1);
        Turma turma2 = disciplina2.criarTurma(2);
        Turma turma3 = disciplina3.criarTurma(3);


        turma1.setProfessor(professor1);
        turma2.setProfessor(professor2);
        turma3.setProfessor(professor3);


        turma1.getAlunos().add(aluno1);
        turma1.getAlunos().add(aluno2);
        turma1.getAlunos().add(aluno3);

        turma2.getAlunos().add(aluno1);
        turma2.getAlunos().add(aluno2);
        turma2.getAlunos().add(aluno3);

        turma3.getAlunos().add(aluno1);
        turma3.getAlunos().add(aluno2);
        turma3.getAlunos().add(aluno3);

        System.out.println("Alunos matriculados no curso de " + curso.getNome());

        for(Aluno aluno : curso.getAlunos()){
            System.out.println(aluno.getNome());
        }

        System.out.println("Alunos matriculados na disciplina " + disciplina1.getNome());

        for(Aluno aluno : turma1.getAlunos()){
            System.out.println(aluno.getNome());
        }

        System.out.println("Alunos matriculados na disciplina " + disciplina2.getNome());

        for(Aluno aluno : turma2.getAlunos()){
            System.out.println(aluno.getNome());
        }

        System.out.println("Alunos matriculados na disciplina " + disciplina3.getNome());

        for(Aluno aluno : turma3.getAlunos()){
            System.out.println(aluno.getNome());
        }

        System.out.println("Professor da disciplina " + disciplina1.getNome() + ": " + turma1.getProfessor().getNome());

        System.out.println("Professor da disciplina " + disciplina2.getNome() + ": " + turma2.getProfessor().getNome());

        System.out.println("Professor da disciplina " + disciplina3.getNome() + ": " + turma3.getProfessor().getNome());










    }
}
