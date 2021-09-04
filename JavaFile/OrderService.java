package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class OrderService {
	static HashMap<Integer, Order> orderIdMap = getOrderIdMap(); //map list

	 public OrderService() {
	super();

	 if (orderIdMap == null) {
		 orderIdMap = new HashMap<Integer, Order>();
	// Creating some objects of Person while initializing
	Order indiaPerson = new Order(1, "ram1","puma");
	Order chinaPerson = new Order(2, "ram2","adidas");
	Order nepalPerson = new Order(3, "ram3", "sketcher");
	Order bhutanPerson = new Order(4, "ram4", "code");

	 //adding map list of collections in java
	orderIdMap.put(1, indiaPerson);
	orderIdMap.put(4, chinaPerson);
	orderIdMap.put(2, bhutanPerson);
	orderIdMap.put(3, nepalPerson);
	}
	}

	public List<Order> getAllOrderlist() {
	List<Order> orderlist = new ArrayList<Order>(orderIdMap.values());
	return orderlist;
	}

	public Order getOrder(int id) {
		Order Order = orderIdMap.get(id);
	return Order;
	}

	// add person
	public Order addOrder(Order order) {
	order.setId(getMaxId()+ 1);
	// key , value
	orderIdMap.put(order.getId(),order); ///logic class
	return order;
	}
	//update
	public Order updateOrder(Order order) {
	if (order.getId() <= 0)
	return null;
	orderIdMap.put(order.getId(), order);
	return order;

	 }
	//delete

	public void deleteOrder(int id) {
		orderIdMap.remove(id);
	}
	public static HashMap<Integer, Order> getOrderIdMap() {
	return orderIdMap;
	}

//	 // Utility method to get max id
	public static int getMaxId() {
	int max = 0;
	for (int id : orderIdMap.keySet()) {
	if (max <= id)
	max = id;

	 }
	return max;
	}	
}