package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();


    @Test
    public void validateChangeFields() {
        Radio radio = new Radio(10, 0, 5, 100, 0, 5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void changeOverLastRadioStation() {
        Radio radio = new Radio(10, 0, 10, 100, 0, 5);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        Radio radio = new Radio(10, 0, 0, 100, 0, 5);
        radio.pressPrevStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio(10, 0, 5, 100, 0, 5);
        radio.pressNextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio(10, 0, 5, 100, 0, 5);
        radio.pressPrevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void OverInitialRadioStation() {
        Radio radio = new Radio(10, 0, 11, 100, 0, 5);
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void UnderInitialRadioStation() {
        Radio radio = new Radio(10, 0, -1, 100, 0, 5);
        radio.getMinRadioStation();
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio(10, 0, 3, 100, 0, 101);
        radio.getMaxSoundVolume();
        assertEquals(100, radio.getMaxSoundVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio(10, 0, 3, 100, 0, -1);
        radio.getMinSoundVolume();
        assertEquals(0, radio.getMinSoundVolume());

    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio(10, 0, 3, 100, 0, 4);
        radio.pressPlusSoundVolume();
        assertEquals(5, radio.getCurrentSoundVolume());
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio(10, 0, 3, 100, 0, 5);
        radio.pressMinusSoundVolume();
        assertEquals(4, radio.getCurrentSoundVolume());
    }
}
