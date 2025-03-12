interface car{
    void Drive();
}
interface Electricvehicle{
    void chargeBattery();
}

class Hybridcar implements car, Electricvehicle{
    public void Drive(){
        System.out.println("Driving hybrid car");

    }
    public void chargeBattery(){
        System.out.println("Charging Battery..");

    }
}
public class Test {
    public static void main (String[] args){
        Hybridcar mycar= new Hybridcar();
        mycar.Drive();
        mycar.chargeBattery();
    }
}

/*Driving hybrid car
Charging Battery.. */