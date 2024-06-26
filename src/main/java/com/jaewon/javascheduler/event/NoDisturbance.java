package com.jaewon.javascheduler.event;

import com.jaewon.javascheduler.event.update.AbstractAuditableEvent;

import java.time.ZonedDateTime;

public class NoDisturbance extends AbstractEvent{

    public NoDisturbance(int id, String title, ZonedDateTime createdAt, ZonedDateTime endAt) {
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
        return type == EventType.NO_DISTURBANCE;
    }
}
