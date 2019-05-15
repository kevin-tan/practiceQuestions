package java;

import java.crackinginterview.OneStackAsQueue;

public class Driver {

    public static void main(String[] args) {
        OneStackAsQueue<Integer> stackAsQueue = new OneStackAsQueue<>();
        stackAsQueue.add(1);
        stackAsQueue.add(2);
        stackAsQueue.add(3);
        stackAsQueue.add(4);
        stackAsQueue.add(5);
        stackAsQueue.add(6);
        stackAsQueue.add(6);
        System.out.println(stackAsQueue.remove());
        System.out.println(stackAsQueue.remove());
        System.out.println(stackAsQueue.remove());
        System.out.println(stackAsQueue.remove());
        System.out.println(stackAsQueue.remove());
        System.out.println(stackAsQueue.remove());
        System.out.println(stackAsQueue.remove());
    }

}
