public class Funcionario {

  private String nome;
  private Long salario;

  public Funcionario() {
  }

  public Funcionario(String nome, Long salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void trabalhar() {
    System.out.println(ÒEstou trabalhando!Ó);
  }

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

}

