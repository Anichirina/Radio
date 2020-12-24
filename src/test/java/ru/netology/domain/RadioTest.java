package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {



    @Test
    void shouldSwitchCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.switchCurrentVolume();
        assertEquals(10,radio.getCurrentVolume());
    }
    @Test
    void shouldSwitchCurrentVolumeMin() {
        Radio radio =new Radio();
        radio.setCurrentVolume(0);
        radio.switchCurrentVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    void shouldSwitchCurrentVolumeDownMin() {
        Radio radio =new Radio();
        radio.setCurrentVolume(-1);
        radio.switchCurrentVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    void shouldSwitchCurrentVolumeUpMax() {
        Radio radio =new Radio();
        radio.setCurrentVolume(11);
        radio.switchCurrentVolume();
        assertEquals(10,radio.getCurrentVolume());
    }



    @Test
    void shouldSwitchCurrentChannelMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.switcCurrentChannel();
        assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    void shouldSwitchCurrentChannelMin() {
        Radio radio =new Radio();
        radio.setCurrentChannel(0);
        radio.switcCurrentChannel();
        assertEquals(0,radio.getCurrentChannel());
    }
    @Test
    void shouldSwitchCurrentChannelDownMin() {
        Radio radio =new Radio();
        radio.setCurrentChannel(-1);
        radio.switcCurrentChannel();
        assertEquals(9,radio.getCurrentChannel());
    }
    @Test
    void shouldSwitchCurrentChannelUpMax() {
        Radio radio =new Radio();
        radio.setCurrentChannel(11);
        radio.switcCurrentChannel();
        assertEquals(0,radio.getCurrentChannel());
    }

    @Test
    void prewCurrentChannel() {
        Radio radio =new Radio();
        radio.setCurrentChannel(5);
        radio.switcCurrentChannel();
        assertEquals(6,radio.getCurrentChannel());
    }


    @Test
    void prewCurrentVolume() {
        Radio radio =new Radio();
        radio.setCurrentVolume(5);
        radio.switchCurrentVolume();
        assertEquals(6,radio.getCurrentVolume());
    }



    @Test
    void setMaxVolume() {
        Radio radio =new Radio();
        assertEquals(10,radio.getMaxVolume());

    }

    @Test
    void setMinVolume() {
        Radio radio =new Radio();
        assertEquals(0,radio.getMinVolume());
    }

    @Test
    void setMaxChannel() {
        Radio radio =new Radio();
        assertEquals(9,radio.getMaxChannel());
    }

    @Test
    void setMinChannel() {
        Radio radio =new Radio();
        assertEquals(0,radio.getMinChannel());

    }
}
