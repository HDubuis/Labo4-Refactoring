package ch.heigvd.gen2020;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < getOrdersCount(); i++) {
            Order order = getOrder(i);
            sb.append(order.toString());
        }

        if (getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}
