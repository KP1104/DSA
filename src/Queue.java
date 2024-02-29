// Main class
class Queue {
    public static void main(String[] args) {
        CustomQueue cq = new CustomQueue(5);

        cq.enqueue(11);
        cq.enqueue(7);
        cq.enqueue(14);
        cq.enqueue(21);
        cq.enqueue(18);

        cq.dequeue();
        cq.display();
        System.out.println(cq.peek());
    }
}

class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    /*
    * just using one pointer at the end rather than using front and tail
    */
    int endPointer = 0;

    CustomQueue(int size) {
        this.data = new int[size];
    }

    /*
    * Insert element to the last and then increasing the end pointer
    */
    public boolean enqueue(int item) {
        if(isFull()) {
            System.out.println("Queue is full!!!");
            return false;
        }
        data[endPointer++] = item;
        return true;
    }

    /*
    * Using a different approach to remove the element,
    * where the first element is removed and then rest of the elements,
    * are shifted to the left i.e. decreasing the value of their index by 1
    */
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty!!!");
        }
        int removedItem = data[0];

        for (int i = 1; i < endPointer; i++) {
            // condition for shifting the index of the element by -1
            data[i - 1] = data[i];
        }
        endPointer--;
        return removedItem;

    }

    /*
    * Peek returns the first element of the queue
    */
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty!!!");
        }
        return data[0];
    }

    public boolean isEmpty() {
        return endPointer == 0;
    }

    public boolean isFull() {
        return endPointer == data.length ;
    }

    public void display() {
        for (int i = 0; i < endPointer; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("------");
    }
}