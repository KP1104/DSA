
// Main Class
// First in last out
// Last in first out
class Stack {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack(10);
        cs.push(3);
        cs.push(5);
        cs.push(7);
        cs.push(10);
        cs.push(19);
        cs.push(30);
        cs.push(1);
        cs.push(34);
        cs.push(45);
        cs.push(60);
        cs.push(11);

        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
    }


}

// Custom Stack implementation class
class CustomStack {
    //just creating the reference
    public int[] data;
    public static final int DEFAULT_SIZE = 15;

    protected int pointer = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }

//    public CustomStack() {
//        this(DEFAULT_SIZE);
//    }

    public boolean push(int element){
        if(isFull()) {
            System.out.println("Stack is full!!!" );
            return false;
        } else {
            pointer++;
            data[pointer] = element;
            return true;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!!!");
            return -1;
        }
        return data[pointer--];
    }


    // Method to check if the data array is full or not
    public boolean isFull() {
        return pointer == data.length -1;
    }

    // Method to check if the data array is empty or not
    public boolean isEmpty() {
        return pointer == -1;
    }
}