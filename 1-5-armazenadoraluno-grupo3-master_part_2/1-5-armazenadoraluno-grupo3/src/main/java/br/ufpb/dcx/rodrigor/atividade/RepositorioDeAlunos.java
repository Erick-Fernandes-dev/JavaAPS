package br.ufpb.dcx.rodrigor.atividade;

import java.util.HashMap;
import java.util.Map;

public class RepositorioDeAlunos {
    private Map<String, Aluno> alunos = new HashMap<>();

    private RepositorioDeAlunos() {}

    public static RepositorioDeAlunos getInstance() {
        return new RepositorioDeAlunos();
    }
    public void addAlunos(Aluno aluno){
        this.alunos.put(aluno.getMatricula(), aluno);
    }
    public String listarAlunos(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Aluno aluno : alunos.values()){
            stringBuilder.append(aluno.getMatricula() + " | " + aluno.getNome() + "\n");
        }
        return stringBuilder.toString();
    }


}
