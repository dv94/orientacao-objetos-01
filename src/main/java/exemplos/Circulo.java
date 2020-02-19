package exemplos;

public class Circulo {
    public Double raio;

    public Double calcularArea(){
        return raio;
    }

    public Double calcularPerimetro(){
        return 2 * 3.14285714 * raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
