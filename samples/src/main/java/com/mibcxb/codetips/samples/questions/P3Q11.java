package com.mibcxb.codetips.samples.questions;

public class P3Q11 {
    public static void main(String[] args) {

    }

    public static void timeToSphere(double x, double y, double z, double vx, double vy, double vz, double r) {
        double a = vx * vx + vy * vy + vz * vz;
        double b = 2 * (vx * x + vy * y + vz * z);
        double c = x * x + y * y + z * z - r * r;
        double delta = b * b - 4 * a * c;
        double result;
        if (delta < 0) {
            result = 0;
        } else if (delta == 0) {
            result = -b / 2 * a;
        } else {
            double t1 = (-b + Math.sqrt(delta)) / (2 * a);
            double t2 = (-b - Math.sqrt(delta)) / (2 * a);
            if (t1 > 0 && t2 > 0) {
                result = Math.min(t1, t2);
            } else if (t1 > 0) {
                result = t1;
            } else if (t2 > 0) {
                result = t2;
            } else {
                result = 0;
            }
        }
        System.out.printf("%.5f", result);
    }
}
