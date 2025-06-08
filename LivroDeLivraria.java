public class LivroDeLivraria {
    private String titulo;
    private Autor autor;
    private Editora editora;
    private String isbn;
    private int anoPublicacao;
    private double preco;

    public LivroDeLivraria(String titulo, Autor autor, Editora editora, String isbn, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "=== Detalhes do Livro ===\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor.getNome() + "\n" +
                "Editora: " + editora.getNome() + "\n" +
                "ISBN: " + isbn + "\n" +
                "Ano de Publicação: " + anoPublicacao + "\n" +
                String.format("Preço: R$ %.2f\n", preco);
    }
}