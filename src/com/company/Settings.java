package com.company;

public class Settings {
    public int durationTime;
    static Settings instance;

    private Settings(int durationTime) {
        this.durationTime = durationTime;
    }

    public static Settings getInstance(int a){
        if(instance == null){
            instance = new Settings(a);
        }
        return instance;
    }
}
