package com.tfgarage.model;

public class ProviderStat extends Provider{
    private int amountReceived;

    public ProviderStat() {
    }

    public ProviderStat(int id, String name, String address, String phoneNum,
                        String email, String note, int amountReceived) {
        super(id, name, address, phoneNum, email, note);
        this.amountReceived = amountReceived;
    }

    public int getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(int amountReceived) {
        this.amountReceived = amountReceived;
    }
}
