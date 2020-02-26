import exemplos.Aluno;
import exemplos.Circulo;
import exercicios.Correntista;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.sobrenome = "da Silva";
        a1.telefone = "11-1111111";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.sobrenome = "do Santos";
        a2.telefone = "12-121212";

        System.out.println(a1.nome);
        System.out.println(a1.sobrenome);
        //System.out.println(a1.nome + " " + a1.sobrenome);
        System.out.println(a1.getNomeCompleto());

        System.out.println(a2.nome);
        System.out.println(a2.sobrenome);
        //System.out.println(a2.nome + " " + a2.sobrenome);
        System.out.println(a2.getNomeCompleto());

//        Correntista c1 = new Correntista();
//        c1.codigo = "1";
//        c1.nome = "Juan";
//        c1.telefone = "11-111111111";
//        c1.email = "juan@juan.com";
//
//        System.out.println(c1.codigo);
//        System.out.println(c1.nome);
//        System.out.println(c1.telefone);
//        System.out.println(c1.email);
//        System.out.println(c1.getCodigoCliente());
//

        System.out.println(calcularAreaQuadrado(10.0));
        System.out.println(calcularPerimetroQuadrado(10.0));

      /*  System.out.println(calculoAreaRetanguo(3.00, 2.00));  // tentativa minha de programa.
        System.out.println(calculoAreaRetangulo(2.00));  //tentativa minha de programa.
        System. out.println(calcularPerimetroRetangulo(2 * (base + altura)));*/

//        Circulo c1 = new Circulo();
//        c1.setRaio(10.00);
//      System.out.println(c1.calcularArea());
//      System.out.println(c1.calcularPerimetro());



    }

    public static Double calcularAreaQuadrado(Double lado) {
        return lado * lado;
    }

    public static Double calcularPerimetroQuadrado(Double lado) {
        return 4 * lado;
    }

    /*public static Double calculoAreaRetanguo(Double base *altura){
        return base * altura;
    }

    public static Double calcularPerimetroRetangulo(Double 2 * (base + altura)){
        return 2 * (base + altura);
    }*/

    public static Double calcularAreaCirculo(Double raio){
        return raio * raio;
    }

    public static Double calcularPerimentroCirculo(Double raio){
        return 2 * 3.14285714 * raio;
    }
}
