package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetRequiredStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextCurrentStation();
        int expected = 7;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevCurrentStation();
        int expected = 4;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextCurrentStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextCurrentStationIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        radio.nextCurrentStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevCurrentStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevCurrentStationIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevCurrentStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        int expected = 6;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.increaseCurrentVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseCurrentVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }
}
