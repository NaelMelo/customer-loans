package spring.boot.desafio.juros.emprestimo.loans;

import jakarta.persistence.Entity;
@Entity
public class Loans {
    private int age;
    private String cpf;
    private String name;
    private double income;
    private String location;

    public Loans(LoansRequestPayload data) {
        this.age = data.age();
        this.cpf = data.cpf();
        this.name = data.name();
        this.income = data.income();
        this.location = data.location();
    }
}
