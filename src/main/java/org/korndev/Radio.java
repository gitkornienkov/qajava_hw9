package org.korndev;

public class Radio {

    private int currentRadiostation;
    private int currentVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
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

    public void nextRadiostation() {    //Следующая радиостанция
        if (currentRadiostation != 9) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = 0;
        }

        this.currentRadiostation = currentRadiostation;
    }

    public void prevRadiostation() {    //Предыдущая радиостанция
        if (currentRadiostation != 0) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = 9;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void upVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void downVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}



