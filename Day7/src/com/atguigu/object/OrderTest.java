package com.atguigu.object;

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order(1001, "AA");
		Order order2 = new Order(1001, "AA");
		Order order3 = new Order(1002, "AA");
		Order order4 = new Order(1001, "BB");

		System.out.println(order1.equals(order2));// true
		System.out.println(order1.equals(order3));// false
		System.out.println(order1.equals(order4));// false
	}
}

class Order {
	// 成员变量
	private int orderId;
	private String orderName;

	// 构造器
	public Order(int orderId, String orderName) {
		this.orderId = orderId;
		this.orderName = orderName;
	}

	// 方法
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Order other = (Order) obj;
//			if (orderId != other.orderId)
//				return false;
//			if (orderName == null) {
//				if (other.orderName != null)
//					return false;
//			} else if (!orderName.equals(other.orderName))
//				return false;
//			return true;
//		}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Order) {
			Order other = (Order) obj;
			return this.orderId == other.orderId && this.orderName.equals(other.orderName);
		} else
			return false;
	}

}
