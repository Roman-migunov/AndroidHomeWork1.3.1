package com.example.androidhomework131;

import android.icu.util.LocaleData;

public class UserMetrics {
    private String name;
    private int age, pulse, UpperPressure, lowPressure, step;
    private boolean tah;
    private double weight;
    private LocaleData date;

    public UserMetrics(String name, int age, int pulse, int upperPressure, int lowPressure, int step, boolean tah, double weight, LocaleData date) {
        this.name = name;
        this.age = age;
        this.pulse = pulse;
        UpperPressure = upperPressure;
        this.lowPressure = lowPressure;
        this.step = step;
        this.tah = tah;
        this.weight = weight;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getUpperPressure() {
        return UpperPressure;
    }

    public void setUpperPressure(int upperPressure) {
        UpperPressure = upperPressure;
    }

    public int getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(int lowPressure) {
        this.lowPressure = lowPressure;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public boolean isTah() {
        return tah;
    }

    public void setTah(boolean tah) {
        this.tah = tah;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocaleData getDate() {
        return date;
    }

    public void setDate(LocaleData date) {
        this.date = date;
    }
}
