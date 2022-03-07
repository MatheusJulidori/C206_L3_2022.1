public class Main {


    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[5];
        Aluno aluno1 = new Aluno("Pedro Hugo",245);
        alunos[0] = aluno1;

        alunos[1] = new Aluno("Lucas Sawada", 241);
        alunos[3] = new Aluno("Matheus Julidori", 66);


        System.out.println(alunos[0].nome);
        System.out.println(alunos[1].matricula);
        System.out.println(alunos[3]);
        System.out.println(alunos);

        //alunos.lenght retorna o tamanho do array
        // Ótimo para iterações que utilizam o valor da posição do array
        for (int i =0;i< alunos.length;i++){
            if(alunos[i] != null) {
                System.out.println(alunos[i].nome);
                System.out.println("Numero na chamada: " + (i + 1));
            }
        }

        //Ótimo para iterações simples
        for (Aluno aluno : alunos) {
            if (aluno != null)
                System.out.println(aluno.nome);
        }

    }

}
