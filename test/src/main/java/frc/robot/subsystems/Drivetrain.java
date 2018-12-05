/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DifferentialDrive m_drive;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public Drivetrain() {
    Spark m_frontLeft = new Spark(1);
    Spark m_rearLeft = new Spark(2);
    SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

    Spark m_frontRight = new Spark(3);
    Spark m_rearRight = new Spark(4);
    SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
    DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);//I copied this part from the API
  }

  public void Set(){
    m_drive.tankDrive(0.5,0.5);
  }

  public void Stop(){
    m_drive.stopMotor();
  }
}
