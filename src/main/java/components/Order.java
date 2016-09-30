package components;


import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private Customer customer;
    private List<Pizza> pizzas;
    private Payment payment;

    public Order (List<Pizza> pizzas, Customer customer) {
        this.pizzas = pizzas;
        this.customer = customer;
    }

    public Float getTotal () {
        return 0.0f;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer (Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas () {
        return pizzas;
    }

    public void setPizzas (List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Payment getPayment () {
        return payment;
    }

    public void setPayment (Payment payment) {
        this.payment = payment;
    }
}
