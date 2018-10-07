package ru.shadrina.exemples.testEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.ObservesAsync;

@ApplicationScoped
public class AsyncSubscriber {
    //метод наблюдает приходящие события в классе SyncEvent. Public! Он произойдет параллельно
    public void SyncSubscriber(@ObservesAsync AsyncEvent event) {
        System.out.println("AsyncSubscriber:" +
                " случилось асинхронное событие за котором я следил. Я работаю в потоке № " + Thread.currentThread().getId());
        System.out.println(event.getName());
    }
}

