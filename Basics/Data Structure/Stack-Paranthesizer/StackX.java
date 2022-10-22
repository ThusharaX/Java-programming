package Stack;

public class StackX {
	private char[] data; //stack array
	private int top;  //top of the stack
	private int size; //size of stack array

    public StackX(int size){
        this.size = size;
        data = new char[size];
        top = -1;
    }

    //push method
    public boolean push(char element){
        if (top < size - 1) {
            data[++top] = element;
            return true;
        }

        return false;

    }

    public char pop(){
        if (top != -1) {
            return data[top--];
        }

        return ' ';
    }

    public char peek(){
        if (top != -1) {
            return data[top];
        }

        return ' ';
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        }

        return false;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }

        return false;
    }
}
