package services;

import java.util.List;

public class CalculationService {

    public static <Type extends Comparable<Type>> Type max(List<Type> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        Type max = list.get(0);
        for (Type employee : list) {
            if (employee.compareTo(max) > 0) max = employee;
        }

        return max;
    }


}
