package org.example.queues;

import org.example.exercises.Person;

import java.util.LinkedList;
import java.util.Queue;

public class QueueService {
    public static Queue<Person> create(){
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("12345","0987"));
        queue.add(new Person("1444","666"));
        queue.add(new Person("7777","334"));
        System.out.println(queue);
        Person p1 =  queue.remove();
        System.out.println("Removed head: " + p1);
        Person currentHead = queue.peek();
        System.out.println("Current head: " + currentHead);
        Person p2 = queue.poll();
        System.out.println("Removed head with poll : " + p2);

        System.out.println("Size: " + queue.size());
        return queue;
    }
}
