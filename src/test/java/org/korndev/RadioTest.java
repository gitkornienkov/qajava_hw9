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
    void nextRadionstationTest(int newRadiostation, int expected) {
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
    void prevRadionstationTest(int newRadiostation, int expected) {
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
    void setCurrentRadiostation(int newRadiostation, int expected) {
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
    void upVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.upVolume(volume);

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
    void downVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.downVolume(volume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}