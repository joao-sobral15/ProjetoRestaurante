/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorestaurante;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

/**
 * 
 *
 * @author User
 */
public class ProjetoRestaurante {
   
    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
    public static void criaProdutos()
    {
        ArrayList<Prato> produtos = new ArrayList<Prato>();
        ArrayList<Bebida> bebida = new ArrayList<Bebida>();

        Prato bife = new Prato("bife", 9,"Com molho");
        produtos.add(bife);
        Prato lasanha = new Prato("lasanha", 8,"sem molho");
        produtos.add(lasanha);
        
        Bebida cocaCola = new Bebida("Coca-Cola", 1,3,true);
        bebida.add(cocaCola);
        Bebida agua = new Bebida("Agua", 0.50,3,false);
        bebida.add(agua);
        
        System.out.println(produtos.toString());
        System.out.println(bebida.toString());
    }
    
    
    public static void ShowMenu()
    {
         int opcao = 0;
	do {
            clearScreen();
		System.out.println("\n\n###             GESTÃO DO RESTAURANTE ###");
		System.out.println("\n                  =========================");
		System.out.println("                  | 1 - Produtos                    |");
                System.out.println("                  | 2 - Solicitação de mesa         |");
		System.out.println("                  | 3 - Adicionar Items a um pedido  |");
		System.out.println("                    4 - Estado Pedido               |");
		System.out.println("                    5 - Fechar Pedido               |");
		System.out.println("                  | 6 - Cliente                     |");
		System.out.println("                  | 7 - Fornecedor                  |");
		System.out.println("                  | 0 - Sair                        |");
		System.out.println("                  =========================\n");

		Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                    clearScreen();
                        //Produtos();
                    criaProdutos();
			break;
		case 2:
			break;
		case 5:
			break;
		case 0:
			break;
		default:
            	System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);
    }
    
    public static void main(String[] args) {
        ShowMenu();
    
    }
}
