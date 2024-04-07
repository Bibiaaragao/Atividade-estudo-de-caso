package estudocaso.televisao;

import java.util.Scanner;

public class Televisao {
    private String marca;
    private int tamanhoTela;
    private int volume;
    private int voltagem;
    private int canal;
    private boolean ligado;
    private int consumo;
    
    public Televisao(String marca, int tamanhoTela, int voltagem){
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
        this.volume = 5;
        this.voltagem = voltagem;
        this.canal = 1;
        this.ligado = false;
        this.consumo = 0;
    }
    
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        
        Televisao televisao = new Televisao("Samsung", 42, 110);
        System.out.println("Marca: " + televisao.marca + " - Polegadas: "+ televisao.tamanhoTela + " - Voltagem: "+ televisao.voltagem);
        
        do{
            System.out.println("\n---Funções---");
            System.out.println("1 - ligar\n2 - aumentar volume\n3 - diminuir volume\n4 - subir canal\n5 - descer canal\n6 - desligar\n7 - Fechar programa\n");
            System.out.println("Informe a função desejada: ");
            escolha = scanner.nextInt();
            
            switch (escolha){
                case 1: 
                    televisao.ligar();
                    break;
                case 2:
                    televisao.aumentarVolume();
                    break;
                case 3: 
                    televisao.diminuirVolume();
                    break;
                case 4:
                    televisao.subirCanal();
                    break;
                case 5: 
                    televisao.descerCanal();
                    break;
                case 6:
                    televisao.desligar();
                    break;
                case 7:
                    System.out.println("Você fechou o programa");
                    break;
                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
                
        } while(escolha != 7);
        
        scanner.close();
    }
    
    public void ligar(){
        if (!this.ligado){
            this.ligado = true;
            consumo = this.tamanhoTela * this.voltagem;
            System.out.println("A TV está ligada. Seu consumo é " + consumo + "W");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }
    
    public void desligar(){
        if (ligado){
            ligado = false;
            System.out.println("A TV está desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }
    
    public void aumentarVolume(){
        if (ligado && volume < 10){
            volume ++;
            System.out.println("Volume atual(após aumentar): " + volume);
        } else if(volume == 10){
            System.out.println("Já alcançou o volume máximo.");
        } else {
            System.out.println("A TV está desligada. Ligue-a para aumentar o volume.");
        }
        
    }
    
    public void diminuirVolume(){
        if (ligado && volume > 1){
            volume--;
            System.out.println("Volue atual(após diminuir): " + volume);
        } else if(volume == 1){
            System.out.println("O volume já está no mínimo");
        } else {
            System.out.println("A TV está desligada. Ligue-a para diminuir o volume.");
        }
    }
    
    public void subirCanal(){
        if(ligado){
            canal++;
            System.out.println("Mudou para o canal " + canal);
        } else {
            System.out.println("A TV está desligada. Ligue-a para mudar de cananl.");
        }
    }
    
    public void descerCanal(){
        if (ligado && canal > 1){
            canal--;
            System.out.println("Mudou para o canal " + canal);
        } else if(canal == 1) {
            System.out.println("Não é possível descer mais canais.");
        } else {
            System.out.println("A TV está desligada. Ligue-a para poder mudar o canal.");
        }
    }
}
   
