// Main class
class Queue {
    public static void main(String[] args) {

    }
}

class CustomQueue {
    private int[] data;
    private int front;
    private int rear;

    CustomQueue(int size) {
        this.data = new int[size];
        this.front = 0;
        this.rear = -1;
    }
}