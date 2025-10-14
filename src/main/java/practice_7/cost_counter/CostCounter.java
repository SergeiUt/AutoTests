package practice_7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив, индекс = номер месяца
    private ArrayList<Double> costsPerMonth;

    public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    // метод добавления значения месяца по номеру (от 1 до 12) и расход зв этот месяц
    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month-1, costs);
    }

    // метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costsPerMonth.get(month-1);
    }

    // считать месяц с минимальным расходом
    public Double getMinCostMonth() {
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
        costsPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);
                    }
                }

        );
        return min.get();
    }


}
