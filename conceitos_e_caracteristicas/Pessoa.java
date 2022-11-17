//criando classe
package conceitos_e_caracteristicas;

public class Pessoa {

    //atributos; private indica que so poderam ser acessadas de dentro da classe que foram declaradas
    private String nome;
    private int idade;
    private double salario;

    //encapsulamento; metodos
    //O método get retorna por padrão o valor do atributo ao qual se refere.
    public String getNome() {
        return nome;
    }

    //set tem por função de atribuir valor ao atributo ao qual se refere.
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
