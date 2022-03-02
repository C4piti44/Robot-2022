package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import static frc.robot.Robot.m_robotContainer;

public class AutonomousCommand extends CommandBase {
    private long startTime;//adding a variable that will keep the time of starting the functions
    @Override
    public void initialize(){
        this.startTime = System.currentTimeMillis();
        addRequirements(m_robotContainer.getDriverSubsystem(),m_robotContainer.getShootingSubsytem());
    }
    @Override
    public void execute(){
        if((System.currentTimeMillis() - this.startTime) <= 1000)//this checks if a seconds passed by.
        {
            m_robotContainer.getDriverSubsystem().TankDrive(0.5, 0.5);//this makes the robot go forward in half the power of the motors while the if statement is true
        } 
        else if(System.currentTimeMillis() - this.startTime > 1000 && System.currentTimeMillis()-this.startTime <= 2500)//this checks if the time of statrting is bigger then 1 seconds and smaller then 2.5 seconds
        {
            m_robotContainer.getShootingSubsytem().shoot(0.5);//this will make the robot shoot the ball in it at half the power of the motors while the if statment is true.
        }
        else
        {
            this.startTime = System.currentTimeMillis();//this will update the start time when the other if statments are false
            end(true);//this will end the execut function after 2.5 seconds
        }
    }
    @Override
    public void end(boolean interrupted)
    {
        System.out.println("I Died!");//this prints "I Died!" when the autonomousCommand ends.
    }
}
