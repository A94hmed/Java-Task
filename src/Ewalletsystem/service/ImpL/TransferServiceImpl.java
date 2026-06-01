package Ewalletsystem.service.ImpL;

import Ewalletsystem.Exception.InvalidTransfer;
import Ewalletsystem.model.Account;
import Ewalletsystem.service.TransferService;

public class TransferServiceImpl implements TransferService {

    @Override
    public boolean transfer(Account sender, Account receiver, double amount) throws InvalidTransfer {

       if(sender.getBalance()<amount){
           throw new InvalidTransfer(
                   "Insufficient Balance"
           );
       }

        double senderBalance =
                sender.getBalance() - amount;

        double receiverBalance =
                receiver.getBalance() + amount;

        sender.setBalance(senderBalance);

        receiver.setBalance(receiverBalance);

        return true;





    }
}
