package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Criamos o Objeto Conta c1
		Conta c1 = new Conta(1, 123, 1, "Danilo Moraes", 30000.0f);
		
		// Visualizamos os dados da Conta c1
		c1.vizualizar();
		
		//Alteramos o Saldo da Conta c1
		c1.setSaldo(35000.00f);
		
		//Vizualizamos o Saldo da Conta c1
		System.out.println("\\n\\n" + c1.getSaldo());
		
		//Criamos o Objeto conta c2
		Conta c2 = new Conta(2, 123, 1, "Dener Cardoso", 50000.0f);
		//Vizualizamos o dados da Conta C2
		c2.vizualizar();
		
		//Efetuamos um Saque na Conta c2
		if(c2.sacar(1000.00f))
			System.out.println("\n\n" + c2.getSaldo());
		
		//Efetuamos um Saque na Conta c1
		c1.depositar(10000.0f);
		
		//Vizualizamos o Saldo da Conta c1 apos o Deposito
		c1.vizualizar();
		
		int opcao;
					
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND +"****************************************************************");
			System.out.println("                                                                ");
			System.out.println("                   BANCO DOS 10CONTOS                           ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND +"                                                                ");
			System.out.println("               1 - Criar Conta                                  ");
			System.out.println("               2 - Listar todas as Contas                       ");
			System.out.println("               3 - Buscar Conta por Numero                      ");
			System.out.println("               4 - Atualizar Dados da Conta                     ");
			System.out.println("               5 - Apagar Conta                                 ");
			System.out.println("               6 - Sacar                                        ");
			System.out.println("               7 - Depositar                                    ");
			System.out.println("               8 - Transferir valores entre Contas              ");
			System.out.println("               9 - Sair                                         ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("Entre com a opção desejada:                                     ");
			System.out.println("                                                                " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			if(opcao == 9) {
				System.out.println("BANCO DOS 10CONTOS - Os Futuro dos seus 10CONTOS começa aqui! ");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1 -> System.out.println("Criar Conta \n\n");
			case 2 -> System.out.println("Criar Conta \n\n");
			case 3 -> System.out.println("Criar Conta \n\n");
			case 4 -> System.out.println("Criar Conta \n\n");
			case 5 -> System.out.println("Criar Conta \n\n");
			case 6 -> System.out.println("Criar Conta \n\n");
			case 7 -> System.out.println("Criar Conta \n\n");
			case 8 -> System.out.println("Criar Conta \n\n");
			}
			
		}

	}

}
