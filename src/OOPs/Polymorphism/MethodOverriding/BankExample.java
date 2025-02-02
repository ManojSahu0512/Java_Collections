package OOPs.MethodOverriding;

class Bank{
    int getRateOfInterest(){
        return  0;
    }
}
class SBIN extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class ICIC extends Bank{
    @Override
    int getRateOfInterest() {
        return 9;
    }
}

class AXIS extends Bank{
    @Override
    int getRateOfInterest() {
        return super.getRateOfInterest();   //invoking super call method
    }
}


public class BankExample {
    public static void main(String[] args) {
        SBIN sbin=new SBIN();
        ICIC icic=new ICIC();
        AXIS axis=new AXIS();
        System.out.println("SBI Rate of Interest: "+sbin.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+icic.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+axis.getRateOfInterest());
    }
}

//SBI Rate of Interest: 8
//ICICI Rate of Interest: 9
//AXIS Rate of Interest: 0