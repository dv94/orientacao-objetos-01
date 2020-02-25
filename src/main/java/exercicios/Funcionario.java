package exercicios;

public class Funcionario {
    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String obterDados() {
        return this.nome + ", "+ this.idade + "anos (" +this.email+  ")";
    }
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public Integer getIdade () {
        return idade;
    }
    public void setIdade (Integer idade){
        this.idade = idade;
    }

    public Double getSalario () {
        return salario;
    }

    public void setSalario (Double salario){
        this.salario = salario;
    }



    public void promover(Double porcentagemAumento){
        salario = (salario * porcentagemAumento/100) + salario;
    }
}
