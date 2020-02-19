package exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTest {

    @Test
    public void criarObjetoRetangulo(){
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase(){
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        assertNotNull(r1.base);
    }

    @Test
    public void presencaAtributoAltura(){
        Retangulo r2 = new Retangulo();
        r2.altura = 10.0;
        assertNotNull(r2.altura);
    }

    @Test
    public void metodoCalcularArea(){

    }
}
