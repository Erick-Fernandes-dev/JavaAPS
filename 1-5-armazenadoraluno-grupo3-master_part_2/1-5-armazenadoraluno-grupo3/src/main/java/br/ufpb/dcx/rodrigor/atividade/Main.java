package br.ufpb.dcx.rodrigor.atividade;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioDeAlunos repositorio = RepositorioDeAlunos.getInstance();

        System.out.println("Cadastro de Alunos");

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();

            System.out.print("Digite a data de nascimento do aluno (formato: yyyy-mm-dd): ");
            String dataNascimentoStr = scanner.nextLine();
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);


            Aluno aluno = new Aluno(nome, matricula, dataNascimento);


            repositorio.addAlunos(aluno);


            System.out.println("Aluno cadastrado com sucesso!");
        }


        String listaAlunos = repositorio.listarAlunos();
        System.out.println("\nLista de Alunos:\n" + listaAlunos);

        scanner.close();
    }
}

