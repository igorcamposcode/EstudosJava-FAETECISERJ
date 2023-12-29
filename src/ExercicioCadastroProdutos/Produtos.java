/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioCadastroProdutos;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class Produtos {
    
    String NomeProduto,TipoProduto;
    String nomeComprador, CPFComprador;
    double PreçoUnitário, Preço;
    int CódigoProduto, QuantidadeEstoque, Quant; 
    
    Random RD = new Random(); 
    
    void CadastroProduto(){ 
        NomeProduto = JOptionPane.showInputDialog("Digite o nome do produto"); 
        TipoProduto = JOptionPane.showInputDialog("Digite o tipo de produto"); 
        
        // Definindo o preço unitário, preço  como valor  a ser digitado 
        PreçoUnitário = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário do produto"));
         
        // Código Produto a ser gerado e definido a quantidade do produto como valor inteiro 
        CódigoProduto = RD.nextInt(333333);
        QuantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de produto em estoque"));
      
    }
    
    void exibirProduto() { 
      JOptionPane.showMessageDialog(null, "OS SEGUINTES PRODUTOS CADASTRADOS SÃO \n"+
                                                        "--------------------------------------\n"+
                                                        "CÓDIGO PRODUTO : " + CódigoProduto + "\n"+
                                                        "--------------------------------------\n"+
                                                        "Nome do Produto : "+ NomeProduto + "\n"+
                                                        "Tipo do produto : "+ TipoProduto + "\n"+
                                                        "Preço Unitário : R$ " + PreçoUnitário + "\n"+
                                                        "Quantidade em Estoque : "+ QuantidadeEstoque + "\n"+
                                                        "--------------------------------------\n");  
    }
    
    //Aqui será efeituada a venda do produto
    
    void VenderProduto(){
        
        nomeComprador = JOptionPane.showInputDialog("Digite o Nome do Comprador");
        CPFComprador = JOptionPane.showInputDialog("Digite o CPF do comprador");
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser vendida"));
        
        Preço = PreçoUnitário * Quant;  
        
    }
    
    void NotaFiscal(){
         JOptionPane.showMessageDialog(null,"OS SEGUINTES PRODUTOS COMPRADOS SÃO \n"+
                                                         "--------------------------------------\n"+
                                                         "CÓDIGO PRODUTO : " + CódigoProduto + "\n"+
                                                         "--------------------------------------\n"+
                                                         "Nome do Produto : "+ NomeProduto + "\n"+
                                                         "Tipo do produto : "+ TipoProduto + "\n"+
                                                         "Preço Unitário : R$ " + PreçoUnitário + "\n"+
                                                         "--------------------------------------\n"+
                                                         "Nome Do Comprador : " + nomeComprador + "\n"+
                                                         "CPF do Comprador : " + CPFComprador + "\n"+
                                                         "Quantidade Comprada : " + Quant + "\n"+
                                                         "Preço R$: " + Preço + "\n"+
                                                         "--------------------------------------\n");  
    }
    
    
    void NotaDeEncomenda(){
        JOptionPane.showMessageDialog(null," A Encomenda está sendo preparada \n"+
                                                       "--------------------------------------\n"+
                                                       "CÓDIGO PRODUTO : " + CódigoProduto + "\n"+
                                                       "--------------------------------------\n"+
                                                       "Nome do Produto : "+ NomeProduto + "\n"+
                                                       "Tipo do produto : "+ TipoProduto + "\n"+
                                                       "Preço Unitário : R$ " + PreçoUnitário + "\n"+
                                                       "--------------------------------------\n"+
                                                       "Nome Do Comprador : " + nomeComprador + "\n"+
                                                       "CPF do Comprador : " + CPFComprador + "\n"+
                                                       "Quantidade Comprada : " + Quant + "\n"+
                                                       "Preço R$: " + Preço + "\n"+
                                                       "--------------------------------------\n");
    }
            
}
