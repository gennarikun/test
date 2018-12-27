
public class Test {

	public static void main(String[]args){
		Person2 jiro=new Person2();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="09012345678";
		jiro.address="東京";


		Person2 hanako=new Person2();
		hanako.name="鈴木花子";
		hanako.age=18;
		hanako.phoneNumber="08012345678";
		hanako.address="千葉";



		Person2 ryosei=new Person2();
		ryosei.name="楢崎涼生";
		ryosei.age=24;
		ryosei.phoneNumber="07012345678";
		ryosei.address="埼玉";


		Person2 aibo=new Person2();
		aibo.name="aibo";


		Person2 asimo=new Person2();
		asimo.name="asimo";

		Person2 pepper=new Person2();
		pepper.name="pepper";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();


		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		System.out.println(ryosei.name);
		System.out.println(ryosei.age);
		System.out.println(ryosei.phoneNumber);
		System.out.println(ryosei.address);
		ryosei.talk();
		ryosei.walk();
		ryosei.run();

		aibo.talk();
		aibo.walk();
		aibo.run();


		asimo.talk();
		asimo.walk();
		asimo.run();


		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
