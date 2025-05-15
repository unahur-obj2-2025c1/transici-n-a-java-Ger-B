package obj2.unahur.Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonaTest {

    Persona p1 = new Persona(24);
    Persona p2 = new Persona(35);
    Persona p3 = new Persona(8);
    Persona p4 = new Persona(25);

    @Test
    void dadaUnaPersonaEsDestacada() {
        assertTrue(p2.esDestacada());
        assertTrue(p4.esDestacada());
    }

    void dadaUnaPersonaNoEsDestacada() {
        assertFalse(p1.esDestacada());
    }

    @Test
    void dadasDosPersonasSuInteligenciaEsLaCorrecta() {
        assertEquals(12, p1.inteligencia());
        assertEquals(8, p3.inteligencia());
    }

    @Test
    void dadaUnaPersonaSuPotenciaEsLaCorrecta() {
        assertEquals(20, p1.potencia());
    }

    @Test
    void dadaUnaPersonaSuEdadEsLaCorrecta(){
        assertEquals(8, p3.getEdad());
    }
}
