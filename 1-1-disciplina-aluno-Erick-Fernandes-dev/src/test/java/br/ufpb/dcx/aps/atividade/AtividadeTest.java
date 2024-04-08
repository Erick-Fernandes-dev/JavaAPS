package br.ufpb.dcx.aps.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtividadeTest {

    Disciplina disciplina;

    @BeforeEach
    void setUp() {
        disciplina = new Disciplina(123, "Disciplina teste");
    }

    @Test
    void testDisciplina() {

        assertEquals(123,disciplina.getCodigo());

        assertNull(disciplina.getTurma(0));

        // criando a turma 1
        Turma turma = new Turma(1, disciplina);
        turma.getDisciplina().criarTurma();// 1
        assertNotNull(turma);
        assertEquals(1,turma.getCodigo());

        assertNotNull(disciplina.getTurma(1));
        System.out.println(disciplina.getTurma(2));
        // criando a turma 2
        Turma turma2 = new Turma(2, disciplina);
        turma2.getDisciplina().criarTurma();
        System.out.println(turma2.getCodigo());
        assertNotNull(turma2.getDisciplina().getTurma(2));



    }

    @Test
    void testTurma() {
        Turma turma1 = new Turma(1, disciplina);

        turma1.getDisciplina().criarTurma();
        turma1.setProfessor(new Professor("Joao"));

        assertEquals("Joao",turma1.getProfessor().getNome());

        assertNull(turma1.getAluno("222"));

        turma1.addAluno(new Aluno("2134","Maria"));
        assertNotNull(turma1.getAluno("2134"));
        assertEquals("Maria",turma1.getAluno("2134").getNome());
        turma1.addAluno(new Aluno("324","Jose"));

    }


    @Test
    void testProfessor(){
        Professor professor = new Professor("");
        assertEquals("",professor.getNome());
        professor.setNome("Nome Teste");
        assertEquals("Nome Teste",professor.getNome());
    }
}
