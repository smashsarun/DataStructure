/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.binarytree;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *
 * @author INT303
 */
class Student {

    int id;
    String name;
    double gpax;

    public Student(int id, String name, double gpax) {
        this.id = id;
        this.name = name;
        this.gpax = gpax;

    }

}

public class NewClass {

    public static void main(String[] args) {
        //testPriorityQueue();
        testPriorityQueue2();
    }

    private static void testPriorityQueue2() {
        PriorityQueue<Student> pq = new PriorityQueue(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.gpax < s2.gpax) {
                    return 1;
                } else if (s1.gpax > s2.gpax) {
                    return -1;
                }
                return 0;
            }
        });
        pq.add(new Student(1001, "A", 2.25));
        pq.add(new Student(1002, "B", 3.25));
        pq.add(new Student(1003, "C", 3.75));
        pq.add(new Student(1004, "D", 1.77));
        pq.add(new Student(1005, "E", 3.58));
        pq.add(new Student(1006, "F", 3.58));
        pq.add(new Student(1007, "G", 2.25));
        for (Student student : pq) {
            System.out.print(student.id + ":"
                    + student.gpax+", ");
        }
        System.out.println("\n");
        while(! pq.isEmpty()) {
            System.out.println(pq.poll().gpax);
        }
    }

    private static void testPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue(20, //annonymous class
                new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Random r = new Random();
        int x;
        for (int i = 0; i < 20; i++) {
            x = r.nextInt(99);
            System.out.print(x + ",");
            pq.offer(x);
        }
        System.out.println("\b\b\n");
        System.out.println("Queue size: " + pq.size());
        System.out.println("Head of queue: " + pq.peek());
        System.out.println(pq);
    }

    private static class YourComparator<T> implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
