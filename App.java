public class App {
    public static void main(String[] args){

        Funcionario f1 = new Funcionario("Joao", 1000);
        Funcionario f2 = new Funcionario("Maria", 200);


        System.out.println("nome: "+f1.nome);
        System.out.println("salario: "+f1.salario);
        System.out.println(f2);
        
    }
}
