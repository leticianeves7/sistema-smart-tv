public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada); //false
        System.out.println("Canal atual: " + smartTv.canal); //1
        System.out.println("Volume atual: " + smartTv.volume); //15

        smartTv.ligar();
        System.out.println("New states - TV Ligada? " + smartTv.ligada); //true

        smartTv.desligar();
        System.out.println("New states - TV Ligada? " + smartTv.ligada); //false

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume); //17

        smartTv.mudarCanal(27);
        System.out.println("O canal atual é: " + smartTv.canal); //27 (usuario passando como parametro o canal desejado)

        smartTv.passarCanal(); //28
        smartTv.passarCanal(); //29
        smartTv.passarCanal(); //30
        smartTv.passarCanal();
        System.out.println("O canal atual é: " + smartTv.canal); //31

    }
}
