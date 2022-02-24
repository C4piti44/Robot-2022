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
        this.MotorRightFront =new WPI_TalonSRX(4);
        this.MotorRightRear = new WPI_TalonSRX(5);
        this.SPD_Right = new SpeedControllerGroup(this.MotorRightFront, this.MotorRightRear);
        this.MotorLeftFront = new WPI_TalonSRX(7);
        this.MotorLeftRear = new WPI_TalonSRX(6);
        this.SPD_Left = new SpeedControllerGroup(this.MotorLeftFront, this.MotorLeftRear);
        this.diff = new DifferentialDrive(this.SPD_Left, this.SPD_Right);
    
    }

    public void ArcadeDrive(double stickY, double stickX){
        this.diff.arcadeDrive(stickY*0.9, stickX*0.9);
        this.diff.feedWatchdog();
    }
    public void TankDrive(double stick1, double stick2){
        double tank1=0,tank2=0;
        if(stick1 < 0.5 && stick1 > -0.5 && stick2 < 0.5 && stick2 > -0.5){
            tank1= stick1;
            tank2 = stick2;
        } else if(stick1 >= 0.5)
            tank1 = 0.5;
        else if(stick1 <= -0.5)
            tank1 = -0.5;
        else if(stick2 >= 0.5)
            tank2 = 0.5;
        else if(stick2 <= -0.5)
            tank2 = -0.5;
        //this.diff.tankDrive(tank1, tank2);
    }
    public void spin(double power){
        this.diff.tankDrive(power, -power);
    }
    public void StopDrive(){
        this.diff.arcadeDrive(0, 0);
    }
    public void GoForward(double speed) {
        this.diff.tankDrive(speed, speed);
    }
    public void GoBackward(double speed) {
        this.diff.tankDrive(-speed, -speed);
    }
}
