package frc.robot.commands;

import static frc.robot.Robot.m_robotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class GoBackwardCommand extends CommandBase{
    @Override
    public void initialize() {
        addRequirements(m_robotContainer.getDriverSubsystem());
    }
    @Override
    public void execute() {
        m_robotContainer.getDriverSubsystem().GoBackward(0.1);
    }
    @Override
    public void end(boolean interrupted) {
        m_robotContainer.getDriverSubsystem().StopDrive();
    }
}