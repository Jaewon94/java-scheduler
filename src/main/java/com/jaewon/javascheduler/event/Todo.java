package com.jaewon.javascheduler.event;

import java.time.ZonedDateTime;

public class Todo extends AbstractEvent {

    private String description;

    public Todo(int id, String title, ZonedDateTime createdAt, ZonedDateTime endAt, String description) {
        super(id, title, createdAt, endAt);
        this.description = description;

    }


    @Override
    public void print() {
        System.out.println(String.format("[할 일] %s : %s",getTitle(), description));
    }

    @Override
    public boolean support(EventType type) {
        return type == EventType.TODO;
    }
}
