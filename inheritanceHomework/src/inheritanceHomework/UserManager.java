package inheritanceHomework;

public class UserManager {
	// temel kullanýcý metot classýdýr
	
	//siteye kayýt olma: register
	public void register(User user) {
		//System.out.println(user.getFirstName()+user.getLastName()+" has been registered");
		// override uygulanacak
	}
	
	
	// giriþ yapma: login
	public void login(User user) {
		//System.out.println("Login with " + user.getEmail());
		//override uygulanacak
	}
	
	// çýkýþ yapma: logout
	public void logout(User user) {
		System.out.println("Logouted: "+user.getEmail());
	}
	
	
	// yorum yapma: toComment
	public void toComment(User user,User user2) {
		System.out.println(user2.getFirstName()+" "+user2.getLastName() + "'s post was commented as " + user.getFirstName() + 
				user.getLastName());
	}
	
	
	// kullanýcý bilgilerine ulaþma: getUserInfo
	public void getUserInfo(User user) {
		System.out.println(user.getFirstName()+ 
				"\n" + user.getLastName()+
				"\n" + user.getEmail());
	}
	
	// kullanýcýlarý listeleme: listUsers
	public void listUsers(User... listedUsers) {
		for(User user:listedUsers) {
			System.out.println(user.getFirstName() + "\s" + user.getLastName());
		}
	}
}
