class ParkingSystem {
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[3];

        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;
    }

    public boolean addCar(int carType) {
        if (slots[carType - 1] == 0) {
            return false;
        }

        slots[carType - 1] -= 1;

        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
