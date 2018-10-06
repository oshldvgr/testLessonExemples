package ru.shadrina.chat.testEvent;

import lombok.Getter;

//событие, которое выполняется асинхронно=параллельно=в отдельном потоке=последовательность не важна
@Getter
public class AsyncEvent {
    private String name;

    AsyncEvent(String name) {
        this.name = name;
    }

}
