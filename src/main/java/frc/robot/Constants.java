package frc.robot;

import edu.wpi.first.apriltag.AprilTag;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;


public class Constants {
  //Constants setup for field at home

  public static class VisionConstants {
    public static final Transform3d ROBOT_TO_CAM = new Transform3d(new Translation3d(0.00, .38, 0.15),
        new Rotation3d(0, 0, 0));
  }

  public static class FieldConstants  {
    /**
     *April Tags
     */
    public static AprilTag TAG_THREE = new AprilTag(3, new Pose3d(new Pose2d((3.270 - .721), 4.234, Rotation2d.fromDegrees(180))));
    public static AprilTag TAG_FOUR = new AprilTag(4,
        new Pose3d(new Pose2d(0.0, 3.5189, Rotation2d.fromDegrees(270))));

    //TODO set to correct values
    public static AprilTag TAG_SIX = new AprilTag(6,
        new Pose3d(new Pose2d(3.27, 2.66, Rotation2d.fromDegrees(90))));

    public static Pose2d FIRST_BLUE_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d SECOND_BLUE_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d THIRD_BLUE_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d FOURTH_BLUE_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d FIFTH_BLUE_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));

    public static Pose2d BLUE_CHARGING_STATION = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d RED_CHARGING_STATION = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));

    public static Pose2d FIRST_RED_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d SECOND_RED_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d THIRD_RED_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d FOURTH_RED_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));
    public static Pose2d FIFTH_RED_GRID = new Pose2d(0.0, 0.0, Rotation2d.fromDegrees(0.0));


       /**
     *  Field Dimensions
     */
    public static double FIELD_LENGTH = 3.27;
    public static double FIELD_WIDTH = 4.234;


  }
  public static class RobotConstants {

    public static final double RAMSETE_B = 2; // Tuning parameter (b > 0 rad^2/m^2) for which larger values make convergence more aggressive like a proportional term.
    public static final double RAMSETE_ZETA = 0.7; // Tuning parameter (0 rad-1 < zeta < 1 rad-1) for which larger values provide more damping in response.
    public static double TRACK_WIDTH = 0.5;
    public static double AUTO_MAX_SPEED = 0.0;
    public static double AUTO_MAX_ACCEL = 0.0;
    public static double VOLTS_PER_METER = 0.0;
    public static double VOLTS_SECONDS_PER_METER = 0.0;
    public static double VOLTS_SECONDS_SQ_PER_METER = 0.0;

    public static final DifferentialDriveKinematics DIFFERENTIAL_DRIVE_KINEMATICS = new DifferentialDriveKinematics(TRACK_WIDTH);

    public static class PneumaticsConstants {

      public enum PistonSelect{
        WRIST_PISTON,
        ARM_PISTON,
        CLAW_PISTON_R,
        CLAW_PISTON_L
      }


    }

  }


}
