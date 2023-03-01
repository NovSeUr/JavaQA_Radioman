package ru.netology.homeworks;

public class Radio {
    private int currentRadNum;
    private int currentVolume;

/*
   private int minRadNum = 0;
    private int maxRadNum = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
*/


    public int getCurrentRadNum() {
        return currentRadNum;
    }

    public void setCurrentRadNum(int currentRadNum) {
        if (currentRadNum < 0 || currentRadNum > 9) {
            return;
        }
        this.currentRadNum = currentRadNum;

    }

    public void nextRadNum() {
        if (currentRadNum >= 9) {
            setCurrentRadNum(0);
        } else {
            setCurrentRadNum(currentRadNum + 1);
        }
    }

    public void prevRadNum() {
        if (currentRadNum <= 0) {
            setCurrentRadNum(9);
        } else {
            setCurrentRadNum(currentRadNum - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
