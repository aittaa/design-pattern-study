package state.celingfanpullchain;

public class HighSpeedState implements State {

    CeilingFan ceilingFan;

    public HighSpeedState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void pull() {
        System.out.println("   turning off");
        ceilingFan.setCurrentState(ceilingFan.getTurningOff());
    }
}
