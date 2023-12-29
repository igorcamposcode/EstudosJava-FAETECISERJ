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

public class CalculeSituação {
     String Nome, NomeTurma,NomeCurso,Turno,Sala,Série,Situação;
     int códMatricula;
     double nota1,nota2,nota3,média;
     
     void CadastroDasMedias(){
         nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 1º Bimestre do Aluno"));
         nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 2º Bimestre do Aluno"));
         nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 3º Bimestre do Aluno"));
         
         média = (nota1 + nota2 + nota3) / 3;
         
         if(média <= 4)
          Situação = "Reprovado";
        else 
          if(  (média > 4) & (média < 7)  )
                  Situação = "Recuperação";
          else
              Situação = "Aprovado";
       
     }
     
     void ExibirBoletim(){
         JOptionPane.showMessageDialog(null, "Cadastro dos alunos e soma de média\n"+
                
                                                         "============================\n"+
                                                         "ALUNO:  "+Nome+"\n"+
                                                         "CURSO:  "+NomeCurso+"\n"+
                                                         "TURMA: "+NomeTurma+"\n"+
                                                         "TURNO : " + Turno + "\n"+
                                                         "SALA : "  + Sala + "\n"+
                                                         "SÉRIE: "+Série+"\n"+
                                                         "============================\n"+        
                                                         "MATRÍCULA: "+códMatricula+"\n"+
                                                         "============================\n"+
                                                         "NOTA 1: "+nota1+"\n"+
                                                         "NOTA 2: "+nota2+"\n"+
                                                         "NOTA 3: "+nota3+"\n"+
                                                         "============================\n"+
                                                         "SUA MÉDIA FOI: "+média+"\n"+
                                                         "SUA SITUAÇÃO É: "+Situação+"\n"+        
                                                         "============================");  
     }
    
}
