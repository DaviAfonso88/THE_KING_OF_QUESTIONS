/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

/**
 *
 * @author yourn
 */
public class Personagem {
        //Atributos
    private String nome;
    private int vitorias, derrotas, empates;
    private String classe;
    private int vida=100;
    private Jogador player;
    private boolean ca=true,ar=true,ma=true,mo=true,du=true;
    private int forca=1, velocidade=1, inteligencia=1, beleza=1, sorte=1;
    private int acertos=0;
    
   //Metodos 
      public void mostrar(){
          System.out.println("Classes disponíveis");
          if (ca == true){
              System.out.print("CAVALEIRO | ");}
          if (ar == true){
              System.out.print("ARQUEIRO | ");}
          if (ma == true){
              System.out.print("MAGO | ");}
          if (mo == true){
              System.out.print("MODELO | ");}
          if (du == true){
              System.out.println("DUENDE");}      
      }
      public void escolherClasse(String c) {
          if ("CAVALEIRO".equals(c) && this.getCa()== true){
              this.setCa(false);
              this.setClasse("CAVALEIRO");
              this.setForca(5);
              
          } 
          if ("ARQUEIRO".equals(c) && this.getAr()== true){
              this.setAr(false);
              this.setClasse("ARQUEIRO");
              this.setVelocidade(5);
          }
          if ("MAGO".equals(c) && this.getMa()== true){
              this.setMa(false);
              this.setClasse("MAGO");
              this.setInteligencia(5);
          }
          if ("MODELO".equals(c) && this.getMo()== true){
              this.setMo(false);
              this.setClasse("MODELO");
              this.setBeleza(5);
          }
          if ("DUENDE".equals(c) && this.getDu()== true){
              this.setDu(false);
              this.setClasse("DUENDE");
              this.setSorte(5);
          }
          
      }

       public void status(){
        System.out.println(this.getPlayer().getNome() + " é um " + this.getClasse());
        System.out.println("VIDA: " + this.getVida() + "%");
        System.out.println("Força: " + this.getForca());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Inteligência: " + this.getInteligencia());
        System.out.println("Beleza: " + this.getBeleza());
        System.out.println("Sorte: " + this.getSorte());
    }
       
        public void ganharLuta(){
        this.setAcertos(this.getAcertos() + 1);
    }
    public void perderLuta(){
        this.setVida(this.getVida()- 10);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+ 1);
        
    }

    public Personagem(String nome, Jogador player) {
        this.nome = nome;
        this.player = player;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Jogador getPlayer() {
        return player;
    }

    public void setPlayer(Jogador player) {
        this.player = player;
    }

    public boolean getCa() {
        return ca;
    }

    public void setCa(boolean ca) {
        this.ca = ca;
    }

    public boolean getAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean getMa() {
        return ma;
    }

    public void setMa(boolean ma) {
        this.ma = ma;
    }

    public boolean getMo() {
        return mo;
    }

    public void setMo(boolean mo) {
        this.mo = mo;
    }

    public boolean getDu() {
        return du;
    }

    public void setDu(boolean du) {
        this.du = du;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getBeleza() {
        return beleza;
    }

    public void setBeleza(int beleza) {
        this.beleza = beleza;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    
    
}