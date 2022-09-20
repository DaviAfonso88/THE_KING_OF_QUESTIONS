
package luta;
import java.util.*;
public class KoQ {
    public static void main(String[] args) {

        // CRIAÇÃO DAS PERGUNTAS
        Scanner leia =  new Scanner(System.in);
        Pergunta p1 = new Pergunta( "Qual é o quadrado de 5?" );
        p1.definirAlternativaCorreta( "25." );
        p1.definirAlternativa( "15." );
        p1.definirAlternativa( "20." );
        p1.definirAlternativa( "5." );
        Pergunta p2 = new Pergunta( "Qual a raiz quadrada de 625?" );
        p2.definirAlternativaCorreta( "25." );
        p2.definirAlternativa( "20." );
        p2.definirAlternativa( "15." );
        p2.definirAlternativa( "45." );
        Pergunta p3 = new Pergunta( "Qual é o quadrado de 13?" );
        p3.definirAlternativaCorreta( "169." );
        p3.definirAlternativa( "13." );
        p3.definirAlternativa( "130." );
        p3.definirAlternativa( "133." );
        Pergunta p4 = new Pergunta( "Qual é a raiz quadrada de 121?" );
        p4.definirAlternativaCorreta( "11." );
        p4.definirAlternativa( "12." );
        p4.definirAlternativa( "21." );
        p4.definirAlternativa( "14." );
        Pergunta p5 = new Pergunta( "Qual é o quadrado de 9?" );
        p5.definirAlternativaCorreta( "81." );
        p5.definirAlternativa( "90." );
        p5.definirAlternativa( "99." );
        p5.definirAlternativa( "9." );
        Pergunta p6 = new Pergunta( "Qual é a raiz quadrada de 225?" );
        p6.definirAlternativaCorreta( "15." );
        p6.definirAlternativa( "25." );
        p6.definirAlternativa( "5." );
        p6.definirAlternativa( "22." );
        Pergunta p7 = new Pergunta( "Qual o quadrado de 20?" );
        p7.definirAlternativaCorreta( "400." );
        p7.definirAlternativa( "2000." );
        p7.definirAlternativa( "200." );
        p7.definirAlternativa( "222." );
        Pergunta p8 = new Pergunta( "Qual é a raiz cúbica de 8?" );
        p8.definirAlternativaCorreta( "2." );
        p8.definirAlternativa( "4." );
        p8.definirAlternativa( "3." );
        p8.definirAlternativa( "6." );
        Pergunta p9 = new Pergunta( "Qual é o cubo de 5" );
        p9.definirAlternativaCorreta( "125." );
        p9.definirAlternativa( "15." );
        p9.definirAlternativa( "55." );
        p9.definirAlternativa( "115." );
        Pergunta p10 = new Pergunta( "Qual é a raiz quadrada de 144?" );
        p10.definirAlternativaCorreta( "12." );
        p10.definirAlternativa( "14." );
        p10.definirAlternativa( "4." );
        p10.definirAlternativa( "44." );
        Pergunta p11 = new Pergunta( "Qual o quadrado de 14?" );
        p11.definirAlternativaCorreta( "196." );
        p11.definirAlternativa( "144." );
        p11.definirAlternativa( "140." );
        p11.definirAlternativa( "164." );
        Pergunta p12 = new Pergunta( "Qual é a raiz quadrada de 64?" );
        p12.definirAlternativaCorreta( "8." );
        p12.definirAlternativa( "6." );
        p12.definirAlternativa( "24." );
        p12.definirAlternativa( "14." );
        Pergunta p13 = new Pergunta( "Qual desse números nao é primo (2,3,5,7,11,13,15)?" );
        p13.definirAlternativaCorreta( "15." );
        p13.definirAlternativa( "2." );
        p13.definirAlternativa( "13." );
        p13.definirAlternativa( "7." );
        Pergunta p14 = new Pergunta( "Qual é a 10ª potência de 2?" );
        p14.definirAlternativaCorreta( "1024." );
        p14.definirAlternativa( "2048." );
        p14.definirAlternativa( "256." );
        p14.definirAlternativa( "512." );
        Pergunta p15 = new Pergunta( "Qual o quadrado de 7?" );
        p15.definirAlternativaCorreta( "49." );
        p15.definirAlternativa( "77." );
        p15.definirAlternativa( "47." );
        p15.definirAlternativa( "17." );
        Pergunta p16 = new Pergunta( "Qual é o resultado de 1/3?" );
        p16.definirAlternativaCorreta( "0,33." );
        p16.definirAlternativa( "0,3." );
        p16.definirAlternativa( "0,99." );
        p16.definirAlternativa( "3." );
        Pergunta p17 = new Pergunta( "Quando é 2+4(6+7)?" );
        p17.definirAlternativaCorreta( "54." );
        p17.definirAlternativa( "41." );
        p17.definirAlternativa( "78." );
        p17.definirAlternativa( "90." );
        Pergunta p18 = new Pergunta( "Qual é o cubo de 5?" );
        p18.definirAlternativaCorreta( "125." );
        p18.definirAlternativa( "25." );
        p18.definirAlternativa( "115." );
        p18.definirAlternativa( "225." );
        Pergunta p19 = new Pergunta( "Quanto é 5/0?" );
        p19.definirAlternativaCorreta( "Não existe divisão por 0." );
        p19.definirAlternativa( "0." );
        p19.definirAlternativa( "1." );
        p19.definirAlternativa( "5." );
        Personagem p[] = new Personagem[6];
        Jogador j[] = new Jogador[2];
        Desafio jogo = new Desafio();
// INICIO DO JOGO
        System.out.println("The King of Questions");
        System.out.println("Esse é um jogo de perguntas 1v1");
        System.out.println("Dois guerreiros entram, e apenas um sai como o Rei");
        System.out.println("Agora para iniciar o jogo KoQ, os dois jogadores"
                + " devem ser registrados");
        System.out.println("Bem vindo guerreiros, para iniciar sua jornada "
                + "digitem seu nome, um de cada vez: ");
        String aux= leia.nextLine();
        System.out.println(aux+" por favor, digite seu email: ");
        String email= leia.nextLine();
        System.out.println(aux+" por favor, digite seu telefone agora: ");
        String tel= leia.nextLine();
        System.out.println("Agora escolhA seu nickname: ");
        String nick= leia.nextLine();
        j[0] = new Jogador(aux,nick,email,tel);
        System.out.println("Jogador '"+nick+"' cadastrado com sucesso!");
        p[0] = new Personagem(nick,j[0]);
        System.out.println("Por favor inserir o nome do segundo jogador: ");
        String aux2= leia.nextLine();
        System.out.println(aux2+" por favor, digite seu email: ");
        String email2= leia.nextLine();
        System.out.println(aux2+" por favor, digite seu telefone agora: ");
        String tel2= leia.nextLine();
        System.out.println("Agora escolhe seu nickname: ");
        String nick2= leia.nextLine();
        j[1] = new Jogador(aux2,nick2,email2,tel2);
        System.out.println("'"+nick2+"' cadastrado com sucesso!");
        p[1] = new Personagem(nick2,j[1]);
        System.out.println("Agora que os Jogadores foram cadastrados"
                + ", eles devem escolher suas classes: ");
        p[0].mostrar();
        System.out.println(nick+" escolha sua classe");
        String escolha= leia.nextLine();
        p[0].escolherClasse(escolha);
        p[0].status();
        p[0].mostrar();
        System.out.println(nick2+" escolha sua classe: ");
        String escolha2= leia.nextLine();
        p[1].escolherClasse(escolha2);
        p[1].status();
        System.out.println("Agora que os jogadores tem suas classes"
                + " o jogo irá iniciar");
        System.out.println("REGRAS:\n-TODO JOGADOR DEVE RESPONDER AS PERGUNTAS"
                + "\n-A CADA RESPOSTA ERRADA, O JOGADOR PERDE 10 PONTOS DE VIDA"
                + "\nQUANDO UM JOGADOR TEM SUA VIDA ZERADA O JOGO ACABA");
        System.out.print("Carregando");
        System.out.print(".");
        try{Thread.sleep(1000);}catch(InterruptedException erro){}
        System.out.print(".");
        try{Thread.sleep(1000);}catch(InterruptedException erro){}
        System.out.print(".");
        try{Thread.sleep(1000);}catch(InterruptedException erro){}
        System.out.print(".");
        try{Thread.sleep(1000);}catch(InterruptedException erro){}
        System.out.println(".");
        try{Thread.sleep(1000);}catch(InterruptedException erro){}
        jogo.marcarBatalha(p[0], p[1]);
        jogo.cadastrarPerguntas(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,
                p14,p15,p16,p17,p18,p19);
        jogo.iniciarBatalha();
        
        }

    }
   
   