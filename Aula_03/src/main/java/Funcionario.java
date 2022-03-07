public class Funcionario {

    String nome,cpf;
    double salario;

    public Funcionario(String nome,String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(){}

    void tirarFerias(String mes){
        System.out.println(nome+" vai tirar férias em "+ mes);
    }

    double calculaSalarioAnual(){
        return 12*salario;
    }

    public double getSalario() {
        return salario;
    }
}
