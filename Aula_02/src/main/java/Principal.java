import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Exercicio 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 0 para 'E' ou 1 para 'OU'");
        byte op = sc.nextByte();

        switch (op) {
            case 0:
                System.out.println("0 e 0 = 0");
                System.out.println("0 e 1 = 0");
                System.out.println("1 e 0 = 0");
                System.out.println("1 e 1 = 1");
                break;
            case 1:
                System.out.println("0 ou 0 = 0");
                System.out.println("0 ou 1 = 1");
                System.out.println("1 ou 0 = 1");
                System.out.println("1 ou 1 = 1");
                break;
            default:
                System.out.println("Opção inválida");
        }

        //Exercicio 2

        System.out.println("Entre com sua altura em centimetros");
        float altura = (float)sc.nextInt()/100;
                        //sc.nextInt()/100f
                        //sc.nextInt()/100.0

        System.out.println("Entre com seu peso em Kg");
        float peso = sc.nextFloat();
        float imc = peso/(altura*altura);

        if(imc<18.5) {
            System.out.println("Abaixo do peso");
        }else if(imc<24.9) {
            System.out.println("Peso ideal");
        }else if(imc<29.9) {
            System.out.println("Levemente acima do peso");
        }else if(imc<34.9) {
            System.out.println("Obesidade grau I");
        }else if(imc<39.9) {
            System.out.println("Obesidade grau II");
        }else{ //if(imc>40)
            System.out.println("Obresidade grau III");
        }

        sc.close();
        //Exercicios 3 e 4 ficam como desafio, em caso de dúvidas, entrem em contato comigo :)


        System.out.println("Essa frase é gigante," +
                " é só ter fé" + "Interpolei" + " essa aqio tambem" +
        "Essa tambem");

        System.out.println("Peso: " + peso + "Kg");

















    }

}
