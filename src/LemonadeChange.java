public class LemonadeChange {
    /**
     * 柠檬水找零
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length ; i++) {
            if(bills[i] == 5){
                five++;
            } else if(bills[i] == 10 && five > 0){
                five--;
                ten++;
            } else if(bills[i] == 20 && five > 0 && ten > 0){
                ten--;
                five--;
            } else if(bills[i] == 20 && five >= 3){
                five = five - 3;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
