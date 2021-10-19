package ru.netology;

public class CashbackHackService {

    private int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }


}
