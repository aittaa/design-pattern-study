package state.celingfanpullchain;

public class LowSpeedState implements State{

    CeilingFan ceilingFan;

    public LowSpeedState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void pull() {
        System.out.println("   medium speed");
        ceilingFan.setCurrentState(ceilingFan.getMediumSpeed());
    }
}
