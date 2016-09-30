package components;

import org.springframework.stereotype.Component;

@Component
public class PizzaFlowActions {

    public boolean checkDeliveryArea(String zipCode){
        return true;
    }

    public void addCustomer(Customer customer){

    }
}
