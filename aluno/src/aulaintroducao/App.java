package aulaintroducao;

import java.util.Scanner;
import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        String resposta1 = "";
        String resposta2 = "";
        String nome = "";
        int matricula = 0;

        System.out.println("Informe o nome do aluno: ");
        nome = leia.next();
        System.out.println("Informe a matricula: ");
        matricula = leia.nextInt();
        resposta1 = aluno1.cadastro(nome, matricula);

        System.out.println("Informe o nome do aluno: ");
        nome = leia.next();
        System.out.println("Informe a matricula: ");
        matricula = leia.nextInt();
        resposta2 = aluno2.cadastro(nome, matricula);

        System.out.println(resposta1);
        System.out.println(resposta2);

        System.out.println("O nome do aluno1 eh: " + aluno1.nome);
        System.out.println("A matricula do launo1 eh: " + aluno1.matricula);
        System.out.println("O nome do aluno2 eh: " + aluno2.nome);
        System.out.println(" A matricula do aluno2 eh: " + aluno2.matricula);
        /* nome e a matricula e salvar no */

        System.out.println("Fim do programa");

    }

}