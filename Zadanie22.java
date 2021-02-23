import java.util.StringTokenizer;
import java.io.EOFException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Задание 22
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.*/
public class Zadanie22 {

        public static void main(String[] args) {
            String str = "0x5DCA  0X55VV67 0dFF76 0X0AA";
               Pattern pattern = Pattern.compile("0x\\p{XDigit}+|0X\\p{XDigit}+");//\p{XDigit}	A hexadecimal digit: [0-9a-fA-F]
               Matcher matcher = pattern.matcher(str);
             while(matcher.find()){
                System.out.println(matcher.group()) ;         
            }
        }
    }



