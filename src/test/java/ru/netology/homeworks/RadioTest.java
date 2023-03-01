package ru.netology.homeworks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {
    Radio radio = new Radio();

    @Test
    public void testShouldSetRadioNumMinFromOne(){
        radio.setCurrentRadNum(1);
        radio.prevRadNum();
        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldSetRadioNumMinFromMax(){
        radio.setCurrentRadNum(9);
        radio.nextRadNum();
        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldSetRadioNumNextFromMin(){
        radio.setCurrentVolume(0);
        radio.nextRadNum();
        int expected = 1;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldSetRadioNumPrevFromMin(){
        radio.setCurrentRadNum(0);
        radio.prevRadNum();
        int expected = 9;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldSetRadioPrevFromMax(){
        radio.setCurrentRadNum(9);
        radio.prevRadNum();
        int expected = 8;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testShouldSetRadioPrevInMiddle(){
        radio.setCurrentRadNum(5);
        radio.prevRadNum();
        int expected = 4;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testShouldSetRadioNextInMiddle(){
        radio.setCurrentRadNum(5);
        radio.nextRadNum();
        int expected = 6;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldSetRadioNextFromOne(){
        radio.setCurrentRadNum(1);
        radio.nextRadNum();
        int expected = 2;
        int actual = radio.getCurrentRadNum();
    }
    @Test
    public void testShouldSetRadioPrevFromEight(){
        radio.setCurrentRadNum(8);
        radio.nextRadNum();
        int expected = 7;
        int actual = radio.getCurrentRadNum();
    }
    @Test
    public void testShouldNotSetRadioNumOverMax(){
        radio.setCurrentRadNum(10);
        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldNotSetRadioNumLowerMin(){
        radio.setCurrentRadNum(-1);
        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldIncreaseVolumeFromMin(){
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldIncreaseVolumeFromOne(){
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldIncreaseVolumeFromMax(){
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldDecreaseVolumeFromMax(){
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldDecreaseVolumeFromNine(){
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldDecreaseVolumeFromMin(){
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldIncreaseVolumeInMiddle(){
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldDecreaseVolumeInMiddle(){
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldNotSetVolumeOverMax(){
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldNotSetVolumeLowerMin(){
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

}