package frc.robot;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModule.DriveRequestType;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModule.SteerRequestType;
import com.ctre.phoenix6.mechanisms.swerve.SwerveRequest;

public final class Constants {

    public static final double loopLengthSeconds = 0.02;

    public final static class Shooter {
        public static final int speed1 = 0;
        public static double maxSpeed = 10.0; // Units idk also arbitrary number here because I'm not sure what to put
    }

    public final static class Climber {

    }

    public final static class LED {

    }

    public final static class Feeder {

    }

    public final static class Controllers {
        public static final int driveID = 0;
        public static final int manipID = 0;
    }

    public final static class Drivetrain {

        public static final int pigeonID = 0;

       

        public static final String CANBusName = "";

        public static final double maxVelocity = 0; // m/s
        public static final double maxRot = Math.PI; // r/s

        public static final double driveGearRatio = 0;
        public static final double steerGearRatio = 0; // Check

        public static final double wheelRadius = 0; // in Inches

        public static final Slot0Configs steerGains = new Slot0Configs()
        .withKP(0).withKI(0).withKD(0)
        .withKS(0).withKV(1.5).withKA(0);

    public static final Slot0Configs driveGains = new Slot0Configs()
        .withKP(0).withKI(0).withKD(0)
        .withKS(0).withKV(0).withKA(0);

        // These are only used for simulation
    public static final double kSteerInertia = 0;
    public static final double kDriveInertia = 0;
    // Simulated voltage necessary to overcome friction
    public static final double kSteerFrictionVoltage = 0;
    public static final double kDriveFrictionVoltage = 0;

        /* Front Left Module - Module 0 */
        public static final class Mod0 { 
            public static final double locationX = 0; // In m
            public static final double locationY = 0; // In m
            public static final int driveMotorID = 0;
            public static final int angleMotorID = 0;
            public static final int canCoderID = 0;
            public static final double dobOffset = 0; // In rad

            public static final boolean inverted = false; // For drive
        }

        /* Front Right Module - Module 1 */
        public static final class Mod1 { 
            public static final double locationX = 0;
            public static final double locationY = 0;
            public static final int driveMotorID = 0;
            public static final int angleMotorID = 0;
            public static final int canCoderID = 0;
            public static final double dobOffset = 0;

            public static final boolean inverted = false;
        }
        
        /* Back Left Module - Module 2 */
        public static final class Mod2 { 
            public static final double locationX = 0;
            public static final double locationY = 0;
            public static final int driveMotorID = 0;
            public static final int angleMotorID = 0;
            public static final int canCoderID = 0;
            public static final double dobOffset = 0;

            public static final boolean inverted = false;
        }

        /* Back Right Module - Module 3 */
        public static final class Mod3 { 
            public static final double locationX = 0;
            public static final double locationY = 0;
            public static final int driveMotorID = 0;
            public static final int angleMotorID = 0;
            public static final int canCoderID = 0;
            public static final double dobOffset = 0; 

            public static final boolean inverted = false;
        }

        public static final class Simulation {
            public static final double angMomentum = 0; // kg*m^2
            public static final double driveMometun = 0; // kg*m^2
        }

        public static final class Requests { // Can create own using the SwerveRequest Interface. Not nessecary unless ultra advanced!!!
            public static final SwerveRequest.FieldCentric fieldCentric = new SwerveRequest.FieldCentric()
   .withDeadband(Constants.Drivetrain.maxVelocity * 0.1).withRotationalDeadband(Drivetrain.maxRot * 0.1) // Add a 10% deadband
   .withDriveRequestType(DriveRequestType.OpenLoopVoltage)
   .withSteerRequestType(SteerRequestType.MotionMagicExpo);

            public static final SwerveRequest.Idle idle = new SwerveRequest.Idle();
        }
    }
    
}
