package controller;

import java.util.Random;
import model.Correntista;
import model.CorrentistaDAO;

public class CorrentistaController {
	private CorrentistaDAO dao = new CorrentistaDAO();
	
	public String inserirCorrentista(String nome) {
		int random = new Random().nextInt();
		
		Correntista correntista = new Correntista();
		correntista.setNome(nome);
		correntista.setNumeroConta(random);
		dao.inserirCorrentista(correntista);
		
		return "Correntista inserido. Número da conta: " + random;
		
	}
}
