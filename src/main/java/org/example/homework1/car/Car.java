package org.example.homework1.car;

import com.google.gson.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class Car {
        private String brand;
        private String model;
        private String color;
        private Maxspeed maxspeed;
        private Engine engine;
        private int seatingCapacity;
        public static final Gson GSON=new GsonBuilder().setPrettyPrinting().create();

    public Car() {
    }

    public Maxspeed getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(Maxspeed maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxspeed=" + maxspeed +
                ", engine=" + engine +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }

    public void toMakeJson() throws IOException {
        String str=GSON.toJson(this);
        System.out.println(str);

        String fileName="D:/java course/Java advance/1 lesson/car.json";
        File file=new File(fileName);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            RandomAccessFile afile=new RandomAccessFile(file, "rw");
            afile.writeBytes(str);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }



    }

    public static void main(String[] args) throws IOException {
        Car car=new Car();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setColor("Red");
        Maxspeed maxspeed=new Maxspeed();
        maxspeed.setUnit("km/h");
        maxspeed.setValue(220);
        car.setMaxspeed(maxspeed);
        Engine engine=new Engine();
        engine.setVolume(2.5);
        engine.setRpm(6600);
        engine.setCompressionRatio("11.8:1");
        car.setEngine(engine);
        car.toMakeJson();

    }
}
