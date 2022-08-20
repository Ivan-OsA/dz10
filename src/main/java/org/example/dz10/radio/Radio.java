package org.example.dz10.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    private int stationAmount;

    public Radio() {
        stationAmount = 10;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationAmount - 1) {
            return;
        }
        this.currentStation = newCurrentStation;

    }

    public void next() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume - 1;
        }
    }
}
