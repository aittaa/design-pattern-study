package state.celingfanpullchain;

public class MediumSpeedState implements State{

    CeilingFan ceilingFan;

    public MediumSpeedState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void pull() {
        System.out.println("   high speed");
        ceilingFan.setCurrentState(ceilingFan.getHighSpeed());
    }
}
