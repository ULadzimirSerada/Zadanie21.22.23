/*  Задание 21 Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/
public class Zadanie21 {

    public static void main(String[] args) {
        String str1= "Вот ";
         String str2= "вляпался ";
          String str3= "попробуй ";
           String str4= "разберись";
            String strAll = str1 + str2 + str3 + str4;
              System.out.println(strAll);

        StringBuilder sb = new StringBuilder("Hello");
            sb.append(" my");//sb.append(" my").sb.append(" frend");
             sb.append(" frend");
              System.out.println(sb.toString());

        StringBuffer sb1 = new StringBuffer("Hello");
          sb1.append(" my");
            sb1.append(" frend");
              System.out.println(sb1.toString());
    }
}
