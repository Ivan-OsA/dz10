package org.example.dz10.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testNext1(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext2(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNext3(){
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext4(){
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext5(){
    Radio radio = new Radio();
    radio.setCurrentStation(9);
    radio.next();

    int expected = 0;
    int actual = radio.getCurrentStation();

    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext6(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.next();

        int expected =11;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrev(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev1(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();;

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testPrev3(){
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}