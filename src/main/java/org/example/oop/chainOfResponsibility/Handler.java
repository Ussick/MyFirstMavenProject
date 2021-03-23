package org.example.oop.chainOfResponsibility;

public interface Handler {
    void handle(Event event);

    void setNextHandler(Handler nextHandler);
}
