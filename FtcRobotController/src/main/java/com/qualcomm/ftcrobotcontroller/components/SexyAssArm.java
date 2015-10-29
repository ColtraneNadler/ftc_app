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

package com.qualcomm.ftcrobotcontroller.components;

import com.qualcomm.ftcrobotcontroller.utils.Dir;
import com.qualcomm.ftcrobotcontroller.utils.Motor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by coltrane on 10/29/15.
 */
public class SexyAssArm {
    private DcMotor motor_x, motor_y;
    private Servo tray;

    public SexyAssArm(DcMotor mY, DcMotor mX) {
        this.motor_x = mX;
        this.motor_y = mY;
    }

    public void up(Float p) {
        Motor.power(motor_y, p, Dir.R);
    }

    public void down(Float p) {
        Motor.power(motor_y, p, Dir.F);
    }

    public void right(Float p) {
        Motor.power(motor_x, p, Dir.F);
    }

    public void left(Float p) {
        Motor.power(motor_y, p, Dir.F);
    }
}