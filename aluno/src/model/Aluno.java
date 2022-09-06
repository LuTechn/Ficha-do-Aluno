package model;

public class Aluno {

    /* atributos */

    public String nome;
    public int matricula;
    public int cpf;
    public int idade;
    public boolean acessoportal;
    public int anomatricula;

    /* construtor */
    public Aluno() {}

    /* metodos */
    public String cadastro(String nome, int matricula)

    {
        this.nome = nome;
        this.matricula = matricula;
        return "Cadastro realizado com sucesso!";
    }

}

