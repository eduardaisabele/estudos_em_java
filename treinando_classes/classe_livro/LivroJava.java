package treinando_classes.classe_livro;

public class LivroJava {
    public static void main(String[] args) {
        Livro livro = new Livro();
       //classe objeto = new construtor
      //nome do objeto.atributo 

        livro.setNome("Java para leigos");
        livro.setDescricao( "Livro java para iniciantes");
        livro.setIsbn("8576088010");
        livro.setPreco(71.20);
        livro.setAutor("Barry Burd");
        livro.setDataPub("01/11/2013"); 

        livro.dadosLivros();
    }
}
