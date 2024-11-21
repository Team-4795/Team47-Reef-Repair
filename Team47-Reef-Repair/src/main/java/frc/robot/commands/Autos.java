// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Intake;
import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command exampleAuto(ExampleSubsystem subsystem) {
    return Commands.sequence(Commands.waitSeconds(0), new ExampleCommand(subsystem));
  }

  public static Command taxi(Drive subsystem) {
    return Commands.startEnd(()->subsystem.arcadeDrive(0, 1), ()->subsystem.arcadeDrive(0,0), subsystem).withTimeout(3);
  }

  public static Command outtake(Drive drive, Elevator elevator, Intake intake) {
    return Commands.sequence(
      Commands.startEnd(()->drive.arcadeDrive(0, 1), ()->drive.arcadeDrive(0, 0), drive).withTimeout(3),
      Commands.startEnd(()->drive.arcadeDrive(1, 0), ()->drive.arcadeDrive(0, 0), drive).withTimeout(3),
      Commands.startEnd(()->elevator.up(), ()->elevator.stop(), elevator).withTimeout(3),
      Commands.startEnd(()->intake.shoot(), ()->intake.zero(), intake).withTimeout(2),
      Commands.startEnd(()->elevator.down(), ()->elevator.stop(), elevator).withTimeout(3)
    );
  }


  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
