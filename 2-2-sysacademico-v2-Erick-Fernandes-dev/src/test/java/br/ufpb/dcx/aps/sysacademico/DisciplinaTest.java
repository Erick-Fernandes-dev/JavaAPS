package br.ufpb.dcx.aps.sysacademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    Disciplina disciplina;
    Curso curso;

    @BeforeEach
    void setup(){
        this.curso = new Curso("SILCC");
        this.disciplina = new Disciplina(curso,"123","APS");
    }


    @Test
    void testNome(){
        assertEquals("APS",disciplina.getNome());
        assertThrows(IllegalArgumentException.class,() -> disciplina.setNome(null),
                "O nome da disciplina não pode ser nulo");
        assertDoesNotThrow(() -> new Disciplina(curso,"123",null),
                "Quando a disciplina é criada, seu nome pode ser null");

    }

    @Test
    void testCodigo(){
        assertEquals("123",disciplina.getCodigo());

        assertThrows(IllegalArgumentException.class, () -> new Disciplina(curso,null,"APS"),
                "O codigo da disciplina não pode ser `null`");
    }


    @Test
    void testTurma() {
        assertTrue(disciplina.getTurmas().isEmpty());
        Turma turma1 = disciplina.criarTurma();
        assertEquals(turma1,disciplina.getTurma(1));
        assertEquals(1,turma1.getCodigo());
        assertThrows(Exception.class, () -> disciplina.getTurma(-1));
        assertThrows(Exception.class, () -> disciplina.getTurma(2));

        disciplina.criarTurma();
        assertEquals(2,disciplina.getTurmas().size());

    }

    @Test
    void testeCurso() {
        assertEquals(curso, disciplina.getCurso());
        assertThrows(IllegalArgumentException.class, () -> new Disciplina(null,"123","APS"),
                "O curso da disciplina não pode ser `null`");
    }

    @Test
    void testMetodosProibidos(){
        assertThrows(NoSuchMethodException.class, () -> Disciplina.class.getMethod("setCodigo", String.class),
                "A classe Disciplina não deve ter o método `setCodigo`");
        assertThrows(NoSuchMethodException.class, () -> Disciplina.class.getMethod("setCurso", Curso.class),
                "A classe Disciplina não deve ter o método `setCurso`");

    }
}