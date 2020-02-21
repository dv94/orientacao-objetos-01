package exercicios;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo(){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos(){
        Circulo c1 = new Circulo();
        c1.raio = 15.0;
        assertNotNull(c1.raio);
    }

    @Test
    public void metodoCalculoArea(){
        //arrange
        Circulo c1 = new Circulo();
        c1.raio = 15.0;
        Double valorEsperazdo = 706.841100;
        //act
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEsperazdo, valorObtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Circulo c1 = new Circulo();
        c1.raio = 15.0;
        Double valorEsperado = 94.245480;
        //act
        Double valorObtido = c1.calcularPerimentro();
        //assert
        assertEquals(valorEsperado, valorObtido);

    }

}
