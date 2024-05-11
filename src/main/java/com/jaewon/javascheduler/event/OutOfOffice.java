package com.jaewon.javascheduler.event;

import com.jaewon.javascheduler.event.update.AbstractAuditableEvent;

import java.time.ZonedDateTime;

public class OutOfOffice extends AbstractEvent{

    public OutOfOffice(int id, String title, ZonedDateTime createdAt, ZonedDateTime endAt) {
        super(id, title, createdAt, endAt);

    }

    @Override
    protected void update(AbstractAuditableEvent update) {

    }

    @Override
    public void print() {

    }

    @Override
    public boolean support(EventType type) {
        return type == EventType.OUT_OF_OFFICE;
    }
}
