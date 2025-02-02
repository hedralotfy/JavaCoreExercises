package com.innovator.learnit.OOP.s_in_solid.solution;

public class SecurityService {
	
	public boolean hasAccess(User user) {
		if (user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
	}

}
