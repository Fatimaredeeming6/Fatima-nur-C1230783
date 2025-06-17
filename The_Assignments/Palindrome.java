import java.util.Scanner;

public class Palindrome {//الاستاذ م شييك
    public static void main(String[] args) {
        Scanner Plain= new Scanner(System.in);
        System.out.println("Enter a word and,Let me tell you weather  it's a Palindrome or not ");
        String word= Plain.nextLine();
        String backword= "";
        for (int i = word.length()-1;i >=0; i--){
            backword+=word.charAt(i);
        }
        if(word.equalsIgnoreCase(backword)){//استعمال ال equalls مع ال ignorecase ييجي!!
            System.out.println(word+" is a palindrom word:)");
        }
        else {
            System.out.println(word+" It is NOT a palindrome word;/");
  }

}
}