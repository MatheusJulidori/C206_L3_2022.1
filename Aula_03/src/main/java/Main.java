public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Matheus","12345678900",2000);
        Funcionario f2 = new Funcionario();

        //f1.nome = "Matheus";
        //f1.cpf = "12345678900";
        //f1.salario = 2000;

        f2.nome = "Fulano";
        System.out.println(f1.cpf);
        f1.tirarFerias("Abril");

    }

}
