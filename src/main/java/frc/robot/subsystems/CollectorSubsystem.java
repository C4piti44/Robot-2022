package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj.DigitalInput;

public class CollectorSubsystem extends SubsystemBase {
    private WPI_TalonSRX theOpener;
//    private WPI_TalonSRX theRoller;
//    private DigitalInput isDown;
//    private DigitalInput isUp;
    public CollectorSubsystem(){
//        this.isDown = new DigitalInput(0);
//        this.isUp = new DigitalInput(1);
        this.theOpener = new WPI_TalonSRX(1);
//        this.theRoller = new WPI_TalonSRX(2);
        
    }
    public void Collect(){
            this.theOpener.set(ControlMode.PercentOutput , 0.3);
    }
    public void stop(){
        this.theOpener.set(ControlMode.PercentOutput, 0);
    }
}