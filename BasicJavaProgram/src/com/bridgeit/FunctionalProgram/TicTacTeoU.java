package com.bridgeit.FunctionalProgram;

public class TicTacTeoU {
	int size = 3;

	public boolean empty(int[][] array) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public void display(int[][] array) {
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				if (array[x][y] == 1)
					System.out.print("|x|");
				else if (array[x][y] == 2)
					System.out.print("|0|");
				else
					System.out.print("|_|");
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean result(int[][] array, int input, int i, int j) {
		int m = i;
		int n = 0;
		while (n < size) {
			if (array[m][n] == input)
				n++;
			else
				break;
		}
		if (n == size)
			return false;

		n = j;
		m = 0;
		while (m < size) {
			if (array[m][n] == input)
				m++;
			else
				break;
		}
		if (m == size) {
			return false;
		}

		m = 0;
		n = 0;
		while (m < size && n < size) {
			if (array[m][n] == input) {
				m++;
				n++;
			} else
				break;
		}
		if (m == 3 && n == 3) {
			return false;
		}

		m = size - 1;
		n = 0;
		while (m >= 0) {
			if (array[m][n] == input) {
				m--;
				n++;
			} else
				return true;
		}
		if (m == -1)
			return false;
		return true;
	}
}
