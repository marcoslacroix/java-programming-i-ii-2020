
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // número de refeições acessíveis vendidas
    private int heartyMeals;  // número de refeições saudáveis ​​vendidas

    public PaymentTerminal() {
        // registrar inicialmente tem 1000 euros em dinheiro
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // uma refeição acessível custa 2,50 euros
        // aumenta a quantia em dinheiro pelo preço de uma média acessível e retorna a alteração
        // se o parâmetro de pagamento não for grande o suficiente, nenhuma refeição será vendida e o método deverá retornar todo o pagamento
        double change = 0;
        if (payment >= 2.50) {
            this.affordableMeals += 1;
            this.money += 2.50;
            change = payment - 2.50;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // uma refeição saudável custa 4,30 euros
        // aumenta a quantia em dinheiro pelo preço de uma média saudável e devolve a mudança
        // se o parâmetro de pagamento não for grande o suficiente, nenhuma refeição será vendida e o método deverá retornar todo o pagamento
        double change = 0;
        if (payment >= 4.30) {
            this.heartyMeals += 1;
            this.money += 4.30;
            change = payment - 4.30;
            return change;
        } else {
            return payment;
        }

    }

    public boolean eatAffordably(PaymentCard card) {
        // uma refeição acessível custa 2,50 euros
        // se o cartão de pagamento tiver dinheiro suficiente, o saldo do cartão será diminuído pelo preço e o método retornará true
        // caso contrário, false é retornado
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            this.affordableMeals += 1;
            return true;
        } else {
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        // uma refeição saudável custa 4,30 euros
        // se o cartão de pagamento tiver dinheiro suficiente, o saldo do cartão será diminuído pelo preço e o método retornará true
        // caso contrário, false é retornado
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            this.heartyMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
