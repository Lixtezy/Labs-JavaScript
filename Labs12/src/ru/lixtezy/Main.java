package ru.lixtezy;

import java.io.IOException;
import java.util.*;

public class Main {

    public static <K, V> void main(String[] args) throws IOException {
        System.out.println("Ex1");
        SearchFileStory frequencyWords = new SearchFileStory();
        String freqName="src/ru/lixtezy/file1.txt";
        frequencyWords.countWords(freqName);

        System.out.println("Ex2");
        Task2 secondTask= new Task2();
        secondTask.collectNoDublicates();

        System.out.println("Ex3");
        Task3();

        System.out.println("Ex4");
        Task4();

        System.out.println("Ex5");
        Task5 fifthTask = new Task5();
        String[] myArray = new String[]{"Apple", "Pen","Pineapple","Apple","Pen"};
        System.out.print(fifthTask.countValues(myArray));
    }

    public static void Task3() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void Task4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the player: ");
        String name= sc.nextLine();
        User user =new User(name);
        Map<User, Integer> map  = new HashMap<>();
        User user1=new User("Антон");
        User user2=new User("Андрей");
        User user3=new User("Сергей");
        User user4=new User("Айрисфиль");
        User user5=new User("Бегемот");
        map.put(user1, 1);
        map.put(user2, 2);
        map.put(user3, 3);
        map.put(user4, 4);
        map.put(user5, 5);

        final int min = 100;
        final int max = 1000;
        int counts= user.getRandom(min, max);
        User key = new User(name);
        if(key.getName().equals(name)){
            System.out.print("Player:" +" "+ user.getName()+" "+ "goals:"+" "+ counts + "\n");
        }
        else{
            System.out.println("Игрок не существует\n");
        }
    }
}

