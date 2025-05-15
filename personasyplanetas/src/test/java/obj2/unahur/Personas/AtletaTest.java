package obj2.unahur.Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AtletaTest {
    Atleta a1 = new Atleta(20);

    @Test
    void testGetMasaMuscular() {
        assertEquals(4, a1.getMasaMuscular());
    }

    @Test
    void testGetTecnicasQueConoce() {
        assertEquals(2, a1.getTecnicasQueConoce());
    }

    @Test
    void testPotencia() {
        assertEquals(160, a1.potencia());
    }

    @Test
    void testSetMasaMuscular() {
        a1.setMasaMuscular(10);
        assertEquals(10, a1.getMasaMuscular());
    }

    @Test
    void testSetTecnicasQueConoce() {
        a1.setTecnicasQueConoce(4);
        assertEquals(4, a1.getTecnicasQueConoce());
    }

    @Test
    void dadoUnAtletaNoEsDestacado(){
        assertFalse(a1.esDestacada());
    }

    void dadoUnAtletaEsDestacado(){
        a1.setTecnicasQueConoce(7);
        assertTrue(a1.esDestacada());
    }

    void dadoUnAtletaAumentaSuMasaMuscularAlEntrenar(){
        a1.entrenar(10);
        assertEquals(6, a1.getMasaMuscular());
    }

    @Test
    void dadoUnAtletaAprendeUnaTecnica() {
        a1.aprenderTecnica();
        assertEquals(3, a1.getTecnicasQueConoce());
    }
}
