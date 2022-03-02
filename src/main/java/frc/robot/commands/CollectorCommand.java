package frc.robot.commands;

import static frc.robot.Robot.m_robotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CollectorCommand extends CommandBase {
    public void initialize() {
        addRequirements(m_robotContainer.getCollectorSubsystem());//adding the getter for the collector subsystem
    }
    @Override
    public void execute() {
        m_robotContainer.getCollectorSubsystem().Collect();//using the collect function
    }
    @Override
    public void end(boolean interrupted) {
        m_robotContainer.getCollectorSubsystem().stop();//using the stop function which as its name proposers it stop's the collecting
    }
}
