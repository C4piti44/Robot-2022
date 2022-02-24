package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CollectorSubsystem extends SubsystemBase {
    private TalonSRX M_Motor;
    public CollectorSubsystem(){
        this.M_Motor = new TalonSRX(1);
    }
    public void Collect(){
        this.M_Motor.set(ControlMode.PercentOutput , 0.3);
    }
    public void stop (){
        this.M_Motor.set(ControlMode.PercentOutput, 0);
    }
}