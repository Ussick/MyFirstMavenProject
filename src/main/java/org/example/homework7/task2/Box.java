package org.example.homework7.task2;

public class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }

    public static void main(String[] args) {
        Box<Bakery> box = new Box<>();
        Pie pie = new Pie(1);
        Cake cake = new Cake(1);
        box.put(cake);
        //box.put(pie1);
        System.out.println(box.get());
    }
}
