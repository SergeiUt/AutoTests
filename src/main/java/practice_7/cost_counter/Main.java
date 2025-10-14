package practice_7.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 111.54);
        costCounter.addCosts(2, 22.23);
        costCounter.addCosts(3, 333.43);
        costCounter.addCosts(4, 44.43);
        costCounter.addCosts(5, 222.67);


        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.getMinCostMonth());



    }

}
