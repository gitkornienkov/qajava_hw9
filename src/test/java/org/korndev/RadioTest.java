package org.korndev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RadioTest {

    /*


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
    }*/

    @ParameterizedTest
    @CsvSource({
            "30,29",
            "10,9",
            "50,49"
    })
    public void countRadiostationTest(int actual, int expected) {
        Radio radio = new Radio(actual);

        Assertions.assertEquals(expected, radio.getMaxNumberRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "49,0,50", //"текущая радиостанция, ожидаемая радиостанция, количество радиостанций"
            "30,31,50",
            "9,10,50",
            "9,0,10"
    })
    public void nextRadionstationTest(int actual, int expected, int radioch) {
        Radio radio = new Radio(radioch);

        radio.setCurrentRadiostation(actual);
        radio.nextRadiostation();

        Assertions.assertEquals(expected, radio.getCurrentRadiostation());
    }

    @ParameterizedTest
    @CsvSource({
            "50,49,50", //"текущая радиостанция, ожидаемая радиостанция, количество радиостанций"
            "31,30,50",
            "0,49,50",
            "9,8,10"
    })
    public void prevRadionstationTest(int actual, int expected, int radioch) {
        Radio radio = new Radio(radioch);

        radio.setCurrentRadiostation(actual);
        radio.prevRadiostation();

        Assertions.assertEquals(expected, radio.getCurrentRadiostation());
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
}