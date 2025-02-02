package com.innovator.learnit.OOP.s_in_solid.solution;


public class MailboxSettingsService {
	
	/*
	 * By having securityService in a different class from
	 * MailSettingsService, I can use it and at the same time
	 * each class will perform his responsibility without it
	 * getting broken or not working functionally.
	 */
	private SecurityService securityService;
	
	{
		securityService = new SecurityService();
	}

	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (securityService.hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}
	
}