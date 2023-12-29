/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecicioHerançaPolimofismo;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class InstanciaImóvel {
    public static void main (String[]args){
        String Menu1,Menu2;
   
        
        Casa CS = new Casa();
        Apartamento APT = new Apartamento();
        Terreno TRR = new Terreno();
        
        String resposta  = JOptionPane.showInputDialog("Deseja executar o programa Imóveis");
        
        while ((resposta.equals("sim")) || (resposta.equals("Sim")) || (resposta.equals("SIM"))){
            
            String opImóveis = JOptionPane.showInputDialog("Escolha uma das Opções do Programa Imóvel \n"+
                                                           "******************************************\n"+
                                                           "A - Cadastrar Imóvel \n"+
                                                           "B - Vender Imóvel \n "+
                                                           "C - SAIR \n"+
                                                           "******************************************\n");
            switch(opImóveis){
                case"A":
                    
                   Menu1 = JOptionPane.showInputDialog("Escolha o tipo de imóvel que deseja\n"+ 
                                                       "Cadastro de Apartamento, Casa ou Terreno?");
                    
               if((Menu1.equals("casa"))||(Menu1.equals("Casa"))||(Menu1.equals("CASA"))){
                   CS.cadastroImóvel();
                   CS.tipoImóvel = Menu1;
                   CS.exibaCadastroImóveis();
               }
               else
                   
                if((Menu1.equals("apartamento"))||(Menu1.equals("Apartamento"))||(Menu1.equals("APARTAMENTO"))){
                     APT.cadastroImóvel();
                     APT.tipoImóvel = Menu1;
                     APT.exibaCadastroImóveis();
                }
                else
                    
                if((Menu1.equals("terreno"))||(Menu1.equals("Terreno"))||(Menu1.equals("TERRENO"))){
                    TRR.cadastroImóvel();
                    TRR.tipoImóvel = Menu1;
                    TRR.exibaCadastroImóveis();
                }     
               else
                    JOptionPane.showMessageDialog(null, "Imóvel inexistente (Não existe)");
               break;
               
               case"B":
                   Menu2 = JOptionPane.showInputDialog("Deseja Vender o Imóvel \n "+
                                                       "Casa , Apartamento ou Terreno?");
                   
                        
               if((Menu2.equals("casa"))||(Menu2.equals("Casa"))||(Menu2.equals("CASA"))){
                   CS.exibaCadastroImóveis();
                   String compra = JOptionPane.showInputDialog("é Este Imóvel que deseja? ");
                   
                   if((compra.equals("sim"))|| (compra.equals("Sim")) || (compra.equals("SIM")))
                     CS.efetuarVenda();
                  
                   else
                       JOptionPane.showMessageDialog(null, "Fica Para Próxima");
               }
               else
            

                if((Menu2.equals("apartamento"))||(Menu2.equals("Apartamento"))||(Menu2.equals("APARTAMENTO"))){
                     APT.exibaCadastroImóveis();
                     String compra = JOptionPane.showInputDialog("é Este Imóvel que deseja? ");
                  
                  if((compra.equals("sim"))||(compra.equals("Sim"))||(compra.equals("SIM")))
                       APT.efetuarVenda();
                  else
                      JOptionPane.showMessageDialog(null, "Fica Para Próxima");
                }
               else
                    
                if((Menu2.equals("terreno"))||(Menu2.equals("Terreno"))||(Menu2.equals("TERRENO"))){
                     TRR.exibaCadastroImóveis();
                     String compra = JOptionPane.showInputDialog("é Este Imóvel que deseja? ");
                  
                  if((compra.equals("sim"))||(compra.equals("Sim"))||(compra.equals("SIM")))
                       TRR.efetuarVenda();
                  else
                      JOptionPane.showMessageDialog(null, "Fica Para Próxima");
                }
                
                else
                    JOptionPane.showMessageDialog(null, "Imóvel inexistente (Não existe)");
               break;
               
               case"C":
                   JOptionPane.showInputDialog( "Opção Sair Escolhida");
                break;
                
               default:
                   JOptionPane.showMessageDialog(null,  "Opção inválida!");
                  
            }
            JOptionPane.showMessageDialog(null, "Deseja retornar ao menu de opções do programa?");
        }
        JOptionPane.showMessageDialog(null, "Programa vai encerrar");
    }
}
