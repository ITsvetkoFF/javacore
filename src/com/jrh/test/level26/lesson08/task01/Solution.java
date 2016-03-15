package com.javarush.test.level26.lesson08.task01;

/* Вежливость - это искусственно созданное хорошее настроение.
В классе Solution создайте public static класс IntegerHolder.
IntegerHolder должен быть для типа int, быть нитебезопасным и изменяемым.
В этом классе должны быть два public метода get и set
*/
public class Solution
{
    public static void main(String[] args)
    {
    }

    public static class IntegerHolder
    {
        private volatile int a;

        public synchronized int get()
        {
            return a;
        }
        public synchronized void set(int a)
        {
            this.a = a;
        }
    }
}
