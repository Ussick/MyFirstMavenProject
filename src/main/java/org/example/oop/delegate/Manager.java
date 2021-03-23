package org.example.oop.delegate;

import java.util.List;

public class Manager {
    private final List<Worker> workers;

    public Manager(List<Worker> workers) {
        this.workers = workers;
    }

    public void work(){
        workers.forEach(Worker::work);
    }
}
