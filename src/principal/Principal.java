package principal;

import controller.*;
import entities.*;
import java.util.Date;
import java.text.SimpleDateFormat; 

public class Principal {
	public static void main(String[] args) {
		EfetuarEmprestimoRT e = new EfetuarEmprestimoRT();
		
		SituacaoLeitorDTO st = e.iniciarEmprestimo(0);
		Date ei = e.emprestarLivro(0,0, null);
		
		System.out.println("hey");
		
		
	
	}
}
