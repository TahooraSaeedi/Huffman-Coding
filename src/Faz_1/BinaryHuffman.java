package Faz_1;

public class BinaryHuffman {
    private char[] c;
    private int[] f;

    public BinaryHuffman(char[] c, int[] f) {
        this.c = c;
        this.f = f;
    }

    public BinaryHuffmanNode getRoot() {
        PriorityQueue pq = new PriorityQueue();
        BinaryHuffmanNode first;
        BinaryHuffmanNode second;
        BinaryHuffmanNode x;
        for (int i = 0; i < this.c.length; i++) {
            first = new BinaryHuffmanNode(this.c[i], this.f[i]);
            pq.push(first);
        }
        BinaryHuffmanNode root = null;
        if (pq.getSize() == 1) {
            root = pq.pop();
        } else {
            while (pq.getSize() > 1) {
                first = pq.pop();
                second = pq.pop();
                x = new BinaryHuffmanNode('*', first.getF() + second.getF());
                x.setLeft(first);
                x.setRight(second);
                root = x;
                pq.push(x);
            }
        }
        return root;
    }

    public void getCodes(BinaryHuffmanNode root, String s) {
        if (root.getLeft() == null && root.getRight() == null) {
            int len = s.length();
            if (len == 0) {
                len = 1;
                s = "0";
            }
            System.out.println("Character: " + root.getC() + "\tNumber Of Bits: " + len + "\tCode: " + s);
        } else {
            this.getCodes(root.getLeft(), s + "0");
            this.getCodes(root.getRight(), s + "1");
        }
    }
}
