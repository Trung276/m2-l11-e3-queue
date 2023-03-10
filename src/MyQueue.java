public class MyQueue {
    Node front;
    Node rear;
    public MyQueue() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int data) {
        Node temp = new Node(data);
        if(this.front == null && this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }
    public Node deQueue() {
        if (this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null)
            this.rear = null;
        return temp;
    }
}
