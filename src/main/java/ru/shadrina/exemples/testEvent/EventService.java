package ru.shadrina.exemples.testEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class EventService {
    @Inject
    private Event<AsyncEvent> asyncEvent;

    @Inject
    private Event<SyncEvent> syncEvent;

    public void run() {
        asyncEvent.fireAsync(new AsyncEvent("Hello"));
        syncEvent.fire(new SyncEvent());

    }


}
