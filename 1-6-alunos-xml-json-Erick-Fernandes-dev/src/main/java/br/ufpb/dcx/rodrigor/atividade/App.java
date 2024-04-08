package br.ufpb.dcx.rodrigor.atividade;

import br.ufpb.dcx.rodrigor.atividade.sca.json.GerenciadorAlunosJSON;
import br.ufpb.dcx.rodrigor.atividade.sca.model.Aluno;
import br.ufpb.dcx.rodrigor.atividade.sca.xml.GerenciadorAlunosXML;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static String option;

    public static void main(String[] argsadd) throws ParseException {
        System.out.println("Alo Mundo");
        LocalDate ld = LocalDate.parse("2002-01-01");

        Aluno aluno1 = new Aluno("128", "Erick", ld);
        GerenciadorAlunosJSON json = new GerenciadorAlunosJSON("alunos.json");
        GerenciadorAlunosXML xml = new GerenciadorAlunosXML("alunos.xml");




        System.out.println("------ Cadastro de Aluno ------");
        System.out.println("Escolha sua forma de cadastro: " +
                "\n1. XML" +
                "\n2. JSON" +
                "\n0. Sair");

        System.out.print("Escolha a opção desejada: ");

        String option = sc.nextLine();
        boolean continuar = true;

        while (continuar) {

            if (option.equals("1")) {
                System.out.println("------ Cadastro de Aluno - XML----");
                System.out.println("Sistema de Cadastro de Alunos, cuja as opções são: " +
                        "\n1. Cadastrar Aluno" +
                        "\n2. Listar Alunos" +
                        "\n0. Sair" +
                        "\nEscolha a opção desejada:" +
                        "\n1");
                String op = sc.nextLine();

                if (op.equals("1")) {
                    xml.cadastrarAluno(aluno1);


                } else if (op.equals("2")) {
                    System.out.println(xml.recuperarAlunos());

                } else if (op.equals("0")) {
                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }


            } else if (option.equals("2")) {
                System.out.println("------ Cadastro de Aluno - JSON");

                json.cadastrarAluno(aluno1);
                //break;

            } else if (option.equals("0")) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");

            }

            continuar = alternativas();

            if (continuar) {
                System.out.println("Escolha sua forma de cadastro: " +
                        "\n1. XML" +
                        "\n2. JSON" +
                        "\n0. Sair");

                System.out.print("Escolha a opção desejada: ");
                option = sc.nextLine();


            } else {
                System.out.println("Encerrando o programa...");
            }

        }


    }

    public static boolean alternativas() {
        System.out.print("Deseja continuar? " +
                "\n1. Sim" +
                "\n0. Não" +
                "\nEscolha a opção desejada: ");

        String alternativa = sc.nextLine();

        if (alternativa.equalsIgnoreCase("Sim")) return true;

        return false;
    }
}
