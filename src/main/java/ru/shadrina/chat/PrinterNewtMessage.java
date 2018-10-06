package ru.shadrina.chat;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.ObservesAsync;

@ApplicationScoped
public class PrinterNewtMessage {
    public void printer(@ObservesAsync newMessageEvent getNewMessage) {
        System.out.println("Я класс PrinterNewMessage. Я слежу за появлением нового сообщения, которое должен напечатать.");
        System.out.println("Я работаю, только когда меня позовет MessageNotification. " +
                "И делаю это в отдельном от него потоке: " + Thread.currentThread().getId());
        System.out.println("Новое сообщение: " + getNewMessage.getMessage());
    }
}
