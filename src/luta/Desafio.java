/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

import java.util.*;
public class Desafio {
    private Personagem desafiado;
    private Personagem desafiante;
    private Pergunta p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19;
    private boolean aprovado;
    
    Scanner leia = new Scanner(System.in);
    
    public void cadastrarPerguntas(Pergunta p1, Pergunta p2, Pergunta p3, Pergunta p4, Pergunta p5,
    Pergunta p6, Pergunta p7, Pergunta p8, Pergunta p9, Pergunta p10, Pergunta p11, Pergunta p12,
    Pergunta p13, Pergunta p14, Pergunta p15, Pergunta p16, Pergunta p17, Pergunta p18, Pergunta p19) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
        this.p10 = p10;
        this.p11 = p11;
        this.p12 = p12;
        this.p13 = p13;
        this.p14 = p14;
        this.p15 = p15;
        this.p16 = p16;
        this.p17 = p17;
        this.p18 = p18;
        this.p19 = p19;
 
        
        
        
}

    public void marcarBatalha(Personagem p1, Personagem p2) {
        if (p1 != p2){
            this.aprovado= true;
            this.desafiado= p1;
            this.desafiante= p2;
        } else {
            this.aprovado= false;
        }
    }
        public void iniciarBatalha() {
        if (this.getAprovado()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.status();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.status();
            //while(this.desafiado.getVida()>0 && this.desafiante.getVida()>0){
            p1.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            int ordem = leia.nextInt();
            
            if(p1.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p1.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            
            // --
            p2.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p2.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p2.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            p3.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p3.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p3.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            p4.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p4.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p4.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            p5.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p5.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p5.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            p6.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p6.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p6.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            p7.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p7.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p7.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            p8.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p8.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p8.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p9.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p9.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p9.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            } else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p10.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p10.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p10.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }} else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p11.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p11.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p11.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }} else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p12.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p12.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p12.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }} else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p13.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p13.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p13.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }} else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p14.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p14.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p14.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }}else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p15.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p15.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p15.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }} else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p16.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p16.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p16.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            } } else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p17.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p17.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p17.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            } } else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p18.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p18.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();} else {
            System.out.println("FIM DE JOGO");
                System.exit(0);}
            if(p18.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }
            // --
            if (this.desafiado.getVida()>0 && this.desafiante.getVida()>0) {
            p19.mostrar();
            System.out.println(this.desafiado.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            
            if(p19.correta == ordem) {
                this.desafiado.ganharLuta();
                System.out.println(this.desafiado.getNome()+"acertou");
            } else {System.out.println(this.desafiado.getNome()+"errou");
                    this.desafiado.perderLuta();
            }   
            
            System.out.println(this.desafiante.getNome()+"Escolha sua resposta");
            ordem = leia.nextInt();
            if(p19.correta == ordem) {
                this.desafiante.ganharLuta();
                System.out.println(this.desafiante.getNome()+"acertou");
            } else {System.out.println(this.desafiante.getNome()+"errou");
                    this.desafiante.perderLuta();
            }} else {
                System.out.println("FIM DE JOGO");
                System.exit(0);
            }
        }
    }

    public Personagem getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Personagem desafiado) {
        this.desafiado = desafiado;
    }

    public Personagem getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Personagem desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
