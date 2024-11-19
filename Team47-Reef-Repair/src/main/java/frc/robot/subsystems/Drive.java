package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
    private PWMTalonSRX leftMotor = new PWMTalonSRX(0);
    private PWMTalonSRX rightMotor = new PWMTalonSRX(0);
    private DifferentialDrive diffDrive = new DifferentialDrive(leftMotor, rightMotor);
    public Drive (){
        
    }

    public void arcadeDrive(double xAxis, double yAxis){
        diffDrive.arcadeDrive(yAxis, xAxis);
    }
}
