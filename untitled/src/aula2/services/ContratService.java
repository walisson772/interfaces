package aula2.services;


import aula2.entities.Contract;
import aula2.entities.Installment;

import java.time.LocalDate;

public class ContratService {

    private OnlinePaymentService onlinePaymentService;

    public ContratService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;

        for (int i=1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getList().add(new Installment(dueDate, quota));

        }
    }
}
