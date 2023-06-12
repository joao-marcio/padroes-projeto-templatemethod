package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class SoftwareTest {
        @Test
        void deveRetonarSoftwareAtrasado() {
            SoftwareForaPrazo SoftwareForaPrazo = new SoftwareForaPrazo();
            SoftwareForaPrazo.setNome("Venus Software");
            SoftwareForaPrazo.setDiasAtrasado(45);
            assertEquals("Atrasado", SoftwareForaPrazo.verificarPrazo());
        }

        @Test
        void deveRetonarSoftwareEntregue() {
            SoftwareForaPrazo SoftwareForaPrazo = new SoftwareForaPrazo();
            SoftwareForaPrazo.setNome("Venus Software");
            SoftwareForaPrazo.setDiasAtrasado(15);
            assertEquals("Entregue", SoftwareForaPrazo.verificarPrazo());
        }

        @Test
        void deveRetornarInformacoes() {
            SoftwareForaPrazo SoftwareForaPrazo = new SoftwareForaPrazo();
            SoftwareForaPrazo.setNome("Venus Software");
            SoftwareForaPrazo.setDiasAtrasado(15);
            assertEquals("Software{Nome='Venus Software', Software dentro do prazo: Entregue}", SoftwareForaPrazo.getInfo());
        }
    }