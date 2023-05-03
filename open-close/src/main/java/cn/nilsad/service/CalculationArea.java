package cn.nilsad.service;

/**
 * @description:
 * @author: dingzezhou
 * @create: 2023-05-02
 */
public interface CalculationArea {
    double rectangle(double x, double y);

    double triangle(double x, double y, double z);

    double circular(double r);
}
