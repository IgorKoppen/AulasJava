package br.com.banco;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String endereco;
	private final Date dataNascimento;
	

	public Cliente(String nome, String endereco, String dataNascimento) throws ParseException {
		this.nome = nome;
		this.endereco = endereco;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataNascimento = formato.parse(dataNascimento);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}
}
