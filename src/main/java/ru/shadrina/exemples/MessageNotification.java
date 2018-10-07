package ru.shadrina.exemples;

import javax.enterprise.event.Event;
import javax.inject.Inject;

//класс, оповещающий о свершении события из класса GetMessage:
// т.е. он создает новое событие и кладет в него новое сообщение,
// после этого говорит другим классам, подписанным на это событие (появление нового сообщения), что сообщение-то пришло, надо действовать.
// Причем действовать параллельно с пришедшим сообщением


public class MessageNotification {
    @Inject
    private Event<ru.shadrina.exemples.newMessageEvent> newMessageEvent;
    public void run(){

        System.out.println("Я MessageNotification class, наблюдающий за новыми сообщениями. Сейчас я создам событие: ПРИШЛО НОВОЕ СООБЩЕНИЕ" );
        System.out.println("Кстати, я работаю в потоке: "+ Thread.currentThread().getId());
        newMessageEvent.fireAsync(new newMessageEvent("Hello, Olga!"));
    }
}
