package org.usfirst.ftc.exampleteam.yourcodehere;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.swerverobotics.library.SynchronousOpMode;
import org.swerverobotics.library.interfaces.TeleOp;

/**
 *  Autonomous Mode
 */
@TeleOp(name="Autonomous")
public class Autonomous extends SynchronousOpMode
    {
    /* Declare here any fields you might find useful. */
    DcMotor motorLeftBack = null;
    DcMotor motorRightBack = null;
    DcMotor motorLeftFront = null;
    DcMotor motorRightFront = null;

    @Override public void main() throws InterruptedException
        {
        /* Initialize our hardware variables. Note that the strings used here as parameters
         * to 'get' must correspond to the names you assigned during the robot configuration
         * step you did in the FTC Robot Controller app on the phone.
         */
        this.motorLeftBack = this.hardwareMap.dcMotor.get("motorLeft");
        this.motorRightBack = this.hardwareMap.dcMotor.get("motorRight");
        this.motorLeftFront = this.hardwareMap.dcMotor.get("motorLeftFront");
        this.motorRightFront = this.hardwareMap.dcMotor.get("motorRightFront");

        // Wait for the game to start
        waitForStart();

        // Go go gadget robot!
        while (opModeIsActive())
            {
            if (updateGamepads())
                {
                // The game pad state has changed. Do something with that!
                }

            telemetry.update();
            idle();
            }
        }
    }
