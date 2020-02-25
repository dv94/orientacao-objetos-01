package exercicios;

public class Funcionario {
    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    public String obterDados(){
        return nome;
        return idade;
        return email;
        return salario;
    }

    public void promover(Double porcentagemAumento){
        salario = salario + porcentagemAumento;
    }
}
