public class Program3 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; ; i++) {
                    buffer.produce(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (;;) {
                    buffer.consume();
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        producer.start();  // Start producer thread
        consumer.start();  // Start consumer thread
    }
}

class SharedBuffer {
    private int buffer;
    private boolean isEmpty = true;

    public synchronized void produce(int data) throws InterruptedException {
        while (!isEmpty) wait();
        buffer = data;
        System.out.println("Produced: " + data);
        isEmpty = false;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (isEmpty) wait();
        System.out.println("Consumed: " + buffer);
        isEmpty = true;
        notify();
    }
}

