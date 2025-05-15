public class App {
    public static void main(String[] args){

        Funcionario f1 = new Funcionario("Joao", 1000, "05798358550");
        Funcionario f2 = new Funcionario("Maria", 200, "12345678900");


        System.out.println("nome: "+f1.nome);
        System.out.println("salario: "+f1.salario);
        System.out.println("cpf: "+f1.cpf);

        System.out.println(f2);
        
    }
}
