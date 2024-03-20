import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCertidaoObitoTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("CertidaoObito");
        assertEquals("Certidão de óbito criada", servico.criar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("CertidaoObito");
        assertEquals("Certidão de óbito emitida", servico.emitir());
    }
}
