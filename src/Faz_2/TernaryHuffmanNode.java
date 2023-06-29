package Faz_2;

public class TernaryHuffmanNode implements Comparable<TernaryHuffmanNode> {
    private char c = '*';
    private int f = 0;
    private TernaryHuffmanNode left = null;
    private TernaryHuffmanNode middle = null;
    private TernaryHuffmanNode right = null;

    public TernaryHuffmanNode(char c, int f) {
        this.c = c;
        this.f = f;
    }

    public char getC() {
        return c;
    }

    public int getF() {
        return f;
    }

    public TernaryHuffmanNode getLeft() {
        return left;
    }

    public void setLeft(TernaryHuffmanNode left) {
        this.left = left;
    }

    public TernaryHuffmanNode getRight() {
        return right;
    }

    public void setRight(TernaryHuffmanNode right) {
        this.right = right;
    }

    public TernaryHuffmanNode getMiddle() {
        return middle;
    }

    public void setMiddle(TernaryHuffmanNode middle) {
        this.middle = middle;
    }

    @Override
    public int compareTo(TernaryHuffmanNode o) {
        return Integer.compare(this.f, o.f);
    }
}
