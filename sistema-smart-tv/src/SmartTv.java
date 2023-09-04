public class SmartTv {
    
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void aumentarVol(){
        volume++;
        System.out.println("Aumentando volume: "+ volume);
    }
     public void baixarVol(){
        volume--;
        System.out.println("Baixando volume: "+ volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }



}
