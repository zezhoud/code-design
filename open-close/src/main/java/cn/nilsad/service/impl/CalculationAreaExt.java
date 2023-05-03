package cn.nilsad.service.impl;

/**
 * @description:
 * @author: dingzezhou
 * @create: 2023-05-02
 */
public class CalculationAreaExt extends CalculationAreaImpl {
    private static final double pi = 3.1415926D;

    @Override
    public double circular(double r) {
        return pi * r * r;
    }
}
