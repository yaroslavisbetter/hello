package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorControl extends SubsystemBase{
    private WPI_TalonSRX motor;
    public MotorControl (){
        motor = new WPI_TalonSRX(1);
    }
    public void motorspeed(double speed)
    {
        motor.set(speed);
    }


}