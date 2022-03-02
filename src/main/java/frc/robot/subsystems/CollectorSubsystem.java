package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj.DigitalInput;

public class CollectorSubsystem extends SubsystemBase {
    private WPI_TalonSRX theOpener;//creating a talon motor object
//    private WPI_TalonSRX theRoller;//all of lines 10-12 and lines 14,15 and 17 were for a function that was scrapped because of a misunderstanding.
//    private DigitalInput isDown;
//    private DigitalInput isUp;
    public CollectorSubsystem(){
//        this.isDown = new DigitalInput(0);
//        this.isUp = new DigitalInput(1);
        this.theOpener = new WPI_TalonSRX(1); //giving said motor a value
//        this.theRoller = new WPI_TalonSRX(2);
        
    }
    public void Collect(){
            this.theOpener.set(ControlMode.PercentOutput , 0.3);//making the motor activate at 30% power.
    }
    public void stop(){
        this.theOpener.set(ControlMode.PercentOutput, 0);//making the motor stop.
    }
}
