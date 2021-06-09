package basics;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hyderabad";
		System.out.println("String Length : "+str.length());
		System.out.println("String 0 index value " + str.charAt(0));
		System.out.println("To Get String Character Index Value : "+str.indexOf('d'));
		System.out.println("To check any word : "+str.contains("bad"));
		System.out.println("Substring : "+str.subSequence(6, 9));
		System.out.println("To Uppercase : "+str.toUpperCase());
		System.out.println("To Lowercase : "+str.toLowerCase());
		System.out.println(str.replace('H', 'Z'));

	}

}
