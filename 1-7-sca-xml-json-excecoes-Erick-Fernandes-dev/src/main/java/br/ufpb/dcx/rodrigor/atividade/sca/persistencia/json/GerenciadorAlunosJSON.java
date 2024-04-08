package br.ufpb.dcx.rodrigor.atividade.sca.persistencia.json;

import br.ufpb.dcx.rodrigor.atividade.sca.exception.AlunoJaExistenteException;
import br.ufpb.dcx.rodrigor.atividade.sca.model.Aluno;
import br.ufpb.dcx.rodrigor.atividade.sca.persistencia.GerentePersistenciaAlunos;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlunosJSON implements GerentePersistenciaAlunos {
    private String nomeArquivo;
    private ObjectMapper objectMapper;

    public GerenciadorAlunosJSON(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.objectMapper = new ObjectMapper();
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void cadastrarAluno(Aluno aluno) throws AlunoJaExistenteException {
        List<Aluno> listaAlunos = recuperarAlunos();

        if (listaAlunos == null) {
            listaAlunos = new ArrayList<>();

        } else if (listaAlunos.contains(aluno)) {
            throw new AlunoJaExistenteException("Já existe um aluno com a matrícula " + aluno.getMatricula());

        }

        listaAlunos.add(aluno);
        salvarAlunos(listaAlunos);
    }

    public List<Aluno> recuperarAlunos() {
        File arquivo = new File(nomeArquivo);

        try (FileInputStream fis = new FileInputStream(arquivo);){
            if (arquivo.exists()) {
                List<Aluno> listaAlunos = objectMapper.readValue(fis, new TypeReference<List<Aluno>>() {});
                return listaAlunos;
            }
        } catch (IOException e) {
            System.out.println("Erro ao recuperar alunos do arquivo JSON: " + e.getMessage());
        }

        return null;
    }

    private void salvarAlunos(List<Aluno> listaAlunos) {
        try {
            File arquivo = new File(nomeArquivo);
            FileOutputStream fos = new FileOutputStream(arquivo);
            objectMapper.writeValue(fos, listaAlunos);
            fos.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos no arquivo JSON: " + e.getMessage());
        }
    }
}
