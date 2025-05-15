// Criacao de classe Funcionario

public class Funcionario {

// Passo 1 - Criar atributos da classe (Tipo  Nome do Atributo)
  private String nome;
  private Long salario;

// Passo 2 - Instaciar a classe para objeto - utiliza o this.variavel = variavel;
  public Funcionario(String nome, Long salario) {
    this.nome = nome;
    this.salario = salario;
  }

// Passo 3 - Criar os getters e setters dos atributos
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Long getSalario() {
    return salario;
  }

  public void setSalario(Long salario) {
    this.salario = salario;
  }

// Passo 4 - Criar os métodos - public void nome_metodo(){}

  public void trabalhar() {
    System.out.println("Estou trabalhando!");
  }



}

