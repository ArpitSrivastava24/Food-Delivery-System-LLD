package com.food.delivery;

import com.food.delivery.entities.*;
import com.food.delivery.managers.OrderManager;
import com.food.delivery.managers.RestaurantManager;

import java.util.HashMap;

public class FoodDeliverySystemApplication {

	public static void main(String[] args) throws InterruptedException {
		Customer customer=new Customer("Abhishek","Vasavi");
		Dishes daal=new Dishes("Daal","50");
		Dishes rice=new Dishes("Rice","50");
		Menu menu=new Menu();
		menu.addDishes(daal);
		menu.addDishes(rice);
		Restaurant restaurant=new Restaurant(menu,"Baati Chokha",true,"Varanasi");
		RestaurantManager.getInstance().addRestaurant(restaurant,2);

		HashMap<String,Integer> cart=new HashMap<>();
		cart.put("Daal",1);
		cart.put("Rice",1);

		Order order1=new Order(customer,restaurant,cart);

		OrderManager.getInstance().createOrder("1",order1);
	}

}
