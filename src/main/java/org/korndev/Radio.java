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

    public void nextRadiostation(int newCurrentRadiostation) {    //Следующая радиостанция
        if (newCurrentRadiostation != 9) {
            newCurrentRadiostation = newCurrentRadiostation + 1;
        } else {
            newCurrentRadiostation = 0;
        }

        currentRadiostation = newCurrentRadiostation;
    }

    public void prevRadiostation(int newCurrentRadiostation) {    //Предыдущая радиостанция
        if (newCurrentRadiostation != 0) {
            newCurrentRadiostation = newCurrentRadiostation - 1;
        } else {
            newCurrentRadiostation = 9;
        }

        currentRadiostation = newCurrentRadiostation;
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



