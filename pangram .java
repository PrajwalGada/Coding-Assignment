
C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
from a-z)

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        Set<Character> alphabetSet = new HashSet<>();
        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        boolean isPangram = alphabetSet.size() == 26;

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
	    }
	}
}
