package org.example;

public class Car {

    int currentMileage;

    int oilChangedMileage;
    boolean requireOilChange;

    int breakTmp;

    boolean lightSwitch;

    boolean modeEco;
    boolean modeSport;
    boolean modeComfort;

    public boolean isModeEco() {
        return modeEco;
    }

    public boolean isModeSport() {
        return modeSport;
    }

    public boolean isModeComfort() {
        return modeComfort;
    }

    public boolean isLightSwitch() {
        return lightSwitch;
    }

    public Car(int currentMileage, int oilChangedMileage, boolean requireOilChange, int breakTmp, boolean lightSwitch) {
        this.currentMileage = currentMileage;
        this.oilChangedMileage = oilChangedMileage;
        this.requireOilChange = false;
        this.breakTmp = breakTmp;
        this.lightSwitch = false;
        this.modeEco = true;
        this.modeSport = false;
        this.modeComfort =false;
    }

    public boolean checkMileage() {
        if (currentMileage - oilChangedMileage > 6000) {
            requireOilChange = true;
        }
        return requireOilChange;
    }

    public String checkBreakTmp() {
        if (breakTmp > 430) {
            return "Overheated";
        } else if (breakTmp > 150 && breakTmp < 429) {
            return "Be attentive";
        }
        return "OK";
    }

    public void lightSwitch (){
        if(!lightSwitch){
           lightSwitch = true;
        }

    }


    public void changeMode(String mode){
        if(mode.equals("Eco")){
            modeComfort = false;
            modeSport = false;
            modeEco = true;
        }else if(mode.equals("Sport")){
            modeComfort = false;
            modeSport = true;
            modeEco = false;
        }else if(mode.equals("Comfort")){
            modeComfort = true;
            modeSport = false;
            modeEco = false;
        }else{
            modeComfort = false;
            modeSport = false;
            modeEco = true;
        }

    }
}
