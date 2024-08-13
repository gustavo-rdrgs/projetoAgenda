package br.ufpb.dcx.gustavo.rodrigues.agenda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatoTest {
    @Test
    public void testaConstrutor(){
        Contato c1 = new Contato("Gustavo", 8, 6);
        assertEquals("Gustavo", c1.getNome());
        assertEquals(8, c1.getDiaAniversario());
        assertEquals(6, c1.getMesAniversario());
    }
}
