package spring.boot.desafio.juros.emprestimo.loans;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoansService {
    public List<LoansOptions> getAvailableLoans(LoansCustomer costumer){
        List<LoansOptions> availableLoans = new ArrayList<>();
        if (costumer.getAge() >= 10){
            availableLoans.add(new LoansOptions(LoansOptions.LoansType.PERSONAL));
        }
        if (costumer.getAge() >= 20){
            availableLoans.add(new LoansOptions(LoansOptions.LoansType.GUARANTEED));
        }
        if (costumer.getAge() >= 30){
            availableLoans.add(new LoansOptions(LoansOptions.LoansType.CONSIGNMENT));
        }
        return availableLoans;
    }
}
