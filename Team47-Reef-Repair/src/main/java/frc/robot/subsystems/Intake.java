package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    PWMTalonSRX leftMotor = new PWMTalonSRX(0);
    PWMTalonSRX rightMotor = new PWMTalonSRX(0);

    public Intake() {
        leftMotor.addFollower(rightMotor);
    }

    public void shoot(){
        leftMotor.set(0.5);
    }
    public void intake() {
        leftMotor.set(-0.5);
    }
    public void zero() {
        leftMotor.set(0);
    }

}
