package com.annotation.role;

import java.lang.reflect.Method;

public class SecureService {
	@RoleAllowed("ADMIN")
	public void delete() {
		System.out.println("Deleted");
	}

	public static void main(String[] args) throws Exception {
		String role = "USER";
		Method m = SecureService.class.getMethod("delete");
		RoleAllowed r = m.getAnnotation(RoleAllowed.class);
		if (role.equals(r.value()))
			m.invoke(new SecureService());
		else
			System.out.println("Access Denied!");
	}
}
