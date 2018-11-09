package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.util.List;

import br.com.prog3.atividade8aula12.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula");
		a.setRa("Taguatinga");
		System.out.println(ad.save(a));
		AlunoDaoImp ad1 = new AlunoDaoImp();
		Aluno a1 = new Aluno();
		a1.setMatricula(6);
		a1.setNome("Maria Paula Almeida");
		a1.setRa("Taguatinga Norte");
		System.out.println(ad1.update(a1));
		AlunoDaoImp ad11 = new AlunoDaoImp();
		System.out.println(ad11.delete(6));
		AlunoDaoImp ad111 = new AlunoDaoImp();
		List<Aluno> alunos = ad111.list();
		if (alunos != null) {
			for (Aluno al : alunos) {
				System.out.println("Aluno: " + al.getNome());
			}
		}
		AlunoDaoImp ad1111 = new AlunoDaoImp();
		Aluno aluno = ad1111.findByMatricula(2);
		if (aluno != null) {
			System.out.println(aluno.getNome());
		}
	}

}
