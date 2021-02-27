package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();


    @Test
    public void validateChangeFields() {
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void changeOverLastRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressNextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressPrevStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void OverInitialRadioStation() {
        radio.setCurrentRadioStation(11);
        radio.getMaxRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void UnderInitialRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.getMinRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeOverMax() {
        radio.setCurrentSoundVolume(11);
        radio.getMaxSoundVolume();
        assertEquals(10, radio.getMaxSoundVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentSoundVolume(-1);
        radio.getMinSoundVolume();
        assertEquals(0, radio.getMinSoundVolume());

    }

    @Test
    public void plusVolume() {
        radio.setCurrentSoundVolume(4);
        radio.pressPlusSoundVolume();
        assertEquals(5, radio.getCurrentSoundVolume());
    }

    @Test
    public void minusVolume() {
        radio.setCurrentSoundVolume(4);
        radio.pressMinusSoundVolume();
        assertEquals(3, radio.getCurrentSoundVolume());
    }
}