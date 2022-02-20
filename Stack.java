import java.util.Scanner;

class Stack
{
    static Scanner sc = new Scanner(System.in);
    static int stack[],top=-1;
    static int size;
    static
    {
        Stack.create();
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Stack function");
        int choice, item;
        String[] operations = {"Push", "Pop", "Peek", "Traverse", "Quit"};
        while (true) {
            for (int i = 1; i <= 4; i++) {
                System.out.println(i + "." + operations[i - 1]);
            }
            System.out.print("Enter your choice:");
            choice = Stack.sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push :");
                    item = sc.nextInt();
                    push(item);
                    break;

                case 2:
                    item = pop();
                    if (item == 0) {
                        System.out.println("Stack underflow");
                    } else {
                        System.out.println("Popped item: " + item);
                    }
                    break;

                case 3:
                    item = peek();
                    if (item == 0) {
                        System.out.println("Stack underflow");
                    } else {
                        System.out.println("Peeked item: " + item);
                    }
                    break;

                case 4:
                    traverse();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    static boolean isFull()
    {
        if(top == size-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void create()
    {
        System.out.print("Enter the size of the stack:");
        size = Stack.sc.nextInt();
        Stack.stack = new int[size];
        System.out.println("Stack created with the size of "+size+" for the operations");
    }

    static void push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack overflow");
        }
        else{
            Stack.stack[++top] = item;
        }
    }

    static int pop()
    {
        if(isEmpty())
        {
//            System.out.println("Stack is Underflow no elements to delete");
            return 0;
        }
        else{
            return Stack.stack[top--];
        }
    }
    static boolean isEmpty()
    {
        if(top == -1){
            return true;
        }
        else
        {
            return false;
        }
    }
    static int peek()
    {
        if(isEmpty())
        {
//            System.out.println("Stack is Underflow no elements to delete");
            return 0;
        }
        else{
            return Stack.stack[top];
        }
    }
    static void traverse()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty\n");
        }
        else
        {
            System.out.println("The stack contains the elements in it as follows:");
            for(int i = top; i>=0; i--)
            {
                System.out.println(stack[i]);
            }
        }
    }


}