import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class IntegrationTest {

    @Test
    public void testPrintMessage() {
        String message = "AQUI DEBEN IR LOS TEST DE INTEGRACION";
        assertEquals(message, "AQUI DEBEN IR LOS TEST DE INTEGRACION");
    }
}
