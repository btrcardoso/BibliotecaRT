package controller;
import entities.*;
import data.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat; 

public class EfetuarEmprestimoRT {
	
	private Dados camadaDados = new Dados();
	
	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		LeitorDTO leit = camadaDados.buscarLeitor(idLeitor);
		ArrayList<EmprestimoDTO> nc = camadaDados.buscarNConcluidos(idLeitor);
		SituacaoLeitorDTO st = leit.getSituacaoLeitor();
		
		if(nc.size() == 0) {
			st.setSituacaoAtual(true);
		}
		
		return leit.getSituacaoLeitor();
	}
	
	public Date emprestarLivro(int idLivro, int idLeitor, ArrayList<EmprestimoDTO> emprestimos) {
		LivroDTO livro = camadaDados.buscarLivro(idLivro);
		ArrayList<EmprestimoDTO> nc = camadaDados.buscarEmpLivrorNConcluidos(idLivro);
		LeitorDTO leit = camadaDados.buscarLeitor(idLeitor);
		
		if(nc.size() == 0) {
			EmprestimoDTO emp = new EmprestimoDTO(leit);
			emp.add(livro);
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
			
			return date;
		}
		
		return null;
		
	}
	
	public void encerrarEmprestimo(int idLeitor, ArrayList<EmprestimoDTO> emprestimos) {
		
	}
	
}
