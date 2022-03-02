package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ShootingSubsystem extends SubsystemBase{
    private WPI_TalonSRX shootingMotor;
    
    public ShootingSubsystem(){
        this.shootingMotor = new WPI_TalonSRX(1);
    }
    public void shoot(double power){
        this.shootingMotor.set(ControlMode.PercentOutput, power);
    }
    // public void yshoot(Joystick stick){
    //         this.shootingMotor.set(ControlMode.PercentOutput, stick.getY()*0.9);
    // } 
    public void stop(){
        this.shootingMotor.set(ControlMode.PercentOutput,0);
    }
}
