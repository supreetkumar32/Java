package practice;

//creating a thread by extending thread class
class MyThread1 extends Thread{
    
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    
    public void run1(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Multithreading12 {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();//start method inbuilt hai java ke andar wo apne according hi run karega run and run1 method ko
    t2.start();

    }
}

