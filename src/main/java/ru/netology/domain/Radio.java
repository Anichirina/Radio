package ru.netology.domain;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume() {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        this.minVolume = minVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel() {
        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel() {
        this.minChannel = minChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        }
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }
    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel == maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel == minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }
    //переключение каналов вниз
    public void prewChannel() {
        if (currentChannel == minChannel) {
            this.currentChannel=maxChannel;
            return;
        }
        currentChannel--;
    }
    //переключение каналов вверх
    public void nextChannel() {
        if (currentChannel == maxChannel){
            this.currentChannel=minChannel;
            return;
        }
        currentChannel++;
    }
    //переключения звуков вниз
    public void prewVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume=minVolume;
            return;
        }
        currentVolume--;
    }
    //переключение звуков вверх
    public void nextVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume=maxVolume;
            return;
        }
        currentVolume++;
    }
}



