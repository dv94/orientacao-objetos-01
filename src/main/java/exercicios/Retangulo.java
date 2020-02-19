package exemplos;

public class Retangulo {
    public Double base;
    public Double altura;

    public Double calcularArea(){
        return base * altura;

    }
    public Double calcularPerimentro(){
        return 2 * (this.base + this.altura);
    }
}
