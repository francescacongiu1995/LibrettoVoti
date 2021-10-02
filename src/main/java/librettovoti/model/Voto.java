package librettovoti.model;

import java.time.LocalDate;
// POJO - Plain Old Java Object
// Java bean ( una classe che ha costruttore e variabili) 

/**
 * Memorizza voto 
 * 
 * @author francescacongiu
 * 
 *
 */
public class Voto {

	private String nome;
	private int voto; //scegliere 30 e lode rappresentazione
	private LocalDate data;
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data ;
	}
	
	
}
