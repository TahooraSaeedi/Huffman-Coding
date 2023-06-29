package Faz_2;

public class TernaryHuffman {
    private char[] c;
    private int[] f;

    public TernaryHuffman(char[] c, int[] f) {
        this.c = c;
        this.f = f;
    }

    public TernaryHuffmanNode getRoot() {
        PriorityQueue pq = new PriorityQueue();
        TernaryHuffmanNode first;
        TernaryHuffmanNode second;
        TernaryHuffmanNode third;
        TernaryHuffmanNode x;
        for (int i = 0; i < this.c.length; i++) {
            first = new TernaryHuffmanNode(this.c[i], this.f[i]);
            pq.push(first);
        }
        TernaryHuffmanNode root = null;
        if (pq.getSize() == 1) {
            root = pq.pop();
        } else if (pq.getSize() == 2) {
            first = pq.pop();
            second = pq.pop();
            x = new TernaryHuffmanNode('*', first.getF() + second.getF());
            x.setLeft(first);
            x.setMiddle(second);
            root = x;
            pq.push(x);
        } else {
            while (pq.getSize() > 2) {
                first = pq.pop();
                second = pq.pop();
                third = pq.pop();
                x = new TernaryHuffmanNode('*', first.getF() + second.getF() + third.getF());
                x.setLeft(first);
                x.setMiddle(second);
                x.setRight(third);
                root = x;
                pq.push(x);
            }
            if (pq.getSize() == 2) {
                first = pq.pop();
                second = pq.pop();
                x = new TernaryHuffmanNode('*', first.getF() + second.getF());
                x.setLeft(first);
                x.setMiddle(second);
                root = x;
                pq.push(x);
            }
        }
        return root;
    }

    public void getCodes(TernaryHuffmanNode root, String s) {
        if (root.getLeft() == null && root.getMiddle() == null && root.getRight() == null) {
            int len = s.length();
            if (len == 0) {
                len = 1;
                s = "0";
            }
            System.out.println("Character: " + root.getC() + "\tNumber Of Bits: " + len + "\tCode: " + s);
        } else if (root.getLeft() != null && root.getMiddle() != null && root.getRight() == null) {
            this.getCodes(root.getLeft(), s + "0");
            this.getCodes(root.getMiddle(), s + "1");
        } else {
            this.getCodes(root.getLeft(), s + "0");
            this.getCodes(root.getMiddle(), s + "1");
            this.getCodes(root.getRight(), s + "2");
        }
    }
}
