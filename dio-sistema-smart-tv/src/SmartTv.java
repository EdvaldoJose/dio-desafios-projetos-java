public class SmartTv {
    boolean ligada = false;
    boolean desligada = true;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume = volume++;
        System.out.println("Aumentando volume: " + volume);
    }

    public void diminuirVolume() {
        volume = volume--;
        System.out.println("Diminuindo volume: " + volume);
    }

}
