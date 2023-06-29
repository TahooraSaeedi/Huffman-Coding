package Faz_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the number of characters: ");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        char[] c = new char[len];
        int[] f = new int[len];
        System.out.println("Please enter characters: ");
        for (int i = 0; i < len; i++) {
            c[i] = scan.next().charAt(0);
        }
        System.out.println("Please enter the number of repetitions of the characters in order: ");
        for (int i = 0; i < len; i++) {
            f[i] = scan.nextInt();
        }
        TernaryHuffman h = new TernaryHuffman(c, f);
        TernaryHuffmanNode hn = h.getRoot();
        h.getCodes(hn, "");
    }
}
