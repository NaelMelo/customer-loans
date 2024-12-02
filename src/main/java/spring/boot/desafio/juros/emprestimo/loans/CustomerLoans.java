package spring.boot.desafio.juros.emprestimo.loans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerLoans {
    private String customer;
    private List<LoansOptions> loans;
}
