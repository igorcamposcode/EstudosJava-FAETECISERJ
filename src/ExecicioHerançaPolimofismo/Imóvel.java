/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExecicioHerançaPolimofismo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Imóvel {
    String bairro,tipoImóvel,localização;
    double preço;
    int códigoImóvel;
    
    Random rd = new Random();
    
    void cadastroImóvel(){
        bairro = JOptionPane.showInputDialog("Digite Bairro");
        tipoImóvel = JOptionPane.showInputDialog("Digite o Tipo de imóvel");
        localização = JOptionPane.showInputDialog("Digite sua localização");
        
        preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do imóvel"));
        códigoImóvel = rd.nextInt(555555);
    }
    
    void exibaCadastroImóveis(){
        JOptionPane.showMessageDialog(null, "Cadastro de Imóvel \n" +
                                                        "=======================\n"+
                                                        "Código do Imóvel : " + códigoImóvel + "\n"+
                                                        "=======================\n"+
                                                        "BAIRRO : " + bairro + "\n" + 
                                                        "TIPO DO IMÓVEL : " + tipoImóvel + "\n" +
                                                        "LOCALIZAÇÃO : " + localização + "\n "+
                                                        "=======================\n"+
                                                        "PREÇO R$: " + preço + "\n"+
                                                        "=======================\n");
    }      
}
