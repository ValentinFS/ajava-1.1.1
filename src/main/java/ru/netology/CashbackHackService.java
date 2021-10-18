package ru.netology;

public class CashbackHackService {

    private int boundary = 1000;

    public int remain(int amount){
        return boundary - amount % boundary;
    }






//    public int calculateBonus(int amount) {
//        if (amount < 1000) {
//            System.out.println("");
//            return 0;
//        }
//        int bonus = (amount - 1000) / 100;
//        if (bonus > 100) {
//            return 100;
//        }
//        return bonus;
//    }

}
