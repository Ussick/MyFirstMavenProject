package org.example.oop.chainOfResponsibility;

public class ConsoleHandler implements Handler{
    private String type="console";
    private Handler nextHandler;

    @Override
    public void handle(Event event) {
        if (type.equals(event.getType())){
            System.out.println(type+": "+event.getEvent());
        }
        if (nextHandler!=null){
            nextHandler.handle(event);
        }

    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
