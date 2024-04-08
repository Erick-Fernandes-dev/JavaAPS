package br.ufpb.dcx.rodrigor.atividade.sca.persistencia;

import br.ufpb.dcx.rodrigor.atividade.sca.exception.AlunoJaExistenteException;
import br.ufpb.dcx.rodrigor.atividade.sca.model.Aluno;

import java.util.List;

public interface GerentePersistenciaAlunos {

    public void cadastrarAluno(Aluno aluno) throws AlunoJaExistenteException;
    public List<Aluno> recuperarAlunos();

}
