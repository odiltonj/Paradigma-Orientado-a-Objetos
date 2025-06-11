public class Autor {
    String nome;
    String cpf;
    String cidade;

    public Autor(String nome, String cpf, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
    }

    //gets e sets dos atributos.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //métodos dessa classe Autor
    public escreveLivro(){
        System.out.println("O Autor escreveu este livro");
    }

}
