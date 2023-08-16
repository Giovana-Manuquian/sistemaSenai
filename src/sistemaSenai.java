import java.util.Scanner;

public class sistemaSenai {

    public static void main(String[] args) {

        String nome;
        int opcoesCursos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("********************Seja bem vindo(a) ao SENAI********************");
        System.out.print("Para continuarmos, digite seu nome: ");
        nome = teclado.next();

        while (true) {
            System.out.print("Digite a opção do curso que deseja cursar: \n" +
                    "1- Python \n" +
                    "2- Java \n" +
                    "3- C \n" +
                    "4- C++ \n" +
                    "5- C# \n" +
                    "6- ReactJs \n" +
                    "Escolha a opção [1-6]: "
            );

            if (teclado.hasNextInt()) {
                opcoesCursos = teclado.nextInt();
                if (opcoesCursos >= 1 && opcoesCursos <= 6) {
                    break; // Sai do loop se a opção estiver correta
                } else {
                    System.out.println("Opção inválida. Escolha uma opção de 1 a 6.");
                }
            } else {
                System.out.println("Digite apenas as opções em números.");
                teclado.next(); // Descarta a entrada inválida
            }
        }

        switch (opcoesCursos) {

            case 1:
                System.out.println("Seja bem-vindo(a) ao curso Python! Suas aulas começam 04/09/2023");
                break;

            case 2:
                System.out.println("Seja bem-vindo(a) ao curso Java! Suas aulas começam 10/09/2023");
                break;

            case 3:
                System.out.println("Seja bem-vindo(a) ao curso C! Suas aulas começam 15/09/2023");
                break;

            case 4:
                System.out.println("Seja bem-vindo(a) ao curso C++! Suas aulas começam 20/09/2023");
                break;

            case 5:
                System.out.println("Seja bem-vindo(a) ao curso C#! Suas aulas começam 25/09/2023");
                break;

            case 6:
                System.out.println("Seja bem-vindo(a) ao curso ReactJs! Suas aulas começam 30/09/2023");
                break;

            default:
                System.out.println("Curso não encontrado. Nenhuma das opções disponivéis foram escolhidas!");
        }
    }
}
