/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioHerançaPolimorfismo2;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class AutoMóveis {
    
    String cor,chassi,anoFab;
    int CódigoNota;
    
    Random RD = new Random();
    
    void Cadastro(){
        
        CódigoNota = RD.nextInt(222222);
        
        anoFab = JOptionPane.showInputDialog("Digite o Ano de Fabricação do veículo");
        chassi = JOptionPane.showInputDialog("Digite o Chassi do veículo");
        cor = JOptionPane.showInputDialog("Digite a cor do veículo");
        
    }
    
    void ExibaAutomóvel(){
        JOptionPane.showMessageDialog(null,"É Este o Auto-móvel Cadastrado? \n"+
                                                                    "--------------------------------\n"+
                                                                    "Ano de Fabricação : "+anoFab+"\n"+
                                                                    "Cor veículo : "+cor+"\n"+
                                                                    "Chassi do véiculo : " +chassi+ "\n"+
                                                                    "--------------------------------\n");
    }
}
