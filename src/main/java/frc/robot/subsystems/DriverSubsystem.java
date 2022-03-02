package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DriverSubsystem extends SubsystemBase {
    
    private WPI_TalonSRX MotorRightFront , MotorRightRear;
    private SpeedControllerGroup SPD_Right;
    private WPI_TalonSRX MotorLeftFront , MotorLeftRear;
    private SpeedControllerGroup SPD_Left;
    private DifferentialDrive diff;

    public DriverSubsystem(){
        //define the motors ports
        this.MotorRightFront =new WPI_TalonSRX(7/*port number*/);
        this.MotorRightRear = new WPI_TalonSRX(6/*port number*//*port number*/);
        this.SPD_Right = new SpeedControllerGroup(this.MotorRightFront, this.MotorRightRear);
        
        this.MotorLeftFront = new WPI_TalonSRX(5/*port number*/);
        this.MotorLeftRear = new WPI_TalonSRX(4/*port number*/);
        this.SPD_Left = new SpeedControllerGroup(this.MotorLeftFront, this.MotorLeftRear);
        this.diff = new DifferentialDrive(this.SPD_Left, this.SPD_Right);
        //this.diff.setSafetyEnabled(false);
        
    }
    public void feed(){
        this.diff.feedWatchdog();
    }
    public void ArcadeDrive(double stickY, double stickX){
        this.diff.arcadeDrive(-stickY, stickX, true);
    }
    public void TankDrive(double stick1, double stick2){
        this.diff.tankDrive(stick1*0.9, stick2*0.9, true);
    }
    public void spin(double power){
        this.diff.tankDrive(power, -power, true);
    
    //turn off the motors
    public void StopDrive(){
        this.diff.arcadeDrive(0, 0, true);
    }
    //isn't it useless
    public void GoForward(double speed) {
        this.diff.tankDrive(speed, speed, true);
    }
}
