import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrSplit = str.split(" ");
        if (arrSplit.length>3 || arrSplit.length<2){throw new IOException("т.к. строка не является математической операцией");}
        String num_1 = arrSplit[0];
        String symbol = arrSplit[1];
        String num_2 = arrSplit[2];
        String arabic = "0 1 2 3 4 5 6 7 8 9 10";
        boolean value_1 = arabic.contains(num_1);
        boolean value_2 = arabic.contains(num_2);
        String roman = "I II III IV V VI VII VIII IX X";
        boolean value_3 = roman.contains(num_1);
        boolean value_4 = roman.contains(num_2);
        String simbols = "+-*/";
        boolean value_5 = simbols.contains(symbol);
        while (true){
            if (((value_1 == false && value_2 == false) || (value_3 == false && value_4 == false))&& value_5==false){throw new IOException("т.к. строка не является математической операцией");}
            if (((value_1 == false && value_2 == true)||(value_1 == true && value_2 == false)) || ((value_3 == true && value_4 == false)||(value_3 == false && value_4 == true)))
            {throw new IOException("т.к. используются одновременно разные системы счисления");}
            break;}
        if (value_1 == true && value_2 == true){
            int num1 = Integer.parseInt(num_1);
            int num2 = Integer.parseInt(num_2);
            System.out.println(operation(num1, num2, symbol));};
        if (value_3 == true && value_4 == true){
            int num1 = 0;
            int num2 = 0;
            if (num_1.equals("I")) {num1 = 1;}
            if (num_1.equals("II")) {num1 = 2;}
            if (num_1.equals("III")) {num1 = 3;}
            if (num_1.equals("IV")) {num1 = 4;}
            if (num_1.equals("V")) {num1 = 5;}
            if (num_1.equals("VI")) {num1 = 6;}
            if (num_1.equals("VII")) {num1 = 7;}
            if (num_1.equals("VIII")) {num1 = 8;}
            if (num_1.equals("IX")) {num1 = 9;}
            if (num_1.equals("X")) {num1 = 10;}
            if (num_2.equals("I")) {num2 = 1;}
            if (num_2.equals("II")) {num2 = 2;}
            if (num_2.equals("III")) {num2 = 3;}
            if (num_2.equals("IV")) {num2 = 4;}
            if (num_2.equals("V")) {num2 = 5;}
            if (num_2.equals("VI")) {num2 = 6;}
            if (num_2.equals("VII")) {num2 = 7;}
            if (num_2.equals("VIII")) {num2 = 8;}
            if (num_2.equals("IX")) {num2 = 9;}
            if (num_2.equals("X")) {num2 = 10;}
            int result = operation(num1, num2, symbol);
            if (result<=0){throw new IOException("т.к. в римской системе нет отрицательных чисел");}
            if (result == 100) {System.out.print("C");}
            if (result < 100) {
                int result1 = result % 10;
                int result2 = result / 10;
                String result_1 = "";
                String result_2 = "";
                if (result1 == 1) {result_1 = "I";}
                if (result1 == 2) {result_1 = "II";}
                if (result1 == 3) {result_1 = "III";}
                if (result1 == 4) {result_1 = "IV";}
                if (result1 == 5) {result_1 = "V";}
                if (result1 == 6) {result_1 = "VI";}
                if (result1 == 7) {result_1 = "VII";}
                if (result1 == 8) {result_1 = "VII";}
                if (result1 == 9) {result_1 = "IX";}
                if (result2 == 1) {result_2 = "X";}
                if (result >= 10) {
                    if (result2 == 2) {result_2 = "XX";}
                    if (result2 == 3) {result_2 = "XXX";}
                    if (result2 == 4) {result_2 = "XL";}
                    if (result2 == 5) {result_2 = "L";}
                    if (result2 == 6) {result_2 = "LX";}
                    if (result2 == 7) {result_2 = "LXX";}
                    if (result2 == 8) {result_2 = "LXXX";}
                    if (result2 == 9) {result_2 = "XC";}}
                System.out.println(result_2 + result_1);}}}
    public static int operation(int num1, int num2, String symbol){
        if (symbol.equals("+")) {return  add(num1, num2);}
        if (symbol.equals("-")) {return  sub(num1, num2);}
        if (symbol.equals("*")) {return  mul(num1, num2);}
        if (symbol.equals("/")) {return  div(num1, num2);}
        return num1;}
    public static int add(int num1, int num2) {return num1+num2;}
    public static int sub(int num1, int num2) {return num1-num2;}
    public static int mul(int num1, int num2) {return num1*num2;}
    public static int div(int num1, int num2) {return num1/num2;}}