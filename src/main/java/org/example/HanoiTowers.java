package org.example;

public class HanoiTowers {
    // Solves the Towers of Hanoi problem and prints the moves
    public static void solve(int n, char from, char to, char aux) {
        if (n < 1) throw new IllegalArgumentException("Number of disks must be at least 1");
        move(n, from, to, aux);
    }

    private static void move(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.printf("Move disk 1 from %c to %c%n", from, to);
            return;
        }
        move(n - 1, from, aux, to);
        System.out.printf("Move disk %d from %c to %c%n", n, from, to);
        move(n - 1, aux, to, from);
    }
}