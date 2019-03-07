public class CarRoadServise {

    public int calculateRoad (int carFuelConsumptionPer100km, int carTankVolume) {

        int totalCarRoad =carTankVolume/carFuelConsumptionPer100km;
        return totalCarRoad;
    }
}

