package model;

import java.util.ArrayList;
import java.util.List;

public class CorrentistaDAO {
	private List<Correntista> banco = new ArrayList<Correntista>();
	
	public void inserirCorrentista(Correntista correntista) {
		banco.add(correntista);
	}
	
	public List<Correntista> listarTodosCorrentistas() {
		return banco;
	}
}
