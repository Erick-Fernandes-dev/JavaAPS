package br.ufpb.dcx.aps.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtividadeTest {


    @Test
    void testTurma() {
        Turma turma1 = new Turma(1);
        turma1.setProfessor(new Professor("Joao"));
        assertEquals("Joao",turma1.getProfessor().getNome());

        assertNull(turma1.getAluno(222));

        turma1.addAluno(new Aluno("2134","Maria"));
        assertNotNull(turma1.getAluno(2134));
        assertEquals("Maria",turma1.getAluno(2134).getNome());
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
