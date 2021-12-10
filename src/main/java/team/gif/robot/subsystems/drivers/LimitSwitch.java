package team.gif.robot.subsystems.drivers;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;
import team.gif.robot.RobotMap;

public class LimitSwitch implements Subsystem {

    public static LimitSwitch instance = null;

    public static LimitSwitch getInstance()
    {
        if(instance == null)
        {
            instance = new LimitSwitch();
        }
        return instance;
    }

    private DigitalInput _limitswitch = new DigitalInput(RobotMap.DEVICE_ID);

    public boolean getLimitState()
    {
        return !_limitswitch.get();
    }
}
