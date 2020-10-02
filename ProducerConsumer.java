class Q{
    int n;
   
    boolean available=false;
    synchronized int get(){
        while(available == false){
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumer :"+n);
        available = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        while(available == true){
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Producer :"+n);
        available = true;
        notify();
        
    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this);
        t.start();
    }
    
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
            System.out.println(q.n);
            try {
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        
        Thread t = new Thread(this);
        t.start();
    }
    
    public void run(){
        
        while(true){
            q.get();
            try {
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class ProducerConsumer {
 public static void main(String a[]){
     Q q = new Q();
     q.n=0;
     Producer p = new Producer(q);
     Consumer c = new Consumer(q);
 }    
}
