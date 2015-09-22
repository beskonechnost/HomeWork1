package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String name=d.readLine();
        int c1=Integer.parseInt(d.readLine());
        int c2=Integer.parseInt(d.readLine());
        System.out.println(name+" получает "+c1+" через "+c2+" лет.");

    }
}