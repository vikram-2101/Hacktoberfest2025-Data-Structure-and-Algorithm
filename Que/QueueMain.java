package Que;

public class QueueMain {

    public static void main(String[] args) throws Exception{
      //  CustomQue queue = new CustomQue();
        CircularQueue queue = new CircularQueue();
        queue.insert(4);
         queue.insert(4);
        queue.insert(4);
       queue.insert(4);
         queue.insert(4);
         queue.insert(4);
         queue.display();

         System.out.println(queue.remove());
         queue.insert(23);

         System.out.println(queue.remove());
         queue.insert(8);
         queue.display();
    }
}
