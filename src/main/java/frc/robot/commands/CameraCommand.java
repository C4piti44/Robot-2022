package frc.robot.commands;

import static frc.robot.Robot.m_robotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CameraCommand extends CommandBase{
    @Override
    public void initialize() {
        addRequirements(m_robotContainer.getCameraSubsystem());
    }
    @Override
    public void execute() {
    }
}