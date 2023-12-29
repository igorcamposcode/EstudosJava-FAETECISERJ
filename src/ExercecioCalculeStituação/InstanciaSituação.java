/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercecioCalculeStituação;

import javax.swing.JOptionPane;

/**
 *
 * @author Igorc
 */
public class InstanciaSituação {
    public static void main (String [] args){
        CalculeSituação CS = new CalculeSituação();
        
        String resposta = JOptionPane.showInputDialog("DESEJA INICIAR O PROGRAMA CALCULE SITUAÇÃO?");
        while (  (resposta.equals("sim"))|| (resposta.equals("Sim"))|| (resposta.equals("SIM"))  ){
            
        CS.cadastroAluno();
        CS.ExibaCadastroAlunosEnotas();
        resposta = JOptionPane.showInputDialog("DESEJA EXECUTAR ESSE PROGRAMA OUTRA VEZ?");
        }
    }
}
