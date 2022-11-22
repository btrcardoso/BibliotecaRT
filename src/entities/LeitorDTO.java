package entities;

public class LeitorDTO {
	
	private SituacaoLeitorDTO situacaoLeitor;
	
	public LeitorDTO(String nome, boolean situacao) {
		situacaoLeitor = new SituacaoLeitorDTO(nome, situacao);
	}
	
	public SituacaoLeitorDTO getSituacaoLeitor() {
		return situacaoLeitor;
	}
	
	public String getNome() {
		return situacaoLeitor.nome;
	}
	
}
