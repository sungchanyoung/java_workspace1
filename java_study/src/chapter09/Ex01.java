package chapter09;
abstract class People{
	abstract void work();
}
class Peoples extends People{
	@Override
	void work() {
		System.out.println("경찰은 치안 유지업무를 담당합니다");
	}
	
}
class Family extends People{

	@Override
	void work() {
		System.out.println("가족 구성원 4명입니다");
	}
}
abstract class Animal{
	abstract void makeSound();
	void eat() {
		System.out.println("동물은 먹이를 먹습니다");
	}
}
class Lion extends Animal{

	@Override
	void makeSound() {
		System.out.println("으아아악");
	}
	@Override
	void eat() {
		System.out.println("사자는 고기를 먹습니다");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Peoples ps1 =new Peoples();
		ps1.work();
		Family fa =new Family();
		fa.work();
		Lion lion =new Lion();
		lion.eat();
		lion.makeSound();
	}
}
