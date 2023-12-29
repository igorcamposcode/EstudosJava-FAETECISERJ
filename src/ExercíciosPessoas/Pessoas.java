package ExercíciosPessoas;

import javax.swing.JOptionPane;
public class Pessoas {

    String[] Nome = new String[5];
    String[] Login = new String[5];
    String[] Senha = new String[5];

    String lp, sp;

    int i,qtde;
    boolean encontro;

    void cadastrar(){
        qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas você irá cadastrar?"));

        while(qtde > 5 ){
          qtde = Integer.parseInt(JOptionPane.showInputDialog("a Quantidade está acima do limite escolha somente Valores de 1 até 5\n"+
                                                                "Quantas pessoas você irá cadastrar"));

        }
        for(i=1;i<=qtde;i++){
            Nome[i] = JOptionPane.showInputDialog("Digite o seu nome pessoal ");
            Login[i] = JOptionPane.showInputDialog("Digite o seu login pessoal");
            Senha[i] = JOptionPane.showInputDialog("Digite sua Senha");
            
               while(Login[i].equals(Senha[i])){
               JOptionPane.showMessageDialog(null,"Login e Senha estão Iguais por favor tente novamente!");
               Login[i] = JOptionPane.showInputDialog("Digite o seu login pessoal");
               Senha[i] = JOptionPane.showInputDialog("Digite sua Senha, somente letras");
            }
        }
        
        i=1;

    }
    void exibirCadastroPessoas(){
        i=1;
        for(i=1;i<=qtde;i++){
            JOptionPane.showMessageDialog(null,"Dados das pessoas\n" +
                                                             "---------------------------------\n"+
                                                             "Nome da pessoa: "+Nome[i]+"\n"+
                                                             "Login da pessoa: "+Login[i]+"\n"+
                                                             "Senha da pessoa: "+Senha[i]+"\n"+
                                                             "---------------------------------\n");
        }
    }
    
    void Pesquisa(){

        i=1;
        encontro=false;

        lp = JOptionPane.showInputDialog(" Digite o seu login...");

        for (i=1;i<=qtde;i++){
            if (lp.equals(Login[i])){
                JOptionPane.showMessageDialog(null,"Login encontrado no indice [ " + i + " ] é: "+ Login[i]);
                encontro = true;
            }
        }
        if(encontro == false){
            JOptionPane.showMessageDialog(null,"Pesquisa Não encontrada");
        }

        sp = JOptionPane.showInputDialog("Digite a sua senha...");

        for (i=1;i<=qtde;i++){
            if (sp.equals(Senha[i])){
                JOptionPane.showMessageDialog(null,"Senha encontrada no indice [ " + i + " ] é: "+ Senha[i]);
                encontro = true;
            }
        }
        if(encontro == false){
            JOptionPane.showMessageDialog(null,"Pesquisa Não encontrada");
        }

    }

}



