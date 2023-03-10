package ru.netology.homeworks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {
    Radio radio = new Radio(10);
    @Test
    public  void testShouldSetRadNumByDefault () {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.getMaxRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldSetCurrentStationMax () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(9);

        int expected = 9;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldSetCurrentStationNewMax20 () {
        Radio radio = new Radio(20);

        radio.setCurrentRadNum(15);

        int expected = 15;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    void shouldChangeStation() {
        Assertions.assertEquals(0, radio.getCurrentRadNum());
        radio.setCurrentRadNum(5);
        Assertions.assertEquals(5, radio.getCurrentRadNum());
    }
    @Test
    public  void testShouldSetCurrentStationBoundaryValuesMaxOne () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(8);

        int expected = 8;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldSetCurrentStationInMiddle () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(5);

        int expected = 5;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldSetCurrentStationMin () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(0);

        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldSetCurrentStationBoundaryValuesMinOne () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(1);

        int expected = 1;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldNotSetCurrentStationOverMax () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(11);

        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldNotSetCurrentStationLowerMin () {
        Radio radio = new Radio();

        radio.setCurrentRadNum(-1);

        int expected = 0;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
    }
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

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldSetRadioPrevFromEight(){
        radio.setCurrentRadNum(0);
        radio.setCurrentRadNum(8);
        radio.prevRadNum();
        int expected = 7;
        int actual = radio.getCurrentRadNum();

        Assertions.assertEquals(expected,actual);
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
    public void testShouldNotIncreaseVolumeFromMax(){
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldDecreaseVolumeFromMax(){
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldDecreaseVolumeFromMaxBoundaryValueOne(){
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldNotDecreaseVolumeFromMin(){
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldIncreaseVolumeInMiddle(){
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldDecreaseVolumeInMiddle(){
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testShouldNotSetVolumeOverMax(){
        radio.setCurrentVolume(101);
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
    @Test
    public  void testShouldGetMinRadNum () {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getMinRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldGetMaxRadNum () {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.getMaxRadNum();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldGetMinVolume () {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void testShouldGetMaxVolume () {
        Radio radio = new Radio();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected,actual);
    }

}