package one.org;

public class String_word {
	public static void main(String[] args) {
		String a=" Hai iam prabhu ";
		String[] split = a.split("");
		for(int i=split.length-1; i>=0; i--)
		{
			System.out.print(split[i]);
		}
	}

	
}
