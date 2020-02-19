package exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTest {

    @Test
    public void criarObjetoCirculo(){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }
    @Test
    public void presencaAtributoCirculo(){
        Circulo c1 = new Circulo();
        c1.raio =  10.0;
        assertNotNull(c1.raio);
    }
    @Test
    public void metodoCalculoArea(){
//        Circulo c1 = new Circulo();
//        c1.raio = 10.0;
//        Double valorEsperado =  ;
//        Double valorObtido = c1.calcularArea();
//        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void metodoCalculoPerimetro(){
        Circulo c1 = new Circulo();
        c1.raio = 10.0;

    }
}
