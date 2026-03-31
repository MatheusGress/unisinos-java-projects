public class PincipalAluno {

    public static void main(String[] args) {

        int idAluno = 1;

        Aluno aluno1 = new Aluno("Brendamente Brasil", "1585258", 5, 9);

        idAluno += 1;
        Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);

        idAluno += 1;
        Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);
        
            System.out.println("--------\\ALUNO//--------");
        aluno1.imprimeInfo();
            System.out.println("--------\\ALUNO//--------");
        aluno2.imprimeInfo();
            System.out.println("--------\\ALUNO//--------");
        aluno3.imprimeInfo();

        aluno2.setNotaGrauA(9);

        System.out.println(
            "Nova média final de " + aluno2.getNome() +
            ": " + aluno2.getNotaGrauA()
        );

        System.out.println(
            "Matricula de " + aluno3.getNome() +
            ": " + aluno3.getMatricula()
        );

        aluno1.setMatricula("1585228");

        System.out.println();
        
        aluno2.setNotaGrauB(
            Teclado.leDouble(
                "Digite a nova nota para o grau B do aluno Radigunda: "
            )
        );

        System.out.println(
            "Nova nota do Grau B do Aluno " + aluno2.getNome() +
            ": " + aluno2.getNotaGrauB()
        );
    }
}