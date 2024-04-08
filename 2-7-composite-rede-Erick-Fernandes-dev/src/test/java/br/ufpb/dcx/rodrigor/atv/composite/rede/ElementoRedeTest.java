package br.ufpb.dcx.rodrigor.atv.composite.rede;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementoRedeTest {

    AP ap;
    Celular celular;
    Notebook notebook;
    Roteador roteador;
    Switch sw;
    TV tv;

    @BeforeEach
    void setUp() {
        ap = new AP("algum access point wi-fi");
        celular = new Celular("algum celular");
        notebook = new Notebook("notebook qualquer");
        roteador = new Roteador("Algum roteador");
        sw = new Switch("algum Switch de Rede");
        tv = new TV("Smart TV");
    }

    @Test
    void testTiposInstancias() {

        // Todos os elementos devem ser do tipo "ElementoRede"
        assertTrue(ap instanceof ElementoRede);
        assertTrue(celular instanceof ElementoRede);
        assertTrue(notebook instanceof ElementoRede);
        assertTrue(roteador instanceof ElementoRede);
        assertTrue(sw instanceof ElementoRede);
        assertTrue(tv instanceof ElementoRede);

        //Alguns elementos são compostos, devem ser também do tipo "ElementoRedeComposto":
        assertTrue(sw instanceof ElementoRedeComposto);
        assertTrue(roteador instanceof ElementoRedeComposto);
        assertTrue(sw instanceof ElementoRedeComposto);
        assertTrue(sw instanceof ElementoRedeComposto);

    }

    @Test
    void testComposicaoObjetos() {

        Roteador roteador = new Roteador("Roteador XPTO");

        assertTrue(roteador.getElementos().isEmpty());

        ElementoRede celular = new Celular("Cel Joao", "234589723");
        celular.setIp("172.0.0.3");

        roteador.addElementoRede(celular);

        assertEquals(1,roteador.getElementos().size());
        assertEquals(celular,roteador.getElementos().get(0));

        roteador.addElementoRede(new Notebook("NB de Joao"));
        assertEquals(2,roteador.getElementos().size());

        roteador.addElementoRede(new TV("TV Samsung da sala de estar"));

        Roteador roteador2 = new Roteador("Roteador do escritorio");

        AP ap = new AP("TP-Link XY");
        roteador2.addElementoRede(ap);

        ap.addElementoRede(new Notebook("notebook xy"));
        ap.addElementoRede(new Celular("celular yz"));

        Switch sw = new Switch("Switch de Rede");

        roteador2.addElementoRede(sw);
    }
}
