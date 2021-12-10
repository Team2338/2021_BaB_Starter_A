package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANPIDController;

public class NeoShooter extends SubsystemBase {
    private static NeoShooter instance = null;

    // T.SBab Creating a getInstance for renNeoShooterVoltage.java
    public static NeoShooter getInstance() {
        if (instance == null) {
            instance = new NeoShooter();
        }
        return instance;
    }

    // T.SBab
    private static final CANSparkMax shooterMotor = new CANSparkMax(RobotMap.MOTOR_SPARKMAX_ONE, CANSparkMaxLowLevel.MotorType.kBrushless);
    private static final CANPIDController shooterPIDController = shooterMotor.getPIDController();

    // T.SBab public the setVoltage
    public void setVoltage(double voltage) {
        shooterMotor.setVoltage(voltage);
    }

    // T.SBab
    private NeoShooter(){
        super();
        shooterMotor.restoreFactoryDefaults();
        shooterMotor.enableVoltageCompensation(12);
        //shooterMotor.setInverted(true); // C:false P:true
        shooterMotor.setIdleMode(CANSparkMax.IdleMode.kCoast);
        shooterMotor.setSmartCurrentLimit(40,40);
        shooterMotor.burnFlash();
    }
}
