package spring.boot.desafio.juros.emprestimo.loans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoansService loansService;

    @GetMapping("/customer-loans")
    public Object getAvailableLoans(@RequestBody LoansRequestPayload payload){
        LoansCustomer newLoansCustomer = new LoansCustomer(payload);
        List<LoansOptions> availableLoans = loansService.getAvailableLoans(newLoansCustomer);
        CustomerLoans customerLoans = new CustomerLoans();
        customerLoans.setCustomer(newLoansCustomer.getName());
        customerLoans.setLoans(availableLoans);
        return ResponseEntity.ok(customerLoans);
    }
}

