/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioAlunoTurma;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class InstanciaAlunoTurma {
    public static void main(String[]args){
        String Menu1,Menu2,Menu3,Menu4,Menu5;
        String Menu6,Menu7,Menu8;

        CadastroAlunoTurmaCurso CAT = new CadastroAlunoTurmaCurso();
        Matricula MAT = new Matricula();
        CalculeSituação CLS = new CalculeSituação();
        
        String respostas = JOptionPane.showInputDialog("Deseja Executar o Programa Cadastro Aluno e Turma?");
        
        while ((respostas.equals("Sim")) || (respostas.equals("sim")) || (respostas.equals("SIM"))){
            
            String opCadastro = JOptionPane.showInputDialog("Escolha As Opções Seguintes \n"+
                                                            "==============================\n"+
                                                            "A - Cadastrar Aluno \n"+
                                                            "B - Cadastrar Turma  \n"+
                                                            "==============================\n"+
                                                            "C - Conferir Cadastro Aluno \n"+
                                                            "D - Conferir Cadastro da Turma  \n"+   
                                                            "==============================\n"+
                                                            "E - Cadastrar Curso \n"+
                                                            "F - Cadastro Notas \n"+
                                                            "G - Exibir Comprovante Ao Aluno \n"+
                                                            "H - Gerar Boletim de notas do alnuo \n"+
                                                            "==============================\n");
            
            switch(opCadastro){
                
                case"A":
                    Menu1 = JOptionPane.showInputDialog("Você Deseja Executar a Opção Cadastrar Aluno?");
                    
                    if((Menu1.equals("sim")) || (Menu1.equals("Sim")) || (Menu1.equals("SIM")) ){
                        CAT.CadastrarAluno();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Esse Cadastro é Inexistente, Ou não Existe");

                    break;

                case"B":
                    Menu2 = JOptionPane.showInputDialog("Você Deseja Executar a Opção Cadastrar Turma?");

                    if((Menu2.equals("sim")) || (Menu2.equals("Sim")) || (Menu2.equals("SIM")) ){
                        CAT.CadastrarTurma();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Esse Cadastro é Inexistente, Ou não Existe");
                    break;

                case"C":
                    Menu3 = JOptionPane.showInputDialog("Você Deseja Verificar o Cadastro do Aluno?");

                    if((Menu3.equals("sim")) || (Menu3.equals("Sim")) || (Menu3.equals("SIM")) ){
                        CAT.exibirCadastroAluno();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Exibição Não concluida, ou os dados não foram inseridos");
                break;

                case"D":
                    Menu4 = JOptionPane.showInputDialog("Você deseja Verificar o Cadastro da Turma?");

                    if((Menu4.equals("sim")) || (Menu4.equals("Sim")) || (Menu4.equals("SIM")) ){
                        CAT.exibirCadastroTurma();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Exibição Não concluida, ou os dados não foram inseridos");
                break;

                case"E":
                   Menu5 = JOptionPane.showInputDialog("Você deseja Cadastrar Curso?");

                   if ((Menu5.equals("sim")) || (Menu5.equals("Sim")) || (Menu5.equals("SIM")) ){
                       CAT.CadastroCurso();
                   }
                   else
                       JOptionPane.showMessageDialog(null,"Esse Cadastro é Inexistente, Ou não Existe");
                break;

                case"F":
                    Menu6 = JOptionPane.showInputDialog("Deseja Cadastrar Notas");

                    if((Menu6.equals("sim")) || (Menu6.equals("Sim")) || (Menu6.equals("SIM")) ){
                        CLS.CadastroDasMedias();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Exibição Não concluida, ou os dados não foram inseridos");
                break;
                
                // Aqui executáremos a confirmação de matricula 

                case"G":
                    Menu7 = JOptionPane.showInputDialog("DADOS DO CURSO \n" +
                                                        "=====================\n"+
                                                        "Curso : " + CAT.NomeCurso+ "\n"+
                                                        "Código :" + CAT.códigoCurso + "\n"+
                                                        "=====================\n"+
                                                        "DESEJA MATRICULAR ALUNO NESSE CURSO?\n"+
                                                        "=====================\n");
                    
                    if ((Menu7.equals("sim")) || (Menu7.equals("Sim")) || (Menu7.equals("SIM")) ){
                        
                        MAT.Nome = CAT.Nome;
                        MAT.códMatricula = CAT.códMatricula;
                        MAT.NomeTurma = CAT.NomeTurma;
                        MAT.códigoTurma = CAT.códigoTurma;
                        MAT.Turno = CAT.Turno;
                        MAT.Sala = CAT.Sala;
                        MAT.Série = CAT.Série;
                        MAT.códigoCurso = CAT.códigoCurso;
                        MAT.NomeCurso = CAT.NomeCurso;
                        
                        MAT.ComprovanteMatriculaAluno();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"DESEJA VOLTAR AO MENU?");
                break;
                
                case"H":
                  Menu8 = JOptionPane.showInputDialog("Deseja Executar o Boletim de Notas do Aluno?");
                  
                  if ((Menu8.equals("sim")) || (Menu8.equals("Sim")) || (Menu8.equals("SIM"))){
                      CLS.Nome = CAT.Nome;
                      CLS.NomeCurso = CAT.NomeCurso;  
                      CLS.NomeTurma = CAT.NomeTurma;
                      CLS.Turno = CAT.Turno;
                      CLS.Sala = CAT.Sala;
                      CLS.Série = CAT.Série;
                      CLS.códMatricula = CAT.códMatricula;
                      
                      CLS.ExibirBoletim(); 
                  }
                  else
                      JOptionPane.showMessageDialog(null,"DESEJA VOLTAR AO MENU?");
                break;  

                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
            respostas = JOptionPane.showInputDialog("Deseja Retonar ao programa Cadastro de alunos, turmas e curso?");
        }
        JOptionPane.showMessageDialog(null,"O Programa irá se encerrar, Obrigado pela utilização");
    }
}
