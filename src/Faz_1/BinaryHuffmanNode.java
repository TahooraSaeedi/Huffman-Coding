package Faz_1;

public class BinaryHuffmanNode implements Comparable<BinaryHuffmanNode> {
    private char c = '*';
    private int f = 0;
    private BinaryHuffmanNode left = null;
    private BinaryHuffmanNode right = null;

    public BinaryHuffmanNode(char c, int f) {
        this.c = c;
        this.f = f;
    }

    public char getC() {
        return c;
    }

    public int getF() {
        return f;
    }

    public BinaryHuffmanNode getLeft() {
        return left;
    }

    public void setLeft(BinaryHuffmanNode left) {
        this.left = left;
    }

    public BinaryHuffmanNode getRight() {
        return right;
    }

    public void setRight(BinaryHuffmanNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(BinaryHuffmanNode o) {
        return Integer.compare(this.f, o.f);
    }
}
