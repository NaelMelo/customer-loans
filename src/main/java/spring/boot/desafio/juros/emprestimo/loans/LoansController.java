package spring.boot.desafio.juros.emprestimo.loans;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/customer-loans")
public class LoansController {
    @PostMapping
    public Object getAvailableLoans(@RequestBody LoansRequestPayload payload){
        Loans newLoans = new Loans(payload);
        return ResponseEntity.ok(payload);
    }
}
