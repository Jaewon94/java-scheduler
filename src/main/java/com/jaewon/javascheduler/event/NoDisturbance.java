package com.jaewon.javascheduler.event;

import java.time.ZonedDateTime;

public class NoDisturbance extends AbstractEvent{

    public NoDisturbance(int id, String title, ZonedDateTime createdAt, ZonedDateTime endAt) {
        super(id, title, createdAt, endAt);

    }


    @Override
    public void print() {

    }
}
