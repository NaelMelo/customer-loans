package spring.boot.desafio.juros.emprestimo.loans;

public record LoansRequestPayload (int age, String cpf, String name, double income, String location){
}
