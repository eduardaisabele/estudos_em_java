package exercicios.curso_loiane.exercicios24_25.livro;

import java.util.Date;

public class Livro01 {
    public static void main(String[] args) {
        Livro livro01 = new Livro();
        Livraria cliente01 = new Livraria();

        livro01.titulo = "A Biblioteca da Meia-Noite";
        livro01.editora = "Bertrand Brasil";
        livro01.idioma = "Português";
        livro01.isbn = "655838544";
        livro01.anoLancamento = 2021;
        livro01.numeroPagina = 308;
        livro01.avaliacoes = 4.5;

        cliente01.emprestado = true;
        cliente01.dataEntrega = new Date();
        cliente01.nomeCliente = "Lucia";
    }
}
