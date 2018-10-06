package ru.shadrina.chat;

import ru.shadrina.chat.testEvent.EventService;

import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.CDI;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        SeContainerInitializer.newInstance().addPackages(App.class).initialize();

        System.out.println("основной поток из которого запускаю события: "+Thread.currentThread().getId());

        MessageNotification notification = CDI.current().select(MessageNotification.class).get();
        notification.run();
        }
}
