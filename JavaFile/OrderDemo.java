package com;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OrderDemo {
	OrderService orderService = new OrderService();

	
//Retrieve Students Info
@GetMapping("/studentdata")
public Order getDummyProduct() {
    Order s = new Order();
	s.setName("Himanshi");
	s.setBrand("Nike");
	return s;	
}

//Get by Id

@GetMapping("/personinforid/{id}")
public Order getDummyOrderById(@PathVariable("id") Integer id) {
Order s = new Order();// creating java object

s.setId(id);
s.setName("Himanshi");
s.setBrand("Nike");
return s;
}

// add the person information POst

@PostMapping(value = "/insertpersondetails")
public Order insertDummyOrder(@RequestBody Order order) {
return orderService.addOrder(order); //calling the service
}


//update person info
@PutMapping("/update")
public Order updateorderInfo(@RequestBody Order order) {
return orderService.updateOrder(order);

}
//get list
@GetMapping("/getlist")
public List<Order> getDummyOrderList() {
List<Order> listOfOrder = orderService.getAllOrderlist();
return listOfOrder;
}

//delete the data
@DeleteMapping("/delete/{id}")
public List<Order> deleteOrderById(@PathVariable Integer id) {
new OrderService().deleteOrder(id);
return new OrderService().getAllOrderlist();
}

}



