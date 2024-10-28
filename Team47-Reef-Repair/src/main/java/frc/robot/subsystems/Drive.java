package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
    private PWMVictorSPX leftMotor = new PWMVictorSPX(0);
    private PWMVictorSPX rightMotor = new PWMVictorSPX(0);
    private DifferentialDrive diffDrive = new DifferentialDrive(leftMotor, rightMotor);
    public Drive (){
        
    }

    public void arcadeDrive(double xAxis, double yAxis){
        diffDrive.arcadeDrive(yAxis, xAxis);
    }
}
