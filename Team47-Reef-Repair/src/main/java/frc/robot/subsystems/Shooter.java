package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    PWMTalonSRX leftShooter = new PWMTalonSRX(0);
    PWMTalonSRX rightShooter = new PWMTalonSRX(0);

    public Shooter() {
        leftShooter.addFollower(rightShooter);
        
    }

    public void shoot(){
        leftShooter.set(0.5);
    }
    public void reverseShoot() {
        leftShooter.set(-0.5);
    }

}
