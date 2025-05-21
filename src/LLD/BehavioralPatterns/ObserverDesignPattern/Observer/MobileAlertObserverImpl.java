package LLD.BehavioralPatterns.ObserverDesignPattern.Observer;

import LLD.BehavioralPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;
    public  MobileAlertObserverImpl(String userName,StocksObservable observable){
        this.observable=observable;
        this.userName=userName;
    }

    @Override
    public void update() {
      sendMsgOnMobile(userName,"product is in stock hurry up!");
    }
    private void sendMsgOnMobile(String userName,String msg){
        System.out.println("msg sent to: "+userName);
        //send the actual email to the end user
    }
}
