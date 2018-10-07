package ru.shadrina.exemples.testEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class SyncSubscriber {
    //метод наблюдает приходящие события в классе SyncEvent. Public!
    public void SyncSubscriber(@Observes SyncEvent event) {
        System.out.println("SyncSubscriber:" +
                " случилось синхронное событие за котором я следил. Я работаю в потоке № " + Thread.currentThread().getId());
    }
}
