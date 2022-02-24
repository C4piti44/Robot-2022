package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Joystick;

public class ShootingSubsystem extends SubsystemBase{
    private WPI_TalonSRX shootingMotor;
    
    public ShootingSubsystem(){
        this.shootingMotor = new WPI_TalonSRX(7);
    }
    public void shoot(double power){
        this.shootingMotor.set(ControlMode.PercentOutput, power);
    }
    public void yshoot(Joystick stick){
        if(-stick.getY() < 0.9 && -stick.getY() > 0)
            this.shootingMotor.set(ControlMode.PercentOutput, -stick.getY());
        else if(-stick.getY() >= 0.9)
            this.shootingMotor.set(ControlMode.PercentOutput, 0.9);
    } 
    public void stop(){
        this.shootingMotor.set(ControlMode.PercentOutput,0);
    }
}
