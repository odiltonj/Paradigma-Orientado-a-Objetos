public class Caes{
  //Passo 1 - Declarar os atributos
  String nome;
  String raca;
  int peso;
  String corOlhos;
  int quantPatas;  

  //Passo 2 - Instaciar a classe e os atributos
  public Caes(String nome, String raca, int peso, String corOlhos, int quantPatas){
    this.nome = nome;
    this.raca = raca;
    this.peso = peso;
    this.corOlhos = corOlhos;
    this.quantPatas = quantPatas;
  }

  //Passo 3 - Criar os getters e setters dos atributos
  public String getnome(){
    return nome;
  }
  public void setnome(String nome){
    this.nome = nome;
  }

  public String getraca(){
    return raca;
  }
  public void setraca(String raca){
    this.raca = raca;
  }

  public int getpeso(){
    return peso;
  }
  public void setpeso(int peso){
    this.peso = peso;
  }

  public String getcorOlhos(){
    return corOlhos;
  }
  public void setcorOlhos(String corOlhos){
    this.corOlhos = corOlhos;
  }

  public int getquantPatas(){
    return quantPatas;
  }
  public void setquantPatas(int quantPatas){
    this.quantPatas = quantPatas;
  }
  
  //Passo 4 - Criar os métodos


}
