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
import java.util.Random;

public class CadastroAlunoTurmaCurso {
    String Nome,CPF,Endereço,Telefone,NomeTurma,Turno,Sala,Série,NomeCurso;
    int códigoTurma,códigoCurso,códMatricula;
    
    Random RD = new Random();
    
    void CadastrarAluno(){
        
        Nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
        CPF = JOptionPane.showInputDialog("Digite o CPF do Aluno");
        Endereço = JOptionPane.showInputDialog("Digite o endereço do Aluno");
        Telefone = JOptionPane.showInputDialog("Digite o Telefone do Aluno");
      
       códMatricula = RD.nextInt(55555555);
     
    }

    void exibirCadastroAluno(){
        JOptionPane.showMessageDialog(null,"OS DADOS CADASTRADOS SEGUINTES SÃO? FAVOR CONFIRMAR\n"+
                                                        "==================================================\n"+
                                                        "Matrícula : " + códMatricula + "\n"+
                                                        "==================================================\n"+
                                                        "Nome : " + Nome + "\n"+ 
                                                        "CPF : " + CPF + "\n"+
                                                        "Endereço : " + Endereço + "\n"+
                                                        "Telefone : " + Telefone + "\n"+
                                                        "==================================================\n");
    }

    void CadastrarTurma(){

        NomeTurma = JOptionPane.showInputDialog("Digite o Nome da Turma");
        Turno = JOptionPane.showInputDialog("Digite o Turno da Turma");
        Sala = JOptionPane.showInputDialog("Digite a Sala do Aluno");
        Série = JOptionPane.showInputDialog("Digite a Série do Aluno");

        códigoTurma = RD.nextInt(555555);
    }

    void exibirCadastroTurma(){
        JOptionPane.showMessageDialog(null,"OS DADOS CADASTRADOS SEGUINTES SÃO? FAVOR CONFIRMAR\n"+
                                                        "==================================================\n"+
                                                        "Código da Turma : " + códigoTurma + "\n"+        
                                                        "Nome Da Turma : " + NomeTurma + "\n"+ 
                                                        "Turno : " + Turno + "\n"+
                                                        "Sala : " + Sala + "\n"+
                                                        "Série : "+ Série + "\n"+        
                                                        "==================================================\n");
    }

    // Nessa Parte Faremos o cadastro do curso
    
    void CadastroCurso(){
        NomeCurso = JOptionPane.showInputDialog("Digite o Nome do Curso Desejado");

        códigoCurso = RD.nextInt(5555);
    }

    void exibirCadastroCurso(){
        JOptionPane.showMessageDialog(null,"OS DADOS CADASTRADOS SEGUINTES SÃO? FAVOR CONFIRMAR\n"+
                                                       "==================================================\n"+
                                                       "Código do Curso: " + códigoCurso + "\n"+
                                                       "Nome do Curso : " + NomeCurso + "\n"+
                                                       "==================================================\n");
    }

            
}
