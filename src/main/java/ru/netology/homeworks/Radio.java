package ru.netology.homeworks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int minRadNum = 0;
    private int maxRadNum = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadNum;
    private int currentVolume;

    public Radio(int stationsCount) {
        maxRadNum = stationsCount - 1;
    }

    public void setCurrentRadNum(int currentRadNum) {
        if (currentRadNum < minRadNum || currentRadNum > maxRadNum) {
            return;
        }
        this.currentRadNum = currentRadNum;

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