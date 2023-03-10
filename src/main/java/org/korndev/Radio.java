package org.korndev;

public class Radio {

    public int currentRadiostation;
    public int currentVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation < 0) {
            return;
        }
        if (currentRadiostation > 9) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void nextRadiostation(int newCurrentRadiostation) {    //Следующая радиостанция
        if (newCurrentRadiostation != 9) {
            newCurrentRadiostation = newCurrentRadiostation + 1;
        } else newCurrentRadiostation = 0;

        currentRadiostation = newCurrentRadiostation;
    }

    public void prevRadiostation(int newCurrentRadiostation) {    //Предыдущая радиостанция
        if (newCurrentRadiostation != 0) {
            newCurrentRadiostation = newCurrentRadiostation - 1;
            ;
        } else newCurrentRadiostation = 9;

        currentRadiostation = newCurrentRadiostation;
    }

    public void upVolume(int newCurrentVolume) {
        if (newCurrentVolume != 100) {
            newCurrentVolume = newCurrentVolume + 1;
        } else newCurrentVolume = 100;

        currentVolume = newCurrentVolume;
    }

    public void downVolume(int newCurrentVolume) {
        if (newCurrentVolume != 0) {
            newCurrentVolume = newCurrentVolume - 1;
        } else newCurrentVolume = 0;

        currentVolume = newCurrentVolume;
    }
}



