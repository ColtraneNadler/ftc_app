/*
 * Copyright (c) 2015 Coltrane Nadler
 *
 * Kanye West 2020.
 *
 * Kanye West needs to become president in the year 2020 because he would impact the USA greatly for
 * the better. Through his egotistical state of mind, and ability to compose and produce flawless
 * music for the general public, he will shift America into progressing in the right direction. Some
 * say Bush caused 9/11, I don't 100% agree with that, but I can honestly say Kanye would never do
 * such a thing. Kanye knows the struggle of the average American, he has lived many years as an average
 * American. However, Kanye has not only and blindedly lived many years of privilege, like most of the old, rich, white, Christian
 * presidential candidates have. Kanye will be able to progress America into a better state for all.
 *
 * As always,
 * Kanye West knows best.
 *
 * FEEL FREE TO DO WHATEVER YOU WANT WITH THIS CODE. I WROTE IT BECAUSE I AM l337!
 *
 * #HMU4BAL
 */

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.components.SexyAssArm;
import com.qualcomm.ftcrobotcontroller.utils.Dir;
import com.qualcomm.ftcrobotcontroller.utils.Motor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.LegacyModule;

/**
 * Created by coltrane on 10/16/15.
 */
public class JayVee extends OpMode {
    SexyAssArm arm;
//    private static JayVee i;

    public JayVee() {
        // bitch better have my money
//        this.i = this;

    }

    @Override
    public void init() {
        arm = new SexyAssArm(hardwareMap.dcMotor.get("arm_x"), hardwareMap.dcMotor.get("arm_y"));
    }

    @Override
    public void loop() {
        //make a util for this
        if(gamepad1.dpad_down)
            arm.down((float) 1);

        if(gamepad1.dpad_up)
            arm.up((float) 1);

        if(gamepad1.dpad_left)
            arm.left((float) 1);

        if(gamepad1.dpad_right)
            arm.right((float) 1);
    }

    @Override
    public void stop() {
        // throw null pointer exception if someone tries to use this shit, BECAUSE THEY ARENT SUPPOSED TO
//        i = null;
        System.out.println("Swag");
    }


//    public static JayVee getInstance() {
//        return i;
//    };
}
