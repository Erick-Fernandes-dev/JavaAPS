package br.ufpb.dcx.aps.sysacademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    Disciplina disciplina;
    Curso curso;

    Turma turma;
    @BeforeEach
    void setup(){
        curso = new Curso("SILCC");
        disciplina = new Disciplina(curso, "1231","APS");
        turma = new Turma(1,disciplina);
    }


    @Test
    void testConstrutor() {
        assertThrows(IllegalArgumentException.class, () -> new Turma(-1,disciplina), "O código da turma não pode ser negativo");
        assertThrows(IllegalArgumentException.class, () -> new Turma(1,null), "A disciplina passada para a turma não pode ser null");
    }


    @Test
    void testProfessor(){

        assertThrows(IllegalArgumentException.class, () -> turma.setProfessor(null),"Turma não pode receber um professor null");

        turma.setProfessor(new Professor("12","Teste"));
        assertEquals(new Professor("12","Teste"),turma.getProfessor());
    }

    @Test
    void testMatriculaDeAlunos(){
        Aluno alunoTeste = new Aluno("123","Joao");

        // Ao ser criada, a turma deve estar vazia. Nenhum aluno matriculado.
        assertTrue(turma.getAlunos().isEmpty());

        assertThrows(Exception.class, () -> turma.matricularAluno(alunoTeste),
                "Não deve ser possível matricular um aluno em uma turma se este aluno não estiver cadastrado no curso da disciplina");


        curso.cadastrarAluno(alunoTeste);
        assertEquals(alunoTeste,turma.matricularAluno(alunoTeste));

    }

    @Test
    void testMetodosProibidos(){
        assertThrows(NoSuchMethodException.class, () -> Turma.class.getMethod("setCodigo", String.class),
                "A classe Turma não deve ter o método `setCodigo`");

        assertThrows(NoSuchMethodException.class, () -> Turma.class.getMethod("setDisciplina", Disciplina.class),
                "A classe Turma não deve ter o método `setDisciplina`");

    }

}