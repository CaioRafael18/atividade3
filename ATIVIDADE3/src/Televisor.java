public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;
    
    public Televisor() {
        canal = 1;
        volume = 10;
        ligado = false;
    }
    
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada");
    }
    
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada");
    }
    
    public void aumentarVolume() {
        if (ligado && volume < 100) {
            volume++;
            System.out.println("Volume aumentado: " + volume);
        }
    }
    
    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume diminuído: " + volume);
        }
    }
    
    public void trocarCanal(int novoCanal) {
        if (ligado && novoCanal > 0 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }
    
    public String toString() {
        return "Televisor: canal=" + canal + ", volume=" + volume + ", ligado=" + ligado;
    }

}


