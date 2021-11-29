package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp(name="FirstOpMode", group="TeleOp")
public class FirstOpMode extends OpMode {

    // motors and stuff
    DcMotor leftWheel;
    DcMotor rightWheel;
    DcMotor intake;

    // Wheel Power
    double drivePower = 0.5;
    double leftWheelPower;
    double rightWheelPower;


    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("left_wheel");
        rightWheel = hardwareMap.dcMotor.get("right_wheel");

        leftWheel.setDirection(DcMotor.Direction.REVERSE);

        intake = hardwareMap.dcMotor.get("intake");
    }
    @Override
    public void start() {

    }
    @Override
    public void loop() {

        leftWheelPower = gamepad1.left_stick_y;
        rightWheelPower = gamepad1.right_stick_y;

        leftWheel.setPower(leftWheelPower);
        rightWheel.setPower(rightWheelPower);
        

        if (gamepad1.a){
            intake.setPower(drivePower);
        } else {
            intake.setPower(0);
        }
    }

    @Override
    public void stop() {

    }
}
