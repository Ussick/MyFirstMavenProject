package org.example.homework1.car;

public class Engine {
    private double volume;
    private int rpm;
    private String compressionRatio;

    public Engine() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(String compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", rpm=" + rpm +
                ", compressionRatio='" + compressionRatio + '\'' +
                '}';
    }
}
