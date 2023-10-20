B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)



import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        int integerEquivalent = 0;
        
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(romanNumeral.charAt(i));
            integerEquivalent += (currentValue < prevValue) ? -currentValue : currentValue;
            prevValue = currentValue;
        }

        System.out.println(romanNumeral + " = " + integerEquivalent);
    }
}
