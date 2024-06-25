package provas.prova03.auxiliares;

import java.time.LocalDate;

public class Aluno {

	private String matricula;
	private String nome;
	private LocalDate dataNascimento;
	
	public Aluno(String matricula, String nome, LocalDate dataNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public int hashCode() {
		return matricula.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Matricula: " + getMatricula();
	}
	
}
