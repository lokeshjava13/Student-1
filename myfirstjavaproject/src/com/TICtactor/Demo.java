package com.TICtactor;

import java.util.Scanner;

public class Demo {

	// ANSI Colors
	static final String RESET = "\u001B[0m";
	static final String RED = "\u001B[31m";
	static final String GREEN = "\u001B[32m";
	static final String YELLOW = "\u001B[33m";
	static final String BLUE = "\u001B[34m";
	static final String PURPLE = "\u001B[35m";
	static final String CYAN = "\u001B[36m";
	static final String BOLD = "\u001B[1m";

	static char[][] board = new char[3][3];
	static char player = 'X';
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Initialize board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		System.out.println(PURPLE + BOLD);
		System.out.println("╔══════════════════════════╗");
		System.out.println("║     TIC TAC TOE GAME     ║");
		System.out.println("╚══════════════════════════╝");
		System.out.println(RESET);

		while (true) {

			printBoard();

			System.out.println("==========================");

			String color = (player == 'X') ? RED : CYAN;

			System.out.println(color + BOLD + "  PLAYER " + player + " TURN!" + RESET);

			System.out.print(YELLOW + "Choose row (0-2): " + RESET);
			int row = scanner.nextInt();

			System.out.print(YELLOW + "Choose column (0-2): " + RESET);
			int col = scanner.nextInt();

			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {

				System.out.println(RED + BOLD + "Invalid move! Try again." + RESET);
				continue;
			}

			board[row][col] = player;

			if (checkWinner()) {

				printBoard();

				System.out.println(GREEN + BOLD);
				System.out.println("********************************");
				System.out.println("   CONGRATULATIONS PLAYER " + player + " WINS!");
				System.out.println("********************************");
				System.out.println(RESET);

				break;
			}

			if (isBoardFull()) {

				printBoard();

				System.out.println(YELLOW + BOLD);
				System.out.println("********************************");
				System.out.println("       MATCH DRAW!");
				System.out.println("********************************");
				System.out.println(RESET);

				break;
			}

			player = (player == 'X') ? 'O' : 'X';
		}

		System.out.println(PURPLE + BOLD + "\nThanks for playing Tic Tac Toe!" + RESET);

		scanner.close();
	}

	private static boolean isBoardFull() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (board[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean checkWinner() {

		// Rows
		for (int i = 0; i < 3; i++) {

			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
		}

		// Columns
		for (int i = 0; i < 3; i++) {

			if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}

		// Diagonal
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}

		// Reverse diagonal
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}

		return false;
	}

	private static void printBoard() {

		System.out.println(BLUE + BOLD);
		System.out.println("       TIC TAC TOE");
		System.out.println("    0     1     2");
		System.out.println("  ╔═════╦═════╦═════╗");

		for (int i = 0; i < 3; i++) {

			System.out.print("  ║");

			for (int j = 0; j < 3; j++) {

				char value = board[i][j];

				if (value == 'X') {
					System.out.print("  " + RED + BOLD + "X" + BLUE + "  ║");
				} else if (value == 'O') {
					System.out.print("  " + CYAN + BOLD + "O" + BLUE + "  ║");
				} else {
					System.out.print("     ║");
				}
			}

			System.out.println();

			if (i < 2) {
				System.out.println("  ╠═════╬═════╬═════╣");
			}
		}

		System.out.println("  ╚═════╩═════╩═════╝");
		System.out.println(RESET);
	}
}
