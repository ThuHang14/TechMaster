package test;

public class b860_lemonade {
    public boolean lemonadeChange(int[] bills) {
        int[] money = {0, 0};
        for (int a : bills
        ) {
            if (a == 5) { // 5 5 10 10 20
                money[0]++;
            } else if (a == 10) {
                money[0]--;
                money[1]++;
                if (money[0] < 0) return false;
            } else {
                if (money[1] > 0 && money[0] >0) {
                    money[1]--;
                    money[0]--;

                } else if (money[1] == 0 && money[0] >2) {
                    money[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
