package frc.robot.commands.auto;

import static frc.robot.Constants.RobotConstants.ControlsConstants.ALIGNMENT;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.utilities.LimelightHelpers;
import frc.robot.utilities.LimelightHelpers.LimelightTarget_Detector;

public class GamePieceSeekCmd extends CommandBase {
  /**
   * Creates a new GamePieceSeekCmd.
   */
  private static double _id = 0;
  private static LimelightTarget_Detector _target;
  private final Drivetrain _drivetrain;

  public GamePieceSeekCmd(Drivetrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    _drivetrain = drivetrain;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    var target = LimelightHelpers.getLatestResults("").targetingResults.targets_Detector;

    for (var t : target) {
        _id = t.classID;
        _target = t;
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    var rotation = ALIGNMENT.getController().calculate(_target.tx,0);
    _drivetrain.drive(.5, rotation);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}