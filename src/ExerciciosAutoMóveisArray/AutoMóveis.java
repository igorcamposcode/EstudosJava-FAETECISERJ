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

public class AutoMóveis {
    
    String[] AutoMóvel = new String[10];
    String[] Cor = new String[10];
    String[] Marca = new String[10];
    String[] Modelo = new String[10];
    String[] AnoFab = new String[10];
    String[] Preço = new String[10];
    
    int i, qtde;
    
    void cadastrar(){
        
        qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantos Auto-Móveis irá Cadastrar?"));
        
        while (qtde > 10){
            qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Acima do Limite...! Escolha valores de 1 a 10 Somente\n"+
                                                                  "Quantos Automóveis Você irá Cadastrar..."));
        }
        for(i=1;i<=qtde;i++){
            AutoMóvel[i] = JOptionPane.showInputDialog("Digite o Tipo do Automóvel: Carro,Caminhão,Moto ou Onibus");
            Cor[i] = JOptionPane.showInputDialog("Digite a cor do Automóvel");
            Marca[i] = JOptionPane.showInputDialog("Digite a Marca do Automóvel");
            Modelo[i] = JOptionPane.showInputDialog("Digite o Modelo do Automóvel");
            AnoFab[i] = JOptionPane.showInputDialog("Digite o Ano de Fabricação do Automóvel");
            Preço[i] = JOptionPane.showInputDialog("Digite o Preço do Automóvel");
        }
        i = 1;
    }
    
    void exibaCadastro(){
        i = 1; 
        
       for(i=1;i<=qtde;i++){
           JOptionPane.showMessageDialog(null,"Os Dados Cadastrados dos seguintes Automóveis?"+qtde+"\n"+
                                                            "---------------------------------------------------------\n"+
                                                            "Tipo do Automóvel : "+AutoMóvel[i]+"\n"+
                                                            "Cor do Automóvel : "+Cor[i]+"\n"+
                                                            "Marca do Automóvel : "+Marca[i]+"\n"+
                                                            "Modelo do Automóvel : "+Modelo[i]+"\n"+
                                                            "Ano Fabricação do Automóvel : "+AnoFab[i]+"\n"+
                                                            "Preço do Automóvel R$ : "+Preço[i]+"\n"+
                                                            "---------------------------------------------------------\n");
       }
    }
    
}
