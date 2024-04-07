package listaexercicio.carro;

import java.util.Scanner;

public class Carro {
    String modelo;
    float velocidade;
    float aceleracao;
    int marcha;
    boolean ligado;
    
    public Carro(){
        this.modelo = "R8 Coupé plus";
        this.aceleracao = 0;
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }
    
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        
        Carro carro = new Carro();
        do {
            System.out.println("\n---Funções---");
            System.out.println("1 - ligar");
            System.out.println("2 - acelerar");
            System.out.println("3 - desacelerar");
            System.out.println("4 - virar à direita");
            System.out.println("5 - virar à esquerda");
            System.out.println("6 - subir marcha");
            System.out.println("7 - descer marcha");
            System.out.println("8 - desligar");
            System.out.println("9 - sair");
            System.out.println("\nInforme a função que deseja: ");
            escolha = scanner.nextInt();
            
            switch (escolha){
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.acelerar(30);
                    break;
                case 3:
                    carro.desacelerar(10);
                    break;
                case 4:
                    carro.virarDireita();
                    break;
                case 5:
                    carro.virarEsquerda();
                    break;
                case 6:
                    carro.subirMarcha();
                    break;
                case 7:
                    carro.descerMarcha();
                    break;
                case 8:
                    carro.desligar();
                    break;
                case 9:
                    System.out.println("Você saiu.");
                    break;
                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 9);
        
        scanner.close();
    }
    
    void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    
    void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
    
    void acelerar(float aceleracao){
        if (ligado){
            velocidade += aceleracao;
            System.out.println("Velocidade atual(após acelerar): " + velocidade + "Km/h.");
        } else {
            System.out.println("O carro está desligado. Lique-o para acelerar");
        }
    }
    
    void desacelerar(float desaceleracao){
        if (ligado){
            velocidade -= desaceleracao;
            System.out.println("Velocidade atual(após desacelerar): " + velocidade + "Km/h.");
        } else {
            System.out.println("O carro está desligado. Lique-o para desacelerar");
        }
    }
    
    void virarDireita(){
        if(ligado){
            System.out.println("O carro está virando à direita.");
        } else {
            System.out.println("O carro está desligado. Ligue-o para poder virar.");
        }
    }
    
    void virarEsquerda(){
        if(ligado){
            System.out.println("O carro está virando à esquerda.");
        } else {
            System.out.println("O carro está desligado. Ligue-o para virar.");
        }
    }
    
    void subirMarcha(){
        if(ligado && marcha < 5){
            marcha++;
            System.out.println("Marcha: " + marcha);
        } else if(marcha == 5){
            System.out.println("Você atingiu o máximo, não pode subir mais.");
        } else {
            System.out.println("O carro está desligado. Ligue-o para mudar a marcha.");
        }
    }
    
    void descerMarcha(){
        if(ligado && marcha > 1){
            marcha--;
            System.out.println("Marcha: " + marcha);
        } else if(marcha == 1){
            System.out.println("Não é possível descer mais.");
        } else {
            System.out.println("O carro está desligado. Ligue-o para mudar a marcha.");
        }
    }
}

