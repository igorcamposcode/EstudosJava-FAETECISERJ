/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosAutoMóveisArray;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class InstanciaAutoMóveis {
    public static void main(String[]args){
        
        String Menu1,Menu2;
        AutoMóveis AUT = new AutoMóveis();
        
        String resposta = JOptionPane.showInputDialog("Deseja Executar o Programa Auto-móveis?");
        
        while((resposta.equals("sim"))||(resposta.equals("Sim"))||(resposta.equals("SIM"))){
            
            String OpAutomóveis = JOptionPane.showInputDialog("Escolha uma das opções a serem selecionadas no programa Automóveis\n"+
                                                              "------------------------------------------------------------------\n"+
                                                              "A - Cadastro Automóveis\n"+
                                                              "B - Exiba Cadastro Automóveis\n"+
                                                              "C - Sair \n"+
                                                              "------------------------------------------------------------------\n");
            
            switch(OpAutomóveis){
                 
                case"A":
                    Menu1 = JOptionPane.showInputDialog("Deseja Cadastrar Automóvel?");
                    
                    if((Menu1.equals("sim"))||(Menu1.equals("Sim"))||(Menu1.equals("SIM"))){
                        AUT.cadastrar();
                    }                  
                break;
                
                case"B":
                     JOptionPane.showMessageDialog(null,"Deseja exibir os  Cadastros de Automóveis?");
                     AUT.exibaCadastro();
                break;
                
                case"C":
                    JOptionPane.showInputDialog(null, "Opção Sair Escolhida");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
            
            } 
            
          resposta = JOptionPane.showInputDialog("Deseja Retonar ao menu de opções?");            
             
        }
    }
}
