/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioPesquisaNumero;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class PesquisaNumero {
    
    public static void main(String[]args){
        
        // declarações de vareaveis e booleanos
        
        boolean achei;
        int[] num = new int[5];
        int[] banco = new int[20];
        int i,j,qtd,vp,qtdj = 0;
        
        String resp = JOptionPane.showInputDialog("Você deseja executar o programa pesquisa?");
        
        // inicialização do programa
        
        while((resp.equals("sim"))||(resp.equals("Sim"))||(resp.equals("SIM")))
        { 
            
             // inicio de cadastramento de números    
             qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você irá cadastrar?")); 
        
             while(qtd > 5 ){
                   qtd = Integer.parseInt(JOptionPane.showInputDialog("a Quantidade está acima do limite escolha somente Valores de 1 até 5\n"+                                                           "Quantos números você irá cadastrar"));
             } 
             
             for(i=1;i<=qtd;i++){
                  num[i] = Integer.parseInt( JOptionPane.showInputDialog("Digite o número: "+i));
             }
        
               i=1;
        
               for(i=1;i<=qtd;i++){
                   JOptionPane.showMessageDialog(null,"Array de numeros\n" +
                                                             "---------------------------------\n"+
                                                             "Número [ "+i+" ]: "+num[i]+"\n"+
                                                             "---------------------------------\n");
                }
        
                // começo de pesquisa do valor digitado a cima
                
                String respPesq = JOptionPane.showInputDialog("Você deseja executar a pesquisa?");
                
                while ((respPesq.equals("sim"))||(respPesq.equals("Sim"))||(respPesq.equals("SIM"))) 
                {
                    
                     achei = false;
        
                     vp = Integer.parseInt(JOptionPane.showInputDialog("Digite algum valor? "));
        
                     for(i=1;i<=qtd;i++){
            
                      if(vp == num[i]){
                          JOptionPane.showMessageDialog(null,"Valor encontrado no indice " + i +
                                                                 " é: "+vp);
                          achei=true;
                       }    
                      }
                
                      if(achei == false){
                          JOptionPane.showMessageDialog(null,"Valor Não encontrado");
                       } 
                      
                      for(j=3;j<=qtdj;j++){
                        banco[j] = num[i];
                        JOptionPane.showMessageDialog(null,"Valores Armazenados [ " + j + " ] " + num[i] + "\n");
                      }
                      
                      respPesq = JOptionPane.showInputDialog("Você deseja executar executar a pesquisa novamente?");
                
                }
        
        // fim do programa
        
            resp = JOptionPane.showInputDialog("Deseja executar o programa novamente! ");
        
        }
        
        
    }    
       
}
    

