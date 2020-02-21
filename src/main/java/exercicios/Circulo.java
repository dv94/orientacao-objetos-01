package exercicios;

public class Circulo {
    public Double raio;

    public Double calcularArea(){
        return 3.141516 * raio * raio;
    }

    public Double calcularPerimentro(){
        return 2 * (3.141516 * raio);
    }
}
