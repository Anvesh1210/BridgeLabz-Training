package com.collections.map.groupobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjectsDriver {
	public static void main(String[] args) {
		Department hr = new Department("HR");
		Department it = new Department("IT");
		
		Employee employee1 = new Employee("Alice", hr);
		Employee employee2 = new Employee("Bob", it);
		Employee employee3 = new Employee("Carol", hr);
		
		List<Employee> employees = new ArrayList<Employee>(Arrays.asList(employee1,employee2,employee3));
		Map<Department, List<Employee>> map = new HashMap<>();
		
		for(Employee e:employees) {
			List<Employee> li = map.getOrDefault(e.getDepartment(), new ArrayList<Employee>());
			li.add(e);
			map.put(e.getDepartment(), li);
		}
		
		System.out.println(map);
	}
}
