package br.ufpb.dcx.rodrigor.atividade.sca.text_ui;
import br.ufpb.dcx.rodrigor.atividade.sca.model.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private List<Aluno> listaAlunos;
    private Scanner scanner;

    public CadastroAlunos() {
        listaAlunos = new ArrayList<>();
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

        LocalDate dataNascimento;
        try {
            dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        } catch (Exception e) {
            System.out.println("Data de nascimento inválida! O aluno não será cadastrado.");
            return;
        }

        Aluno aluno = new Aluno(matricula, nome, dataNascimento);
        listaAlunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
            return;
        }

        System.out.println("------ Lista de Alunos ------");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

    public static void main(String[] args) {
        CadastroAlunos cadastro = new CadastroAlunos();
        cadastro.exibirMenu();
    }
}
