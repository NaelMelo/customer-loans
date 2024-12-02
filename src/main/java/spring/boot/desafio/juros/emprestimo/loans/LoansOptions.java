package spring.boot.desafio.juros.emprestimo.loans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class LoansOptions{
    private final LoansType type;
    @JsonProperty("interest_rate")
    private int interestRate;

    public LoansOptions(LoansType type){
        this.type = type;
        this.interestRate = type.getInterestRate();
    }
    public enum LoansType {
        GUARANTEED(3),
        PERSONAL(4),
        CONSIGNMENT(2);

        private final int interestRate;

        LoansType(int interestRate){
            this.interestRate = interestRate;
        }

        public int getInterestRate() {
            return interestRate;
        }
    }
}

