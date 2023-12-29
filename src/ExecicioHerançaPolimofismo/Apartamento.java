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

public class Apartamento extends Imóvel {
    
    String detalhesImóvel;
    
    String nomeComprador,cpfComprador;
    
    void efetuarVenda(){
        
        detalhesImóvel = JOptionPane.showInputDialog("Digite os detalhes do imóvel | Quartos,Cozinha,Garagem, etc");
        
        nomeComprador = JOptionPane.showInputDialog("Digite o nome do comprador do imóvel ");
        cpfComprador = JOptionPane.showInputDialog("Digite o CPF do Comprador ");
        
        JOptionPane.showMessageDialog(null,"Nota Fiscal de venda de Casa\n"+
                                                       "=============================\n"+
                                                       "Código do Imóvel : " + códigoImóvel + "\n"+
                                                       "=============================\n"+
                                                       "BAIRRO : " + bairro + "\n"+
                                                       "LOCALIZAÇÃO : " + localização + "\n"+
                                                       "DETALHES DO IMÓVEL : " + detalhesImóvel + "\n"+
                                                       "PREÇO R$: " + preço + "\n"+
                                                       "TIPO DO IMÓVEL : " + tipoImóvel + "\n"+
                                                       "=============================\n"+
                                                       "NOME COMPRADOR : " + nomeComprador + "\n"+
                                                       "CPF COMPRADOR : " + cpfComprador + "\n" +
                                                       "=============================\n"); 
        
    }
}
