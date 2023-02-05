/*Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список. */


import java.util.LinkedList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> random_list = new LinkedList<>();
        for(int j = 0; j < 10; j++){
            Random rnd = new Random();
            // random_list[j] = rnd.nextInt(99);}
            random_list.add(rnd.nextInt(99));
        }
        System.out.println(random_list);
        System.out.println(revers(random_list));
    }

    private static LinkedList<Integer> revers(LinkedList<Integer> random_list) {
        for (int i = 1; i < random_list.size(); i++) {
            random_list.addFirst(random_list.remove(i));
        }
        return random_list;
    }
}

