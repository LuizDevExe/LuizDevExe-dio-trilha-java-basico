public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.powerOn();
        smartTv.volUp();
        smartTv.volDown();
        smartTv.chanelUp();
        smartTv.setChanel(10);

        System.out.println("A tv está -> " + (smartTv.powerStatus ? "ligada" : "desligada"));
        System.out.println("Canal atual -> " + smartTv.chanel);
        System.out.println("Volume atual -> " + smartTv.vol);

    }
}
