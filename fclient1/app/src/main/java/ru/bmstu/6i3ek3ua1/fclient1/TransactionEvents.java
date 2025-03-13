package ru.bmstu.6i3ek3ua1.fclient1;

public interface TransactionEvents {
    String enterPin(int ptc, String amount);
    void transactionResult(boolean result);
}