package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.Robot.m_robotContainer;

public class ShootingCommand extends CommandBase {

    @Override
    public void initialize() {
        addRequirements(m_robotContainer.getShootingSubsytem());
    }
    
    @Override
    public void execute() {
        m_robotContainer.getShootingSubsytem().shoot(0.9);
    }

    @Override
    public void end(boolean interrupted) {
        m_robotContainer.getShootingSubsytem().stop();        
    }
}
