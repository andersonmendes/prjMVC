package viewer;

import java.util.Scanner;

import controller.CorrentistaController;

public class FormCorrentista {

	public static void main(String[] args) {
		
		CorrentistaController cc = new CorrentistaController();
		Scanner reader = new Scanner(System.in);
		
		String opt;
		
		do {
			System.out.println("Digite um nome: ");
			cc.inserirCorrentista(reader.nextLine());
			
			
			System.out.println("Deseja inserir mais um correntista? [Sim] ou [Não]");
			opt = reader.nextLine();
		} while(opt.equalsIgnoreCase("sim"));

	}

}
