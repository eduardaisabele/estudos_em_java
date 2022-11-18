package conceitos_e_caracteristicas;

public class CriaPessoa {
    public static void main(String[] args) {
        Pessoa arthur = new Pessoa();

        arthur.setNome("Arthur");
        arthur.setIdade(56);
        arthur.setSalario(5236.45);
        System.out.println(arthur.getNome());
        System.out.println(arthur.getIdade());
        System.out.println(arthur.getSalario());

    }
  
}
