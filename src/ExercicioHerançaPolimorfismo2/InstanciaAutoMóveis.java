/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioHerançaPolimorfismo2;

/**
 *
 * @author Aluno igor campos
 */

import javax.swing.JOptionPane;

public class InstanciaAutoMóveis {
    public static void main(String[]args){
        String menu1,menu2;

        Carro CAR = new Carro();
        Caminhão CAM = new Caminhão();
        Moto MOT = new Moto();

        String resposta = JOptionPane.showInputDialog(null,"Deseja executar o Programa AutoMóveis");

        while((resposta.equals("sim")) || (resposta.equals("Sim")) || (resposta.equals("SIM"))){

            String OpAutoMóveis = JOptionPane.showInputDialog("Selecione uma das opções Abaixo... \n" +
                                                              "------------------------------------ \n"+
                                                              "A - Cadastro Auto-Móveis \n"+
                                                              "B - Venda Auto-Móveis \n"+
                                                              "C - Sair \n"+
                                                              "------------------------------------ \n");

            switch(OpAutoMóveis){
                case"A":
                    menu1 = JOptionPane.showInputDialog("Escolha o Tipo de Auto-Móvel Que deseja \n"+
                                                        "Cadastrar (Carro, Caminhão Ou Moto?)");
                    if((menu1.equals("carro")) || (menu1.equals("Carro")) || (menu1.equals("CARRO"))){
                        CAR.Cadastro();
                        CAR.ExibaAutomóvel();
                    }
                    else
                        if((menu1.equals("caminhão"))||(menu1.equals("Caminhão"))||(menu1.equals("CAMINHÃO"))){
                            CAM.Cadastro();
                            CAM.ExibaAutomóvel();
                        }
                        else
                            if((menu1.equals("moto"))||(menu1.equals("Moto"))||(menu1.equals("MOTO"))){
                                MOT.Cadastro();
                                MOT.ExibaAutomóvel();
                            }
                break;

                case"B":
                    menu2 = JOptionPane.showInputDialog(null,"Desejaria? Vender Auto-móveis \n"+
                                                        "Carro, Caminhão ou Moto....? ");
                    if ((menu2.equals("carro")) || (menu2.equals("Carro")) || (menu2.equals("CARRO"))){
                        CAR.emitirNotaFiscal();
                    }
                    else
                        if((menu2.equals("caminhão"))||(menu2.equals("Caminhão"))||(menu2.equals("CAMINHÃO"))){
                            CAM.emitirNotaFiscal();
                        }
                        else
                            if((menu2.equals("moto")) || (menu2.equals("Moto")) || (menu2.equals("MOTO"))){
                                MOT.emitirNotaFiscal();
                            }
                break;

                case"C":
                    JOptionPane.showInputDialog(null, "Opção Sair Escolhida");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,  "Opção inválida!");
            }

           resposta = JOptionPane.showInputDialog(null,"Você deseja retornar ao menu de opções?");

        }

        JOptionPane.showMessageDialog(null, "Programa vai encerrar");
    }
}
