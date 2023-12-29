/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercecioCalculeStituação;

/**
 *
 * @author Aluno Igor 
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class CalculeSituação {
    
    String aluno,curso,turma,série,situação;
    int matricula; 
    double nota1,nota2,nota3,média;
    
    Random r = new Random();
    
    void cadastroAluno(){
        aluno = JOptionPane.showInputDialog("Digite o nome do aluno: "); 
        curso = JOptionPane.showInputDialog("Digite o curso do aluno: ");
        turma = JOptionPane.showInputDialog("Digite a turma do aluno: ");
        série = JOptionPane.showInputDialog("Digite a série do aluno: ");
        
        matricula = r.nextInt(55555);
        
       nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 1º bimestro do aluno "));
       nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 2º bimestro do aluno "));
       nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 3º bimestro do aluno "));
       
       //média
       média = nota1 + nota2 + nota3 / 3;  
       //análise situação conforme a média
       // se (media <= 4)
       //     situacao = "reprovado"
       
      if(média <= 4)
          situação = "Reprovado";
        else 
          if(  (média > 4) & (média < 7)  )
                  situação = "Recuperação";
          else
              situação = "Aprovado";
       
    }
    
    void ExibaCadastroAlunosEnotas(){
        JOptionPane.showMessageDialog(null, "Cadastro dos alunos e soma de média\n"+
                
                                                         "============================\n"+
                                                         "ALUNO:  "+aluno+"\n"+
                                                         "CURSO:  "+curso+"\n"+
                                                         "TURMA: "+turma+"\n"+
                                                         "SÉRIE: "+série+"\n"+
                                                         "============================\n"+        
                                                         "MATRÍCULA: "+matricula+"\n"+
                                                         "============================\n"+
                                                         "NOTA 1: "+nota1+"\n"+
                                                         "NOTA 2: "+nota2+"\n"+
                                                         "NOTA 3: "+nota3+"\n"+
                                                         "============================\n"+
                                                         "SUA MÉDIA FOI: "+média+"\n"+
                                                         "SUA SITUAÇÃO É: "+situação+"\n"+        
                                                         "============================\n");  
    }
}
