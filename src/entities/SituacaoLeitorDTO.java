package entities;

public class SituacaoLeitorDTO {
	
	// private?
	String nome;
	private boolean situacaoAtual;
	
	SituacaoLeitorDTO(String nome, boolean situacao){
		this.nome = nome;
		this.situacaoAtual = situacao;
	}

	public boolean getSituacaoAtual() {
		return situacaoAtual;
	}

	public void cria(String nome, boolean situacao) {
		// não sei pra que serve
	}
	
	public void setSituacaoAtual(boolean situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}
	
	
}
