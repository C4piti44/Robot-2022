// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ArcadeDriveCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ShootingCommand;
import frc.robot.subsystems.CameraSubsystem;
import frc.robot.subsystems.CollectorSubsystem;
import frc.robot.subsystems.DriverSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.commands.CollectorCommand;
import frc.robot.subsystems.ShootingSubsystem;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  
  private final ShootingSubsystem shootingSubsystem =  new ShootingSubsystem();
  private ShootingCommand shootingCommand;
  
  private final CollectorSubsystem collectorSubsystem = new CollectorSubsystem();
  private CollectorCommand collectorCommand;
  
  
  private final DriverSubsystem driverSubsystem = new DriverSubsystem();
  private ArcadeDriveCommand arcadeDriveCommand;

  private final CameraSubsystem cameraSubsystem = new CameraSubsystem();

  private Joystick stick;
  public JoystickButton stickButtons[] = new JoystickButton[12];
  public JoystickButton tankStickButtons[] = new JoystickButton[12];
  private Joystick tankStick;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    //this.shootingCommand = new ShootingCommand();
    this.arcadeDriveCommand = new ArcadeDriveCommand();
    this.collectorCommand = new CollectorCommand();
    //this.tankDriveCommand = new TankDriveCommand();
    //this.spinLeftCommand = new SpinLeftCommand();
    //this.spinRightCommand = new SpinRightCommand();
    //this.goBackwardCommand = new GoBackwardCommand();
    //this.goForwardCommand = new GoForwardCommand();
  }
  public ShootingSubsystem getShootingSubsytem(){
    return this.shootingSubsystem;
  }
  public Command getShootingCommand(){
    return this.shootingCommand;
  }
  public Joystick getStick(){
    return this.stick;
  }
  public DriverSubsystem getDriverSubsystem(){
    return this.driverSubsystem;
  }
  public CollectorSubsystem getCollectorSubsystem(){
      return this.collectorSubsystem;
  }
  public Joystick getTankStick(){
    return this.tankStick;
  }
  public Command getArcadeDriveCommand(){
    return this.arcadeDriveCommand;
  }
  public CameraSubsystem getCameraSubsystem(){
    return this.cameraSubsystem;
  }
  public Command getCollectorCommand(){
    return this.collectorCommand;
  }



  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    this.stick = new Joystick(0);
    this.tankStick = new Joystick(2);
    for(int i = 0; i < stickButtons.length; i++){
      tankStickButtons[i] = new JoystickButton(this.tankStick, i);
      stickButtons[i] = new JoystickButton(this.stick, i);
    }
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
