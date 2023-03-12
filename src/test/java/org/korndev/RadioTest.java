package org.korndev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "8,9",
            "9,0"
    })
    public void nextRadionstationTest(int newRadiostation, int expected) {
        Radio radio = new Radio();

        radio.nextRadiostation(newRadiostation);

        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,8",
            "8,7",
            "1,0",
            "0,9"
    })
    public void prevRadionstationTest(int newRadiostation, int expected) {
        Radio radio = new Radio();

        radio.prevRadiostation(newRadiostation);

        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "5,5",
            "9,9",
            "10,0"
    })
    public void setCurrentRadiostationTest(int newRadiostation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(newRadiostation);

        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "99,100",
            "100,100"
    })
    public void upVolumeTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.upVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvSource({
            "100,99",
            "99,98",
            "1,0",
            "0,0"
    })
    public void downVolumeTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.downVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "100,100",
            "101,0"
    })
    public void setCurrentVolumeTest(int volume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(volume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}