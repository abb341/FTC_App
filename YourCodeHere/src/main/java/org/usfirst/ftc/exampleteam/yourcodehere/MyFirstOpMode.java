package org.usfirst.ftc.exampleteam.yourcodehere;

import com.qualcomm.robotcore.hardware.*;
import org.swerverobotics.library.*;
import org.swerverobotics.library.interfaces.*;

/**
 *  Main OpMode (teleOp)
 */
@TeleOp(name="MyFirstOpMode")
public class MyFirstOpMode extends SynchronousOpMode
    {
    /* Declare here any fields you might find useful. */
    DcMotor motorLeft = null;
    DcMotor motorRight = null;

    @Override public void main() throws InterruptedException
        {
        /* Initialize our hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names you assigned during the robot configuration
         * step you did in the FTC Robot Controller app on the phone.
         */
        this.motorLeft = this.hardwareMap.dcMotor.get("motorLeft");
        this.motorRight = this.hardwareMap.dcMotor.get("motorRight");

            motorLeft.setChannelMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);
            motorRight.setChannelMode(DcMotorController.RunMode.RUN_WITHOUT_ENCODERS);

            while (true)
            {
             motorLeft.setPower(1.0);
            }



        // Wait for the game to start
        //waitForStart();

//        // Go go gadget robot!
//        while (opModeIsActive())
//            {
//            if (updateGamepads())
//                {
//                // The game pad state has changed. Do something with that!
//                    float rightStickX = this.gamepad1.right_stick_x;
//                    motorLeft.setPower(rightStickX);
//                    float rightStickY = this.gamepad1.right_stick_y;
//                    motorLeft.setPower(rightStickY);
//                    motorRight.setPower(rightStickY);
//                }
//
//            telemetry.update();
//            idle();
//            }
//
        }
    }
