package ru.netology.domain;

public class Radio {
    private String name;
    private int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxSoundVolume;
    private int minSoundVolume;
    private int currentSoundVolume;
    private boolean on;

    public Radio(int maxRadioStation, int minRadioStation, int currentRadioStation, int maxSoundVolume, int minSoundVolume, int currentSoundVolume) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.currentSoundVolume = currentSoundVolume;
    }

    public Radio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void pressNextStation() {

        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);

        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {

        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);

        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void pressPlusSoundVolume() {

        setCurrentSoundVolume(currentSoundVolume + 1);
    }

    public void pressMinusSoundVolume() {

        setCurrentSoundVolume(currentSoundVolume - 1);
    }
}
