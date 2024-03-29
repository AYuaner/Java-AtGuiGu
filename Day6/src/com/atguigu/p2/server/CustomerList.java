package com.atguigu.p2.server;

import com.atguigu.p2.bean.Customer;

/**
 * 
 * @author 10939
 * @description: 为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
 * 供CustomerView调用
 * @date: 2021年3月20日
 *
 */

public class CustomerList {
	//成员变量
	private Customer[] customers;//用来保存客户对象的数组
	private int total = 0;//记录已保存客户对象的数量
	
	//构造器
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	//方法
	/**
	 * 将制定的客户添加到数组中
	 * 添加成功：true，添加失败：false
	 */
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}
	/**
	 * @Description 修改指定索引位置的客户信息
	 * @param index
	 * @param cust
	 * @return true：修改成功 false：修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/**
	 * @Description 删除指定索引位置上的客户
	 * @param index
	 * @return true：删除成果 false：删除失败
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		for (int i = index;i < total - 1;i++) {
			customers[i] = customers[i + 1];
		}
		customers[--total] = null;
		return true;
	}
	/**
	 * @Description 获取所有的客户信息
	 * @return
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for (int i = 0;i < total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	 * @Description 获取指定索引位置上的客户
	 * @param index
	 * @return 如果找到元素，则返回；否则返回null
	 */
	public Customer getCunstomer(int index){
		if (index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	/**
	 * @Description 获取存储的客户的数量
	 * @return
	 */
	public int getTotal() {
		return total;//
	}
}
