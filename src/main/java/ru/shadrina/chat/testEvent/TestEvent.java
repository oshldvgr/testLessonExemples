package ru.shadrina.chat.testEvent;

import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.CDI;

public class TestEvent {
    public static void main(String[] args) {
        SeContainerInitializer.newInstance().addPackages(TestEvent.class).initialize();

        System.out.println("основной поток из которого запускаю события: " + Thread.currentThread().getId());
        EventService eventService = CDI.current().select(EventService.class).get();
        eventService.run();

    }
}
