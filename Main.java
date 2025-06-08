public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis");
        Editora editora = new Editora("Companhia das Letras");
        LivroDeLivraria livro = new LivroDeLivraria(
            "Dom Casmurro", autor, editora, "1234567890", 1899, 49.90
        );

        System.out.println(livro);
    }
}