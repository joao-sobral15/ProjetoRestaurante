package projetorestaurante;


import java.util.ArrayList;
import java.util.Scanner;
//import projetorestaurante.Bebida;
//import projetorestaurante.Mesa;
////import projetorestaurante.Prato;
//import projetorestaurante.ProjetoRestaurante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Tudo {
    
        ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        ArrayList<Prato> produtos = new ArrayList<Prato>();
        ArrayList<Bebida> bebida = new ArrayList<Bebida>();
        ProjetoRestaurante projeto = new ProjetoRestaurante();
        Mesa mesa1 = new Mesa(1, true);
        Mesa mesa2 = new Mesa(2, true);
        Mesa mesa3 = new Mesa(3, true);
        Mesa mesa4 = new Mesa(4, true);
        
   
    public  void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    public void criaProdutos()
    {  
        Prato bife = new Prato("bife", 9,"Com molho");
        produtos.add(bife);
        Prato lasanha = new Prato("lasanha", 8,"sem molho");
        produtos.add(lasanha);
        
        Bebida cocaCola = new Bebida("Coca-Cola", 1,3,true);
        bebida.add(cocaCola);
        Bebida agua = new Bebida("Agua", 0.50,3,false);
        bebida.add(agua);
        
        System.out.println("ENTRADAS:\n");
        System.out.println(produtos.toString());
        System.out.println("BEBIDAS::\n");
        System.out.println(bebida.toString());
    }
    
    public void AdicionarItem()
    {
        Pedido pedido = new Pedido(1);
        
       System.out.println(pedido.toString());
    }
    
    public void mostraMesas()
    {
        int opcao;
       // ArrayList<Mesa> mesas = new ArrayList<Mesa>();
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        
         for(Mesa mesax: mesas)
        {
            System.out.println(mesax.toString());
           
        }
        
                System.out.println("\n");
                System.out.println("ALTERAR DISPONIBILIDADE DE QUE MESA? ");
                Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
                
                if(opcao == 1)
                {
                    mesa1.alteraEstado();
                }
                else if (opcao ==2)
                {
                    mesa2.alteraEstado();
                }
                else if (opcao ==3)
                {
                    mesa3.alteraEstado();
                }
                else
                {
                    mesa4.alteraEstado();
                }
                
                mostraMesas();
        
    }
    
    
     public  void ShowMenu()
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
		System.out.println("                  | 0 - Sair                        |");
		System.out.println("                  =========================\n");

		Scanner sc = new Scanner(System.in);
                opcao = sc.nextInt();
		System.out.print("\n");
		switch (opcao) {
		case 1:
                    clearScreen();
                    criaProdutos();
			break;
		case 2:
                    clearScreen();
                    mostraMesas();
			break;
                case 3:
                    clearScreen();
                    AdicionarItem();
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
    
    
}
