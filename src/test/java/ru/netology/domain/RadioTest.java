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
    void shouldSwitchCurrentVolumeAny() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        assertEquals(6, radio.getCurrentVolume());
    }


    @Test
    void shouldSwitchCurrentChannelMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
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
    void nextMaxCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(9, radio.getCurrentChannel());
    }
    @Test
    void nextMinCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());
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
    void nextCurrentMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void nextCurrentMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    void prewCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.prewChannel();
        assertEquals(4, radio.getCurrentChannel());

    }
    @Test
    void prewCurrentMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prewChannel();
        assertEquals(0, radio.getCurrentChannel());

    }
    @Test
    void prewCurrentUpChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(15);
        radio.prewChannel();
        assertEquals(0, radio.getCurrentChannel());

    }
    @Test
    void prewCurrentMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.prewChannel();
        assertEquals(8, radio.getCurrentChannel());

    }

    @Test
    void prewCurrentMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prewVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void prewCurrentMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.prewVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
    @Test
    void prewCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.prewVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    void prewDownCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.prewVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void prewUpCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(13);
        radio.prewVolume();
        assertEquals(9, radio.getCurrentVolume());
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
    //ломает тест
    @Test
    void prewWithMaxToEarlyChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.prewChannel();
        assertEquals(8, radio.getCurrentChannel());

    }
    //ломает тест
    @Test
    void prewWithMinToNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());

    }
    //ломает тест
    @Test
    void prewWithMinToNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        assertEquals(1, radio.getCurrentVolume());

    }
}
