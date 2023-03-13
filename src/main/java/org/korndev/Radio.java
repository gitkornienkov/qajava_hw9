package org.korndev;

public class Radio {

    private int maxNumberRadiostation = 9;
    private int currentRadiostation = 0;
    private int currentVolume;

    public Radio (int maxNumberRadiostation) {
        this.maxNumberRadiostation = maxNumberRadiostation - 1;
    }

    public Radio (){
        maxNumberRadiostation = 9;
    }

    public int getMaxNumberRadiostation() {
        return maxNumberRadiostation;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }


    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation < 0) {
            return;
        }
        if (currentRadiostation > maxNumberRadiostation) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void nextRadiostation() {
        if (currentRadiostation != maxNumberRadiostation) {
            currentRadiostation = currentRadiostation + 1;
        } else {
            currentRadiostation = 0;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void prevRadiostation() {
        if (currentRadiostation != 0) {
            currentRadiostation = currentRadiostation - 1;
        } else {
            currentRadiostation = maxNumberRadiostation;
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



