import java.util.Iterator;

public class UserManager {

	public void add(User user) {
		System.out.println(user.firstName + " isimli kullan�c� eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " isimli kullan�c� g�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.firstName + " isimli kullan�c� silindi");
	}
	
	public void multipleOperations(User[] users) {
		for(User user : users) {
			add(user);
			update(user);
			delete(user);
		}
	}
	
	public void register(User user) {
		System.out.println("Kay�t ��leminiz ger�ekle�mi�tir");
	}
	
	public void login(User user) {
		System.out.println("Kodlama.io'ya Ho�geldiniz");
	}

	public void logout(User user) {
		System.out.println("Kodlama.io sitesinden ��k�� yapt�n�z. �yi G�nler.");
	}
	
}
