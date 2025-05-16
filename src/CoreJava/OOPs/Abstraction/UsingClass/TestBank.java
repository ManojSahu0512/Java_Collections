package CoreJava.OOPs.Abstraction;

abstract class Bank{
    abstract int getRateOfInterest();
}

class SBIN extends Bank{

    @Override
    int getRateOfInterest() {
        return 9;
    }
}
class ICIC extends Bank{

    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class PNB extends Bank{

    @Override
    int getRateOfInterest() {
        return 7;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank bank;
        bank=new SBIN();

        System.out.println("Rate of Interest is: "+bank.getRateOfInterest()+" %");
        bank=new ICIC();
        System.out.println("Rate of Interest is: "+bank.getRateOfInterest()+" %");

        bank=new PNB();
        System.out.println("Rate of Interest is: "+bank.getRateOfInterest()+" %");
    }
}

//Rate of Interest is: 9 %
//Rate of Interest is: 8 %
//Rate of Interest is: 7 %