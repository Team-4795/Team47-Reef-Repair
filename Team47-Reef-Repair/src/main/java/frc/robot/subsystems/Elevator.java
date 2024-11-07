package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase{
    private PWMTalonSRX motor = new PWMTalonSRX(5);

    public void up(){
        motor.set(1);
    }
    public void down(){
        motor.set(-1);
    }
    public void stop(){
        motor.set(0);
    }
}