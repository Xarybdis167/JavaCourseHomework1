import java.util.Iterator;

public class UserManager {

	public void add(User user) {
		System.out.println(user.firstName + " isimli kullanýcý eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " isimli kullanýcý güncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.firstName + " isimli kullanýcý silindi");
	}
	
	public void multipleOperations(User[] users) {
		for(User user : users) {
			add(user);
			update(user);
			delete(user);
		}
	}
	
	public void register(User user) {
		System.out.println("Kayýt Ýþleminiz gerçekleþmiþtir");
	}
	
	public void login(User user) {
		System.out.println("Kodlama.io'ya Hoþgeldiniz");
	}

	public void logout(User user) {
		System.out.println("Kodlama.io sitesinden çýkýþ yaptýnýz. Ýyi Günler.");
	}
	
}
