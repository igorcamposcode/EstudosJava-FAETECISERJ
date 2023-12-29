/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioCadastroProdutos;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class InstanciaProduto {
    
    public static void main(String[]args){
      String Menu1, Menu2,Menu3;
    // Execução da aplicação
    
    Produtos PDT = new Produtos();
    
    String InicioProgram = JOptionPane.showInputDialog("Deseja Iniciar o programa Venda e Cadastro Produtos?"); 
    
      while ((InicioProgram.equals("sim")) || (InicioProgram.equals("Sim")) || (InicioProgram.equals("SIM"))){
        
            String Opções =  JOptionPane.showInputDialog( "Escolha As Opções Seguintes \n"+
                                                          "==============================\n"+
                                                          "A - Cadastrar Produto \n"+
                                                          "B - Exibir Produto  \n"+
                                                          "C - Compra de Produto \n"+
                                                          "D - SAIR \n"+
                                                          "==============================\n");
            switch (Opções){
                
               case"A":
                  Menu1 = JOptionPane.showInputDialog("Você deseja Executar a opção Cadastrar produto?"); 
                
                 if ((Menu1.equals("sim")) || (Menu1.equals("Sim")) || (Menu1.equals("SIM"))){
                  PDT.CadastroProduto();
                 }
                  else
                     JOptionPane.showMessageDialog(null,"Esse Cadastro é Inexistente, Ou não Existe");
                break;
                
               case"B":
                   Menu2 = JOptionPane.showInputDialog("Você Deseja Exibir o produto?");
                   
                   if((Menu2.equals("sim")) || (Menu2.equals("Sim")) || (Menu2.equals("SIM"))){
                       PDT.exibirProduto();
                   }
                   else
                       JOptionPane.showMessageDialog(null, "Falha ao exibir produto");
               break;
                
               case"C":
                   Menu3 =  JOptionPane.showInputDialog("Você Deseja Efeituar a compra ou encomenda de produtos");
                   
                   if((Menu3.equals("sim")) || (Menu3.equals("Sim")) || (Menu3.equals("SIM"))){

                       PDT.VenderProduto();

                      if((PDT.QuantidadeEstoque >= PDT.Quant)){
                          
                          PDT.NotaFiscal();
                          PDT.QuantidadeEstoque = PDT.QuantidadeEstoque - PDT.Quant;
                                 
                        }
                      else 
                          if(PDT.QuantidadeEstoque == 0) {
                            JOptionPane.showMessageDialog(null, "Estamos sem o Estoque do Produto " + PDT.NomeProduto + "\n"+
                                                                            " Precisará ser encomendado mais unidades" ); 
                            
                            JOptionPane.showMessageDialog(null,"A Data prevista Para Entrega Desse produto é de 90 Dias ");
                            PDT.NotaDeEncomenda();
                        }
                      else
                          if((PDT.QuantidadeEstoque <= PDT.Quant)){
                              
                              JOptionPane.showMessageDialog(null, "O Estoque do produto "+ PDT.NomeProduto + " está critico ");
                              JOptionPane.showMessageDialog(null, "Precisa Adquirir Mais produtos");
                           
                              PDT.NotaDeEncomenda(); 
                        }    
                          
                   }
                   else // Compra igual a não? //
                       
               break;

               case"D":
                    JOptionPane.showMessageDialog(null,"Opção Sair Escolhida");
               break;

               default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");       
        }
            InicioProgram =  JOptionPane.showInputDialog("Deseja Retonar ao programa Produto?");
      }  
      JOptionPane.showMessageDialog(null,"O Programa irá se encerrar, Obrigado pela utilização");
    }
    
}
