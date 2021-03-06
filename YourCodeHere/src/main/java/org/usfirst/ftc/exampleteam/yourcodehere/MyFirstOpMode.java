package org.usfirst.ftc.exampleteam.yourcodehere;

import com.qualcomm.robotcore.hardware.*;
import org.swerverobotics.library.*;
import org.swerverobotics.library.interfaces.*;

/**
 *  Main OpMode (teleOp)
 */
@TeleOp(name="MyFirstOpMode")
public class MyFirstOpMode extends SynchronousOpMode {
    /* Declare here any fields you might find useful. */

    // Declare DC Motors
    DcMotor motorLeft = null;
    DcMotor motorRight = null;

    // Declare Servos
    DcMotor motorArm = null;


    @Override
    public void main() throws InterruptedException {
        /* Initialize our hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names you assigned during the robot configuration
         * step you did in the FTC Robot Controller app on the phone.
         */

        // Initialize DC Motors
        this.motorLeft = this.hardwareMap.dcMotor.get("motorLeft");
        this.motorRight = this.hardwareMap.dcMotor.get("motorRight");

        motorLeft.setMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);
        motorRight.setMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);

        motorRight.setDirection(DcMotor.Direction.REVERSE);

//        boolean test = true;
//        while (test) {
//            motorLeft.setPower(1.0);
//            motorRight.setPower(1.0);
//
//            if (updateGamepads())
//            {
//                if (gamepad1.b)
//                {
//                    test = false;
//                }
//            }
//        }

       // while (opModeIsActive())
        // gamepad1.a
        while (true)
        {
            if (updateGamepads())
            {
                motorLeft.setPower(gamepad1.left_stick_y);
                motorRight.setPower(gamepad1.right_stick_y);

                // move the arm with controller bumpers
                if (gamepad1.right_bumper)
                {
                    motorArm.setPower(0.5);
                    Thread.sleep(100);
                }
                else if (gamepad1.left_bumper)
                {
                    motorArm.setPower(-0.5);
                    Thread.sleep(100);
                }
                else
                {
                    motorArm.setPower(0);
                }
            }

            telemetry.update();
            idle();
        }
    }
}



//        // Wait for the game to start
//        //waitForStart();
//
//       // Go go gadget robot!
//        while (opModeIsActive())
//            {
//            if (updateGamepads())
//                {
//                // The game pad state has changed. Do something with that
//                    motorLeft.setPower(gamepad1.left_stick_y);
//                    motorRight.setPower(gamepad1.left_stick_y);
//                    //motorRight.setPower(gamepad1.right_stick_y);
//                }
//
//                telemetry.update();
//                idle();
//            }
//
//        }
//    }
