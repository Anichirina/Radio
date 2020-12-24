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

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

             this.currentVolume = currentVolume;
    }


    public void switchCurrentVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minChannel) {
            this.currentVolume = minVolume;
            return;
        }
         currentVolume++;
        return;
        }

    public int getCurrentChannel() {
        return currentChannel;
    }


    public void setCurrentChannel(int currentChannel) {

             this.currentChannel = currentChannel;
    }

    public void switcCurrentChannel() {
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
            return;

        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
         if (currentChannel == maxChannel) {
             this.currentChannel=maxChannel;
             return;
         }
         if(currentChannel==minChannel){
             this.currentChannel=minChannel;
             return;
         }
         currentChannel++;
         return;

    }


}
