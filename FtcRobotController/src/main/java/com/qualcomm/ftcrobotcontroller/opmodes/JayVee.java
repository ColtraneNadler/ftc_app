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

import com.qualcomm.ftcrobotcontroller.utils.Dir;
import com.qualcomm.ftcrobotcontroller.utils.Motor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.LegacyModule;

/**
 * Created by coltrane on 10/16/15.
 */
public class JayVee extends OpMode {
    LegacyModule legacyModule;
    DcMotor motor_x, motor_y;
    private static JayVee i;

    public JayVee() {
        // bitch better have my money
        this.i = this;

    }

    @Override
    public void init() {
        legacyModule = hardwareMap.legacyModule.get("arm_cont");
        motor_x = hardwareMap.dcMotor.get("motor_x");
        motor_y = hardwareMap.dcMotor.get("motor_y");
    }

    @Override
    public void loop() {
        if(gamepad1.dpad_down)
            Motor.getInstance().power(motor_x, 0.5, Dir.F);

        if(gamepad1.dpad_left)
            Motor.getInstance().power(motor_y, 0.5, Dir.R);

        if(gamepad1.dpad_right)
            Motor.getInstance().power(motor_x, 0.5, Dir.F);

        if(gamepad1.dpad_up)
            Motor.getInstance().power(motor_x, 0.5, Dir.R);
    }

    @Override
    public void stop() {
        // throw null pointer exception if someone tries to use this shit, BECAUSE THEY ARENT SUPPOSED TO
        i = null;
    }

    public static JayVee getInstance() {
        return i;
    };
}
