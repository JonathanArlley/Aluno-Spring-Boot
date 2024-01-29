package com.jonathan.dl.notificador;

import com.jonathan.dl.aluno.Aluno;

public interface Notificador {

	void notificar(Aluno aluno, String mensagem);

}