package day52.warmup;

import day52.warmup.Account;

public interface Transferable {

    public abstract void transferAll(Account otherAccount);

    // public abstract void transferAmount(Account otherAccount , int amountToTransfer);

}
