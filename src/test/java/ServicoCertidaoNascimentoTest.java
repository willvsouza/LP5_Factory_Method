import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoCertidaoNascimentoTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("CertidaoNascimento");
        assertEquals("Certidão de nascimento criada", servico.criar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("CertidaoNascimento");
        assertEquals("Certidão de nascimento emitida", servico.emitir());
    }
}
