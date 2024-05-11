package com.jaewon.javascheduler.event;

import java.time.ZonedDateTime;

public class OutOfOffice extends AbstractEvent{

    public OutOfOffice(int id, String title, ZonedDateTime createdAt, ZonedDateTime endAt) {
        super(id, title, createdAt, endAt);

    }

    @Override
    public void print() {

    }

    @Override
    public boolean support(EventType type) {
        return type == EventType.OUT_OF_OFFICE;
    }
}
