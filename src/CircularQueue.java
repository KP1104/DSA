class Main {
    public static void main(String[] args) {
        CircularQueue cirq = new CircularQueue(5);

        cirq.add(2);
        cirq.add(4);
        cirq.add(6);
        cirq.add(8);
        cirq.add(10);


        cirq.display();

        cirq.remove();

        cirq.display();

        cirq.add(12);

        cirq.display();

        cirq.remove();
        cirq.add(14);

        cirq.display();

    }
}

class CircularQueue {

    public int[] data;
    public static final int DEFAULT_SIZE = 10;

    int front = 0;
    int end = 0;
    int size = 0;

    CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean add(int element) {
        if(isFull()) {
            System.out.println("Circular Queue is full!!!");
            return false;
        }
        data[end++] = element;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty!!!");
        }
        int remove = data[front++];
        front = front % data.length;
        size--;
        return remove;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty!!!");
        }
        int i = front;
        do {
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        } while (i != end); {
            System.out.println("-----");
        };
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}