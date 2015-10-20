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

package com.qualcomm.ftcrobotcontroller.utils;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by coltrane on 10/20/15.
 */
public class Motor {
    private static Motor i;

    public Motor() {
        this.i = this;
    }

    // lot less code this way, much easier to do ;)
    public void power(DcMotor m, double p, Dir d) {
        m.setDirection(d == Dir.F ? DcMotor.Direction.FORWARD : DcMotor.Direction.REVERSE);
        m.setPower(p);
    }

    public static void joyStick(float x, float y) {

    }

    public static Motor getInstance() {
        return i;
    }
}
