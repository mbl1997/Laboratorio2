/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import  Repositorios.filme ;
import  Repositorios.salas ;
import  java.util.ArrayList ;
import  java.util.Scanner ;
import  java.util.Date ;
import  java.util.Calendar ;

/**
 *
 * @author marib
 */
public class Controller {
     public static ArrayList <filme> listaFilme = new ArrayList <filme>();
      public static ArrayList <salas> listaSalas = new ArrayList <salas>();
 
public static String ler(){
         Scanner leitura = new Scanner(System.in);
         return leitura.nextLine();
     }
     
            public static void escrever(String texto){
                System.out.println(texto);
            }
     
                public static String  exibirMenu(){
                   String texto = "CINEMA \n1 - Cadastrar Filme"+
		   "\n2 - Cadastrar Salas"+
		        "\n3-  Cadastrar Sessao"+
  		        "\n4 - Venda de Ingresso"+		
                                                                  "\n5- Relatorio"+
		                  "\n6 - Sair "+
                                                                             "\n - Digite as opcoes ";
				return texto;
                }
     
                public static void escolherMenu(){
                    int opcao =0;
                    
                    while (opcao!=7){
                        escrever(exibirMenu());
                        opcao = Integer.parseInt(ler());
                        switch(opcao){
                            case 01 : 
                                CadastrarFilmes();
                              break;
                             
                            case 02:
                                 CadastrarSalas();
                                 break;
                                
                 //           case 03:
                //            CadastrarSessao();
                 //           break;
                            
                    //        case 04:
                     //           VendaIngressos();
                       //         break;
                                
                  //          case 05:
                    //            Relatorios();
                    //            break;
                                
                            case 06:
                             System.out.println("\n Finalizado com sucesso.\n ");
					break;
					default: 
						escrever("Opcao Invalida."); 
                        }
                    }
                }

              
                private static void CadastrarFilmes() {
                                String codigo,nomeFilme, genero,sinopse;
			
                                escrever("Nome do Filme ");
                                nomeFilme= ler();
                                escrever("Genero: ");
                                genero = ler();
                                escrever("Sinopse:");
                                sinopse= ler();
                                escrever("Codigo:");
                                codigo = ler();
                                
                                filme filme= new  filme (nomeFilme,  codigo , genero ,  sinopse);
                                    	          listaFilme.add(filme);
		escrever("\n Cadastrado com sucesso! \n");
                }
                
   private static void CadastrarSalas() {
            String numeroSala,quantidadepoltronas,numeroPoltronas;
            
            escrever(" Numero da Poltrona:");
             numeroPoltronas = ler();
             
             escrever("Numero da Sala:");
              numeroSala = ler();
              
              escrever("Quantidade de Poltrona:");
                     quantidadepoltronas = ler();
                     
                    salas  salas = new salas  (numeroSala, quantidadepoltronas,numeroPoltronas);
                         listaSalas.add(salas);
                            escrever("\n Cadastrado com sucesso! \n");
    }             

            public static void main(String... args) {
                           escolherMenu();
       }
}
