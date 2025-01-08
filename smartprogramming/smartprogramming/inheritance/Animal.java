package smartprogramming.inheritance;
/* class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
} */

// inheritance example mostly used in industry
class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}