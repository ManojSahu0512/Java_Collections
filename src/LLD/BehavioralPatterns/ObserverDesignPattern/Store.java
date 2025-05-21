package LLD.BehavioralPatterns.ObserverDesignPattern;

import LLD.BehavioralPatterns.ObserverDesignPattern.Observable.IphoneObservableImpl;
import LLD.BehavioralPatterns.ObserverDesignPattern.Observable.StocksObservable;
import LLD.BehavioralPatterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import LLD.BehavioralPatterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import LLD.BehavioralPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable=new IphoneObservableImpl();
        NotificationAlertObserver observer1=new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("xyz2@gmil.com",iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImpl("xyz_username",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(10);
    }
}
//mail sent to: xyz@gmail.com
//mail sent to: xyz2@gmil.com
//msg sent to: xyz_username