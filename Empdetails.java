package com.subodh.record;

public record Empdetails() {

	public static void main(String[] args) {
		Employee emp=new Employee(1);
		System.out.println(emp);

	}

}
