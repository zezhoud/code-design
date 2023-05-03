package cn.nilsad;

import cn.nilsad.service.CalculationArea;
import cn.nilsad.service.impl.CalculationAreaExt;

/**
 * @description:
 * @author: ${USER}
 * @create: ${YEAR}-${MONTH}-${DAY}
 */
public class Main {
    public static void main(String[] args) {
        CalculationArea calculationArea = new CalculationAreaExt();
        System.out.println(calculationArea.circular(10));
    }
}