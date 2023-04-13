
class App {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        ControleRemoto controle = new ControleRemoto(tv);

        System.out.println(tv.toString()); 

        controle.ligar();
        controle.aumentarVolume();
        controle.trocarCanal(7);
        System.out.println(controle.toString()); 

        controle.diminuirVolume();
        controle.trocarCanal(104);
        System.out.println(controle.toString()); 
        controle.desligar();
        System.out.println(controle.toString()); 
    }
}