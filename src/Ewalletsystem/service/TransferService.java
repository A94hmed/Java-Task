package Ewalletsystem.service;

import Ewalletsystem.Exception.InvalidTransfer;
import Ewalletsystem.model.Account;

public interface TransferService {
    boolean transfer(
            Account sender,
            Account receiver,
            double amount

    ) throws InvalidTransfer;
}
