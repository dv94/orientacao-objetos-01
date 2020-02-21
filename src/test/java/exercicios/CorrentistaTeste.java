package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criarObejetoCorrentista(){
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }
    @Test
    public void criarAtributos(){
        Correntista c1 = new Correntista();
        c1.codigo = "1";
        c1.nome = "Juan";
        c1.telefone = "11-111111111";
        c1.email = "juan@juan.com";
        assertNotNull(c1.getCodigoCliente());
       /* assertNotNull(c1.nome);
        assertNotNull(c1.telefone);
        assertNotNull(c1.email);*/

    }

}
