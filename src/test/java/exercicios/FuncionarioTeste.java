package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class FuncionarioTeste {

    @Test
    public void criarObjetoFuncionario(){
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }
    @Test
    public void criarAtributosFuncionario(){
        Funcionario f1 = new Funcionario();
        f1.nome = "Ash";
        f1.idade = 14;
        f1.email = "ash@ash.com";
        f1.salario = 1000.0;
        assertNotNull(f1.obterDados());
    }
    @Test
    public void metodoObterDados(){
        String nome = "Jose";
        Integer idade = 10;
        String email = "jose.@jose.com";

        Funcionario f1 = new Funcionario(nome,email,idade);

        String result = nome + ", "+ idade +  "anos (" +email+  ")";

        assertEquals(result,f1.obterDados());

    }
    @Test
    public void promeverSalario(){
        Funcionario f1 = new Funcionario();
        Double porcentangem = 10.00;
        Double salario = 3000.00;
        f1.setSalario(salario);
        Double result = (salario * porcentangem/100) + salario;
        f1.promover(porcentangem);
        assertEquals(result,f1.salario);
    }

}
