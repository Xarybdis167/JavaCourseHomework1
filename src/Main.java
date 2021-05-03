
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.age = "Null";
		instructor.email = "engin.demirog@gmail.com";
		instructor.password = "123123123";
		instructor.ınstructorNumber = "00001";
		instructor.salary = 9999999;
		
	
		Student student = new Student();
		student.id = 2;
		student.firstName = "Emirhan";
		student.lastName = "Yılmaz";
		student.age = "22";
		student.email = "emirhan.yilmaz@gmail.com";
		student.password = "12983771";
		student.studentNumber = "02333";
		student.progressBar = 45; 
		
		UserManager userManager = new UserManager();
		
		User[] users = {instructor, student};
		
		userManager.multipleOperations(users);
		userManager.register(student);
		userManager.login(instructor);
		userManager.logout(student);
		
	}

}
