package com.innovator.learnit.OOP.s_in_solid.problem;

public class MailboxSettingsService {

	/*
	 * All places in the program where we used the MailboxSettingsService
	 * to verify user access will be either be broken or work the way 
	 * they weren't expected to work.
	 * 
	 * The solution is to split responsibilities into 2 classes,
	 * MailboxSettingsService only for setting manipulation, while
	 * SecurityService will be in charge of all security questions, 
	 * including access.
	 */
	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}

	public boolean hasAccess(User user) {
		if (user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
		
	}

}


