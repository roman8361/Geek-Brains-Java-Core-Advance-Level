package ru.kravchenko.se;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Solution to lesson 01
 *
 */
public class App 
{
    public static void main( String[] args )
    {

          }

    /**
     *  Задание 1.  Написать метод, который меняет два элемента массива местами.
     *  (массив может быть любого ссылочного типа);
     * @param o - массив объектов
     * @param x - индеес элемента для обмена
     * @param y - индеес элемента для обмена
     */

    public static void changePositionArrays (Object[] o, int x, int y){
        Object tmp = o[x];
        o[x] = o[y];
        o[y] = tmp;
    }

    /**
     * Задание 2. Написать метод, который преобразует массив в ArrayList;
     * @param arr
     * @param <T> любой тип
     * @return ArrayList
     */
    public static <T> ArrayList<T> arrayList (T[] arr) {
        ArrayList <T> result = new ArrayList<>();
        Collections.addAll(result, arr); // используется стандартная библиотека
        return result;
    }

}


