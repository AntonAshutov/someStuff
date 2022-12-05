import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int indicesOfStartsAndEndsOfNumbers[] =new int[100]; //каждое первое число массива хранит индекс начала числа, каждое второе - индекс его конца.
        boolean inNumber = false;
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (Character.isDigit(text.charAt(i)) && !inNumber){
                inNumber = true;
                indicesOfStartsAndEndsOfNumbers[count] = i;
                count++;
            } else if (!Character.isDigit(text.charAt(i)) && inNumber) {
                inNumber = false;
                indicesOfStartsAndEndsOfNumbers[count] = i;
                count++;
            }
        }
        for (int i = 0; i < count; i++){
            System.out.println(indicesOfStartsAndEndsOfNumbers[i]);
        }
        System.out.println("");

        int sum = 0;
        int number;
        for (int i = 0; i < count; i++){
            if ((i % 2) == 0){
                System.out.println(indicesOfStartsAndEndsOfNumbers[i]);
                number = Integer.parseInt(text.substring(indicesOfStartsAndEndsOfNumbers[i],indicesOfStartsAndEndsOfNumbers[i+1]));
                sum += number;
                System.out.println(sum);
            }
        }
        System.out.println("\n" + sum);



    }
}