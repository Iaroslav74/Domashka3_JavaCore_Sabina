package Domashka3_JavaCore_Sabina;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Task1
        Integer arr1[] = {21, 22, 23, 24, 25, 26, 27};
        String arr2[] = {"Вася", "Зина", "Лена", "Иван Иваныч"} ;
        swap(arr1,2,6);
        swap(arr2,1,3);
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задача 3");
        System.out.println("'G' - addFruit: ");
        or.addFruit(new Orange(),5);
        or1.addFruit(new Orange(),16);
        ap.addFruit(new Apple(),7);
        ap1.addFruit(new Apple(),13);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("'E' - compare(): ");
        System.out.println("Box 1 equals box 3: "+or.compare(ap));
        System.out.println("Box 2 equals box 4: "+or1.compare(ap1));
        System.out.println("'F' - pourTo(): ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("'D' - getWeight(): ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());

        System.out.println("Решение домашнего задания по курсу Java Core. Урок 3 : "+"\n///////////////////////////////////////////////////////////");


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задача 1: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены: "+Arrays.toString(arr)+"\n________________________________________________________");
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Задача 2 и результат преобразования : "+alt+"\n__________________________________________________________");
    }
}
