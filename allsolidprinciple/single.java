package wiprofirst.allsolidprinciple;
class Student{
	String name;
	int marks;
	Student(String name,int marks){
		this.name= name;
		this.marks = marks;
	}
}
class StudentPrint{
	void details(Student student){
		System.out.println("Name: " + student.name);
		System.out.println("marks : " + student.marks);
	}
}
public class single {
public static void main(String[] args) {
	Student ss = new Student("Amit",85);
	StudentPrint print = new StudentPrint();
	print.details(ss);
}
}
