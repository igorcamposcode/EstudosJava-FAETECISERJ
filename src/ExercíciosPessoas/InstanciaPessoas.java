package ExercíciosPessoas;

import javax.swing.JOptionPane;

public class InstanciaPessoas {
    public static void main(String[]args){
      String resp1,resp2,resp3;
      Pessoas PE = new Pessoas();
      String Respostas = JOptionPane.showInputDialog("Você deseja Executar o programa Pessoas?");

      while((Respostas.equals("sim"))||(Respostas.equals("Sim"))||(Respostas.equals("SIM"))){
          String OpPessoas = JOptionPane.showInputDialog("Escolha uma das opções do programa\n"+
                                                         "----------------------------------\n"+
                                                         "A - Cadastro pessoas\n"+
                                                         "B - Exibir Dados Cadastros Pessoas\n"+
                                                         "C - Pesquisa\n"+
                                                         "D - Sair\n"+
                                                         "----------------------------------\n" );

         switch (OpPessoas){
             case"A":

                 resp1 = JOptionPane.showInputDialog("Você deseja executar a opção cadastro pessoa?");

                 if((resp1.equals("sim"))||(resp1.equals("Sim"))||(resp1.equals("SIM"))){
                     PE.cadastrar();
                 }
             break;

             case"B":
                 resp2 = JOptionPane.showInputDialog("Você deseja executar a opção exibir cadastro pessoa?");

                 if ((resp2.equals("sim"))||(resp2.equals("Sim"))||(resp2.equals("SIM"))){
                     PE.exibirCadastroPessoas();
                 }
                 else
                     JOptionPane.showMessageDialog(null,"DADOS INEXISTENTES!");
             break;
             
             case"C":

                 resp3 = JOptionPane.showInputDialog("Você deseja executar a pesquisa?");

                 if((resp3.equals("sim"))||(resp3.equals("Sim"))||(resp3.equals("SIM"))){
                     PE.Pesquisa();
                 }

             case"D":
                 JOptionPane.showInputDialog(null,"Opção sair Escolhida");
             break;

             default:
                 JOptionPane.showMessageDialog(null,"Opção Inválida");
         }
         Respostas = JOptionPane.showInputDialog("Deseja Retonar ao menu de opções?");
      }
    }
}
