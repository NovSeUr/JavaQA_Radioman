package ru.netology.homeworks;

public class Radio {
    private int minRadNum = 0;
    private int maxRadNum = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadNum = minRadNum;
    private int currentVolume = minVolume;

    public Radio (int stationsCount) {
        maxRadNum = stationsCount - 1;
    }

    public Radio () {
    }

    public int getMinRadNum() {
        return minRadNum;
    }
    public int getMaxRadNum() {
        return maxRadNum;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentRadNum(int currentRadNum) {
        if (currentRadNum < minRadNum || currentRadNum > maxRadNum) {
            return;
        }
        this.currentRadNum = currentRadNum;

    }

    public int getCurrentRadNum() {
        return currentRadNum;
    }

    public void nextRadNum() {
        if (currentRadNum >= maxRadNum) {
            setCurrentRadNum(minRadNum);
        } else {
            setCurrentRadNum(currentRadNum + 1);
        }
    }

    public void prevRadNum() {
        if (currentRadNum <= minRadNum) {
            setCurrentRadNum(maxRadNum);
        } else {
            setCurrentRadNum(currentRadNum - 1);
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}
