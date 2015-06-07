package camelXslt;

import java.util.ArrayList;
import java.util.List;

public class OrderInfoImpl implements OrderInfo {
	
	List <Order> list = new ArrayList<Order>();
	
	OrderInfoImpl(){
		Order order = new Order();
		order.setOrderId(1);
		order.setItemName("Soap");
		order.setQuantity(120);
		order.setCustomerName("Sandeep");
		order.setShippingAddress("Gurgaon");
		list.add(0, order);
		Order orderSample=new Order();
		orderSample.setOrderId(2);
		orderSample.setItemName("Shampoo");
		orderSample.setQuantity(50);
		orderSample.setCustomerName("Sandeep");
		orderSample.setShippingAddress("HYD");
		list.add(1, orderSample);
	}
	
	public Order getOrder(int orderId) {
		System.out.println("Inside the GetOrder...");
		if (list.get(0).getOrderId() == orderId) {
			return list.get(0);
		}else if (list.get(1).getOrderId() == orderId) {
			return list.get(1);
		}else {
			return null;
		}
	}
	
	public OrderList getAllOrders() {
		
		OrderList details = new OrderList();
		for(Order order : list) {
			details.getOrder().add(order);
		}
		return details;
	}

	public OrderList returnOrders() {
		// TODO Auto-generated method stub
		System.out.println("Navigating is not done");
		return null;
	}

	public Order getOrderDetails(Order order) {
		// TODO Auto-generated method stub
		System.out.println("Inside getOrder of xslt transformation");
		if (list.get(0).getOrderId() == order.getOrderId()) {
			System.out.println("Changing the Quantity");
			list.get(0).setQuantity(500);
			return list.get(0);
		}else if (list.get(1).getOrderId() == order.getOrderId()) {
			System.out.println("Changing the Quantity in list Order 2");
			list.get(1).setQuantity(1000);
			return list.get(1);
		}else {
			return null;
		}
	}
}
