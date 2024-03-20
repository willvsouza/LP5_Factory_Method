import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCertidaoCasamentoTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("CertidaoCasamento");
        assertEquals("Certidão de casamento criada", servico.criar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("CertidaoCasamento");
        assertEquals("Certidão de casamento emitida", servico.emitir());
    }
}
