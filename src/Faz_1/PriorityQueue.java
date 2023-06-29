package Faz_1;

public class PriorityQueue {
    class Node {
        private BinaryHuffmanNode value;
        private Node next = null;

        public Node(BinaryHuffmanNode value) {
            this.value = value;
        }

        public BinaryHuffmanNode getValue() {
            return value;
        }
    }

    private Node head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public BinaryHuffmanNode pop() {
        if (this.head != null) {
            Node result = this.head;
            this.head = head.next;
            this.size--;
            return result.value;
        } else {
            return null;
        }
    }

    public void push(BinaryHuffmanNode huffmanNode) {
        Node node = new Node(huffmanNode);
        Node current = this.head;
        if (this.head == null) {
            this.head = node;
        } else if (this.head.getValue().getF() > huffmanNode.getF()) {
            node.next = this.head;
            this.head = node;
        } else {
            while (current.next != null && current.next.getValue().getF() < huffmanNode.getF()) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        this.size++;
    }
}
