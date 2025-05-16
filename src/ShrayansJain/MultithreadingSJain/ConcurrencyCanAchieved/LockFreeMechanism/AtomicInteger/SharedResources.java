package ShrayansJain.MultithreadingSJain.ConcurrencyCanAchieved.LockFreeMechanism.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResources {
    AtomicInteger count=new AtomicInteger(0);
    public void increment(){
        count.incrementAndGet();
    }
    public int get(){
        return count.get();
    }

}
