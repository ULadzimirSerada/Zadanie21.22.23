import java.util.StringTokenizer;
import java.io.EOFException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Задание 23
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.*/
public class Zadanie23 {

        public static void main(String[] args) {
            String regex = "(<p .+?>)(.+?</p>)";
            String str="<p>sdfdf weffef errgegre </p> gghh <p id=\"p1\">ffg gggbgf</p>";
            System.out.println(str.replaceAll(regex, "<p>$2"));

            }
        }




