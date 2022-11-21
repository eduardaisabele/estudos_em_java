package treinando_classes.classe_livro;

public class LivroFantasia {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setNome("O Senhor dos Anéis");
        livro.setDescricao("O Senhor dos Anéis (The Lord of the Rings, no original) é um livro de alta fantasia, escrito pelo escritor britânico J. R. R. Tolkien. Escrita entre 1937 e 1949, com muitas partes criadas durante a Segunda Guerra Mundial,");
        livro.setIsbn("8533619626");
        livro.setPreco(230.00);
        livro.setAutor("J. R. R. Tolkien");
        livro.setDataPub("01/01/2001");

        livro.dadosLivros();
    }
}
