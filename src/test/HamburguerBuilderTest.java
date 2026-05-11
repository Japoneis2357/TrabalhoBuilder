import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HamburguerBuilderTest {
    @Test
    void deveRetornarExcecaoParaHamburguerSemNumero() {
        try {
            HamburguerBuilder hamburguerBuilder = new HamburguerBuilder();
            Hamburguer hamburguer = hamburguerBuilder
                    .setNome("X-Bacon Especial")
                    .setMolho("Barbecue")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número do pedido inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaHamburguerSemNome() {
        try {
            HamburguerBuilder hamburguerBuilder = new HamburguerBuilder();
            Hamburguer hamburguer = hamburguerBuilder
                    .setNumero(1)
                    .setMolho("Barbecue")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do hambúrguer inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarHamburguerValido() {
        HamburguerBuilder hamburguerBuilder = new HamburguerBuilder();
        Hamburguer hamburguer = hamburguerBuilder
                .setNumero(1)
                .setNome("X-Bacon Especial")
                .setMolho("Barbecue")
                .build();
        assertNotNull(hamburguer);
    }
}