package Recursion;
/**
 * Problem Statement: Maze Solving
 * 
 * You are given a 2D maze represented by a grid. The maze consists of open cells represented by '0' and walls represented by '1'. 
 * The entrance to the maze is at the top-left cell, and the exit is at the bottom-right cell. You can move in four directions: up, down, left, or right.
 * The goal is to find a path from the entrance to the exit while avoiding walls.
 * 
 * Write a function or algorithm to determine if there exists a valid path through the maze.
 * 
 * Function Signature:
 * 
 * public boolean hasPath(int[][] maze) {
 *     // Your code here
 * }
 * 
 * Input:
 * 
 * - `maze`: A 2D array representing the maze, where `maze[i][j]` is either '0' or '1'. The dimensions of the maze are at most 100x100.
 * 
 * Output:
 * 
 * - Return `true` if there exists a path from the entrance to the exit; otherwise, return `false`.
 * 
 * Example:
 * 
 * int[][] maze = {
 *     {0, 0, 1, 0, 0},
 *     {0, 0, 0, 0, 0},
 *     {0, 0, 0, 1, 0},
 *     {1, 1, 0, 1, 1},
 *     {0, 0, 0, 0, 0}
 * };
 * 
 * assert hasPath(maze) == true;
 * 
 * In the given example, there is a valid path from the top-left corner to the bottom-right corner: (0,0) -> (0,1) -> (0,2) -> (0,3) -> (0,4) -> (1,4) -> (2,4) -> (3,4) -> (4,4).
 */

public class Maze {
    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        
        System.out.println(hasPath(maze, 0, 0));
    }

    public static boolean hasPath(int maze[][], int i, int j) {
        if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || maze[i][j] == 1) {
            return false;
        }

        if (i == maze.length - 1 && j == maze[0].length - 1) {
            return true;
        }

        maze[i][j] = 1;

        if (hasPath(maze, i + 1, j) || hasPath(maze, i - 1, j) || hasPath(maze, i, j - 1) || hasPath(maze, i, j + 1)) {
            return true;
        }

        return false;
    }
}
