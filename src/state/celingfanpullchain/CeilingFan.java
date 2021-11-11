package state.celingfanpullchain;

import java.rmi.StubNotFoundException;

class CeilingFan {

    private State currentState;

    private State lowSpeed;
    private State mediumSpeed;
    private State highSpeed;
    private State turningOff;


    public CeilingFan() {
        lowSpeed = new LowSpeedState(this);
        mediumSpeed = new MediumSpeedState(this);
        highSpeed = new HighSpeedState(this);
        //turningOff = new TurnOffState(this);
        currentState = turningOff;
    }

    public void pull() {
        currentState.pull();
    }


    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getLowSpeed() {
        return lowSpeed;
    }

    public State getMediumSpeed() {
        return mediumSpeed;
    }

    public State getHighSpeed() {
        return highSpeed;
    }

    public State getTurningOff() {
        return turningOff;
    }
}