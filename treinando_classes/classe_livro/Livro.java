package treinando_classes.classe_livro;

public class Livro {
    private String nome;
    private String descricao;
    private String autor;
    private String isbn;
    private double preco;
    private String dataPub;

    public void dadosLivros(){
      System.out.println("Nome: " + nome);  
      System.out.println("Breve descrição : " + descricao);  
      System.out.println("Autor : " + autor);  
      System.out.println("isbn : " + isbn);  
      System.out.println("Preço: " + preco);  
      System.out.println("Data de Publicação: " + dataPub);  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataPub() {
        return dataPub;
    }

    public void setDataPub(String dataPub) {
        this.dataPub = dataPub;
    }
}
