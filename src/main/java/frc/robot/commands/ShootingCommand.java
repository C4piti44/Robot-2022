package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.Robot.m_robotContainer;

public class ShootingCommand extends CommandBase {

    @Override
    public void initialize() {
        addRequirements(m_robotContainer.getShootingSubsytem());//adding the getter for the shooting subsystem
    }
    
    @Override
    public void execute() {
        m_robotContainer.getShootingSubsytem().shoot(0.9);//using the shoot function at 0.9 which put the shooting motor at 90% precent power
    }

    @Override
    public void end(boolean interrupted) {
        m_robotContainer.getShootingSubsytem().stop();//using the stop function wich stop the motor from spinning
    }
}
