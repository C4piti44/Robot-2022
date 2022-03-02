package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ShootingSubsystem extends SubsystemBase{
    private WPI_TalonSRX shootingMotor;//creatinga talon motor object
    
    public ShootingSubsystem(){
        this.shootingMotor = new WPI_TalonSRX(1);//giving said object a value.
    }
    public void shoot(double power){
        this.shootingMotor.set(ControlMode.PercentOutput, power);//making the motor spin at percentage giving to it in the ShootingCommand
    }
    /* public void yshoot(Joystick stick){//this function was for a testing the power that will be used for the shooting, bye using the values of the Y access in the joystick.  
                0-----0    y
   Joystick  -> | (O) |   / \
                0-----0    |
                          \ /
                           -y
                
    //         this.shootingMotor.set(ControlMode.PercentOutput, stick.getY()*0.9);
     }*/ 
    public void stop(){
        this.shootingMotor.set(ControlMode.PercentOutput,0);//making the motor stop spinning.
    }
}
