package spring.boot.desafio.juros.emprestimo.loans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoansCustomer {
    private int age;
    private String cpf;
    private String name;
    private double income;
    private String location;


    public LoansCustomer(LoansRequestPayload data) {
        this.age = data.age();
        this.cpf = data.cpf();
        this.name = data.name();
        this.income = data.income();
        this.location = data.location();
    }

}
