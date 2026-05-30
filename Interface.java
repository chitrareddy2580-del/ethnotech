/*

//inheritance

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   
        d.bark();  
    }
}
*/


/*

//multilevel inhertence


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   
        p.bark();  
        p.weep();  
    }
}*/

/*
//abstraction and overridig

abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {         // normal method
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.sound();
        a.sleep();
    }
}*/

/*

//employee management system


class Employee
{
	void salary()
	{
		System.out.println("employee gets salary for work");
	}
}
class Man extends Employee
{
	void id()
	{
		System.out.println("man having the id");
	}
}
class Animal
{
	public static void main(String[]args)
	{
		 Man e=new Man();
		e.salary();
		e.id();
	}
	*/




/*

//Swiggy order


import java.util.Scanner;

abstract class FoodItem {
    String name;
    int price;

    FoodItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    abstract void display();
}

class Biryani extends FoodItem {
    Biryani() {
        super("Biryani", 250);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Pizza extends FoodItem {
    Pizza() {
        super("Pizza", 300);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Burger extends FoodItem {
    Burger() {
        super("Burger", 150);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Dosa extends FoodItem {
    Dosa() {
        super("Dosa", 80);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Idli extends FoodItem {
    Idli() {
        super("Idli", 50);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Noodles extends FoodItem {
    Noodles() {
        super("Noodles", 120);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class FriedRice extends FoodItem {
    FriedRice() {
        super("Fried Rice", 140);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Cake extends FoodItem {
    Cake() {
        super("Cake", 200);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class IceCream extends FoodItem {
    IceCream() {
        super("Ice Cream", 90);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

class Coffee extends FoodItem {
    Coffee() {
        super("Coffee", 60);
    }

    void display() {
        System.out.println(name + " - ₹" + price);
    }
}

public class SwiggyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem[] menu = {
            new Biryani(),
            new Pizza(),
            new Burger(),
            new Dosa(),
            new Idli(),
            new Noodles(),
            new FriedRice(),
            new Cake(),
            new IceCream(),
            new Coffee()
        };

        int totalBill = 0;

        System.out.println("===== SWIGGY MENU =====");

        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + ". ");
            menu[i].display();
        }

        System.out.print("\nHow many different items do you want to order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter item number: ");
            int choice = sc.nextInt();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            int amount = menu[choice - 1].price * qty;
            totalBill += amount;

            System.out.println(menu[choice - 1].name +" x " + qty +" = ₹" + amount);
        }

        System.out.println("\n===== BILL =====");
        System.out.println("Total Amount = ₹" + totalBill);
        System.out.println("Order Placed Successfully!");
    }
}
*/



/*interface Camera
{
	volid click();
}
interface Musicplayer
{
	void play();
}
class Mobile implements Camer,Musicplayer
{
	public void click()
	{
		System.out.println(x:"clicking a photo");
	}
	public void play()
	{
		System.ot.println(x:"playing music");
	}
}
public class interface{
	public static void main(String[]args)
	{
		Mobile myPhone=new Mobile();
		myPhone.click();
		myphone.play();
	}
}


package Interface;
interfece Notifications
{
	void sendMessages(String message);
}
class Mobilenotifivation implements Notifications{
	public void sendMessages(String messages);
	{
		System.out.println("send mobile notifications");
	}
}
class Whatsappnotifications implements Notifications{
	public class void sendMessages(String messages);
	{
		System.out.println("sending whatsapp notifications");
	}
}
class Notify
{
	public static void main(String[]args)
	{
		Mobilenotifications n=new Mobilenotification();
		Whatsappnotification m=new Whatsappnotifications();
		n.sendMessages();
		m.sendMessages();
	}
}




import java.util.*;
class Uber
{
	void fare(int amount)
	{
		System.out.println("uber fare:"+amount);
	}
}
class Auto extends Uber
{
	
	@Override
	
	void fare(int amount)
	{
		if(amount<=120)
		{
			System.out.println("auto fare:"+amount);
		}
	}
}
class Car extends Uber{
	
	@Override
	
	void fare(int amount)
	{
		if(amount<=180)
		{
			System.out.println("car fare:"+amount);
		}
	}
}
class Bike extends Uber{
	
	@Override
	
	void fare(int amount)
	{
		if(amount<=80)
			System.out.println("bike fare:"+amount);
		
	}
}
class Uberclass{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the uber");
		int amount=sc.nextInt();
		Uber a=new Auto();
		Uber c=new Car();
		Uber b=new Bike();
		a.fare(amount);
		b.fare(amount);
		c.fare(amount);
	}
}




*/
