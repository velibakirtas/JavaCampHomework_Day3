package inheritanceHomework;

public class UserManager {

	public void register(User user) {

	}
	
	
	public void login(User user) {

	}
	

	public void logout(User user) {
		System.out.println("Logouted: "+user.getEmail());
	}
	
	
	public void toComment(User user,User user2) {
		System.out.println(user2.getFirstName()+" "+user2.getLastName() + "'s post was commented as " + user.getFirstName() + 
				user.getLastName());
	}
	

	public void getUserInfo(User user) {
		System.out.println(user.getFirstName()+ 
				"\n" + user.getLastName()+
				"\n" + user.getEmail());
	}
	
	public void listUsers(User... listedUsers) {
		for(User user:listedUsers) {
			System.out.println(user.getFirstName() + "\s" + user.getLastName());
		}
	}
}
