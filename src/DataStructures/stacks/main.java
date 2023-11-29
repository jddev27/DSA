package DataStructures.stacks;

public class main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(4);
        myStack.push(3);
        myStack.push(10);

        System.out.println("---------- Stack After Push-----------");
        myStack.printStack();

        myStack.pop();
        myStack.pop();

        System.out.println("---------- Stack After Pop-----------");
        myStack.printStack();



    }
}
