package inheritance;
class Person{
	protected String name;
	Person(String name){
		System.out.println("person is "+name);
	}
	 String name(String name) {
		 this.name=name;
		 return name;
		 
		 }
	 	void walk() {
	 		System.out.println(name+" is walking");
	 }
	 	void eat() {
	 		System.out.println(name+" is eating");
	 	}
}
class Student extends Person{
	Student(String name) {
		super(name);
		 
	}

	void study() {
		System.out.println(name +" is studying");
	}
}
class Teacher extends Person{
	Teacher(String name){
		super(name);
		System.out.println("teacher");
	}
	void eat() {
		super.walk();
		System.out.println("Eat");
	}
	void teach() {
		System.out.println(name+ " is teaching");
	}
}
class Singer extends Person {
	Singer(String name) {
		super(name);
	}

	void sing() {
		System.out.println(name+" is singing");
	}
}

public class Inheritance {

	public static void main(String[] args) {
//		Student s=new Student();
//		System.out.println(s.name("Deva"));
//		s.walk();
//		s.eat();
//		s.study();
		
		Teacher t=new Teacher("David");
//		t.name="Teacher";
//		t.walk();
//		t.eat();
//		t.teach();
// 		Singer si=new Singer();
//		si.name="singer";
//		si.walk();
//		si.eat();
//		si.sing();
	}

}
