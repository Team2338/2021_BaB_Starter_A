package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.NeoShooter;

public class RunNeoShooterVoltage extends CommandBase {

    // TSBaB: calling to set voltage to 2.5
    @Override
    public void execute() {
        NeoShooter.getInstance().setVoltage(2.5);
    }
}
