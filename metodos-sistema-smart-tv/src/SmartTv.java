public class SmartTv {

    boolean powerStatus = false;
    int chanel = 1;
    int vol = 25;

    public void powerOn(){
        powerStatus = true;
    }
    public void powerOff(){
        powerStatus = false;
    }

    public void volUp(){
        vol++;
    }

    public void volDown(){
        vol--;
    }

    public void chanelUp(){
        chanel++;
    }

    public void chanelDown(){
        chanel--;
    }

    public void setChanel (int setChanel){
        chanel = setChanel;
    }
    
}