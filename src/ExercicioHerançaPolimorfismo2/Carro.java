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

public class Carro extends AutoMóveis{
    String marca,modelo,nomeComprador,cpfComprador;
    double preço;
    
    void emitirNotaFiscal(){
        
    marca = JOptionPane.showInputDialog("Digite a Marca do veículo");
    modelo = JOptionPane.showInputDialog("Digite o Modelo do veículo");
    preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do veículo"));
    
    nomeComprador = JOptionPane.showInputDialog("Digite o nome do comprador");
    cpfComprador = JOptionPane.showInputDialog("Digite o CPF do comprador");
    
    JOptionPane.showMessageDialog(null,"EMISSÃO DE NOTA FISCAL DO VEÍCULO \n"+
                                                                    "--------------------------------\n"+
                                                                    "Código Nota : "+CódigoNota+"\n"+
                                                                    "--------------------------------\n"+
                                                                    "Marca do veículo : "+marca+ "\n"+
                                                                    "Modelo do veículo : "+modelo+ "\n"+
                                                                    "Ano de Fabricação : "+anoFab+"\n"+
                                                                    "Cor veículo : "+cor+"\n"+
                                                                    "Chassi do veículo : " +chassi+ "\n"+
                                                                    "--------------------------------\n"+
                                                                    "PREÇO VEÍCULO R$: "+preço+"\n"+
                                                                    "--------------------------------\n"+
                                                                    "Nome Comprador : "+nomeComprador+"\n"+
                                                                    "CPF Comprador : "+cpfComprador+"\n"+
                                                                    "--------------------------------\n");
    
}
            
}
