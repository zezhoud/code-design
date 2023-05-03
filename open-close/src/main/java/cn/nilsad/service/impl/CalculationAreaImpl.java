package cn.nilsad.service.impl;

import cn.nilsad.Main;
import cn.nilsad.service.CalculationArea;

/**
 * @description:
 * @author: dingzezhou
 * @create: 2023-05-02
 */
public class CalculationAreaImpl implements CalculationArea {
    private static final double pi = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return pi * r * r;
    }
}
