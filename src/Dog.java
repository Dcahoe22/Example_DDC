
public class Dog {
	
	//instance fields
	private String name;
	private int age;
	
	//Constructors
	public Dog() {
		name = "null";
		age = 0;
	}//Empty-arg constructor
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}//Preferred constructor
	
	public String bark() {
		return "Bark, bark";
	}//Bark Method
	
	
	
	//Getters/Setters/toString
	public String getName() {
		return name;
	}//GetName
	public void setName(String name) {
		this.name = name;
	}//SetName
	
	public int getAge() {
		return age;
	}//GetAge
	public void setAge(int age) {
		this.age = age;
	}//SetAge

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}//toString
	
	
	
	
	
}//Class Dog
