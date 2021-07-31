package ua.lov.letscodestreamapi.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Event {
    private UUID id;
    private LocalDateTime timeTag;
    private String description;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", timeTag=" + timeTag +
                ", description='" + description + '\'' +
                '}';
    }

    public Event(UUID id, LocalDateTime timeTag, String description) {
        this.id = id;
        this.timeTag = timeTag;
        this.description = description;


    }
}
