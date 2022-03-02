package frc.robot.commands;

import static frc.robot.Robot.m_robotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDriveCommand extends CommandBase{
    @Override
    public void initialize() {
        addRequirements(m_robotContainer.getDriverSubsystem());//adding the getter for the DriverSubsystem
        m_robotContainer.getDriverSubsystem().feed();//giving more data for the watch dog
    }
    @Override
    public void execute() {
        m_robotContainer.getDriverSubsystem().feed();//giving data for the watch dog
        /*calling the arcadeDrive function*/m_robotContainer.getDriverSubsystem().ArcadeDrive(/*setting limitations to the max input for each access of the joystick*/(m_robotContainer.getStick().getY()/1.2)*0.9, (m_robotContainer.getStick().getX()/1.2)*0.9);
    }
    @Override
    public void end(boolean interrupted) {
        m_robotContainer.getDriverSubsystem().feed();//giving more data for the watch dog
        m_robotContainer.getDriverSubsystem().StopDrive();//calling the stop function to stop the movement of the robot.
    }
}
