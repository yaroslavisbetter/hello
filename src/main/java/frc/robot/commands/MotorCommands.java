package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class MotorCommands extends CommandBase{
    @Override
    public void initialize(){
        addRequirements(Robot.example);
    }
    @Override
    public void execute (){
        Robot.example.motorspeed(RobotContainer.leftStick.getY());
    }
    @Override
    public void end (boolean george){   
        Robot.example.motorspeed(0);
    }
    @Override
    public boolean isFinished(){
        return false;
    
    }
}