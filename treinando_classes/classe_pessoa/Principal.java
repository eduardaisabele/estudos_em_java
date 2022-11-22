package treinando_classes.classe_pessoa;

public class Principal {
    private String nome;
    private int idade;
    private long cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}



// public class Principal {
//     public static void main(String[] args) {
//         long cpf = Long.parseLong("04758956489");

//         System.out.println(cpf);
//     }
// } 
