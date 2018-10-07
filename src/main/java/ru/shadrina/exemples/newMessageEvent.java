package ru.shadrina.exemples;

import lombok.Getter;
//событие прихода нового сообщения - на каждое новое сообщение будет создаваться новое событие,
// сообщение приходит в конструктор этого события и записывается в поле message

@Getter
public class newMessageEvent {
    private String message;

    public newMessageEvent(String message) {
        this.message = message;
    }
}
