package br.ufpb.dcx.rodrigor.atividade.sca.text_ui;
import br.ufpb.dcx.rodrigor.atividade.sca.exception.AlunoJaExistenteException;
import br.ufpb.dcx.rodrigor.atividade.sca.model.Aluno;
import br.ufpb.dcx.rodrigor.atividade.sca.persistencia.GerentePersistenciaAlunos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenusTexto {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Scanner scanner;

    private GerentePersistenciaAlunos gerentePersistenciaAlunos;
    private LocalDate dataNascimento;

    public MenusTexto(GerentePersistenciaAlunos gerentePersistenciaAlunos) {
        this.gerentePersistenciaAlunos = gerentePersistenciaAlunos;
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void cadastrarAluno() {
        System.out.println("------ Cadastro de Aluno ------");
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento do aluno (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();

        String dia = dataNascimentoStr.substring(0, 2);
        String mes = dataNascimentoStr.substring(3, 5);
        String ano = dataNascimentoStr.substring(6, 10);

        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);


        try {
            //dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
            this.dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
            //int a = "nome";
            //dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

            // Existe outra forma de formatar a data, sem usar o DateTimeFormatter:

            // String[] dataNascimentoStrArray = dataNascimentoStr.split("/");
            // int dia = Integer.parseInt(dataNascimentoStrArray[0]);
            // int mes = Integer.parseInt(dataNascimentoStrArray[1]);
            // int ano = Integer.parseInt(dataNascimentoStrArray[2]);

        } catch (Exception e) {
            System.out.println("Data de nascimento inválida! O aluno não será cadastrado.");
            return;
        }

        Aluno aluno = new Aluno(matricula, nome, dataNascimento);
        try {
            this.gerentePersistenciaAlunos.cadastrarAluno(aluno);
        } catch (AlunoJaExistenteException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        List<Aluno> listaAlunos = this.gerentePersistenciaAlunos.recuperarAlunos();
        if (listaAlunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }

        System.out.println("------ Lista de Alunos ------");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

}
