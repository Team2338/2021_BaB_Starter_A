package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NeoShooter extends SubsystemBase {
    private static NeoShooter instance = null;
    private NeoShooter shooterMotor;

    // T.SBab Creating a getInstance for renNeoShooterVoltage.java
    public static NeoShooter getInstance() {
        if (instance == null) {
            instance = new NeoShooter();
        }
        return instance;
    }

    // T.SBab public the setVoltage
    public void setVoltage(double voltage) {
        shooterMotor.setVoltage(voltage);
    }
}
