
// Main Class
// First in last out
// Last in first out
class Stack {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack(10);
        cs.push(3);
        cs.push(5);
//        cs.push(7);
//        cs.push(10);
//        cs.push(19);
//        cs.push(30);
//        cs.push(1);
//        cs.push(34);
//        cs.push(45);
//        cs.push(60);
//        cs.push(11);

        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
    }


}

// Custom Stack implementation class
class CustomStack {
    //just creating the reference
    public int[] data;
    public static final int DEFAULT_SIZE = 15;

    /*
    * pointer to track the index of each element in the array
    */
    protected int pointer = -1;

    /*
     * Constructor with argument as size to initialize array of that particular size
     */
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
            /*
            * pointer incremented to 0. so the first element inserted will be at 0th position
            * and the next element will be at 1st position as it is incremented everytime and inserted in the array
            */
            pointer++;
            data[pointer] = element;
            return true;
        }
    }

    /*
    * first checking whether the array is empty or not
    * if it is not empty then popping out the last most inserted element in the array and then decrementing the pointer
    */
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