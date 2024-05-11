package com.jaewon.javascheduler.event;

public interface Event {

    void print();

    boolean support(EventType type);

}
