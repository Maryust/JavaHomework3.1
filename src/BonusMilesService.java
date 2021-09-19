public class BonusMilesService {
    public long calculate(int cost) {
        int milePrice = 20;
        int mile = cost / milePrice;
        return mile;
    }
}
