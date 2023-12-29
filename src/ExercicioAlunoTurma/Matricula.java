/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioAlunoTurma;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */

public class Matricula {
    String Nome, NomeTurma,NomeCurso,Turno,Sala,Série;
    int códigoCurso,códigoTurma,códMatricula;
    
     void ComprovanteMatriculaAluno(){
        JOptionPane.showMessageDialog(null,"COMPROVANTE DE MATRICULA NO SEGUINTE CURSO E TURMA!\n"+
                                                       "===================================================\n"+
                                                       "Matrícula : " + códMatricula + "\n"+
                                                       "Nome : " + Nome + "\n"+
                                                       "===================================================\n"+
                                                       "Código do Curso: " + códigoCurso + "\n"+
                                                       "Nome do Curso : " + NomeCurso + "\n"+
                                                       "===================================================\n"+
                                                       "Código da Turma : " + códigoTurma + "\n"+
                                                       "Nome Da Turma : " + NomeTurma + "\n"+
                                                       "Turno : " + Turno + "\n"+
                                                       "Sala : " + Sala + "\n"+
                                                       "Série : "+ Série + "\n"+               
                                                       "==================================================\n");
   }

}
   