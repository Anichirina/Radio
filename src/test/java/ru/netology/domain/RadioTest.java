package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    void shouldSwitchCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchCurrentVolumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchCurrentVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }


    @Test
    void shouldSwitchCurrentChannelMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchCurrentChannelMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSwitchCurrentChannelDownMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void shouldSwitchCurrentChannelUpMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(11);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void nextCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.nextChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    void nextUpCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(11);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void nextDownCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-2);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }


    @Test
    void nextCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    void nextCurrentUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void nextCurrentDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.nextVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void nextCurrentMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void prewCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.prewChannel();
        assertEquals(4, radio.getCurrentChannel());

    }
    @Test
    void prewCurrentDownChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.prewChannel();
        assertEquals(9, radio.getCurrentChannel());

    }
    @Test
    void prewCurrentUpChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(15);
        radio.prewChannel();
        assertEquals(9, radio.getCurrentChannel());

    }

    @Test
    void prewCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.prewVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
    @Test
    void prewCurrentMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prewVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setMaxVolume() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxVolume());

    }

    @Test
    void setMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setMaxChannel() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxChannel());
    }

    @Test
    void setMinChannel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinChannel());

    }
    @Test
    void PrewWithMaxToEarlyChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.prewChannel();
        assertEquals(8, radio.getCurrentChannel());

    }
    @Test
    void PrewWithMinToNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());

    }
    @Test
    void PrewWithMinToNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());

    }
}
