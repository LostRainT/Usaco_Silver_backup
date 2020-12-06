package leetcode;

/**
 * Answer To Leetcode: 岛屿数量
 * author: Tang Kaizhen
 * latest edit : 2020-09-26
 */
public class NumIslands {
    public static void main(String[] args) {
//        char[][] grid = {
//                {'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '0', '0', '0'},
//        };
//
//        char[][] grid = {
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'},
//        };
//        char[][] grid = {
//                {'1', '1', '1'},
//                {'0', '1', '0'},
//                {'1', '1', '1'},
//        };
//        char[][] grid = {
//                {'1', '0', '1', '1', '1'},
//                {'1', '0', '1', '0', '1'},
//                {'1', '1', '1', '0', '1'},
//        };
//
//        char[][] grid = {
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'},
//        };
        char[][] grid = {
                {'1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',},
                {'0', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1',},
                {'0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1',},
                {'0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0',},
                {'0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '1', '0', '0', '1',},
                {'1', '0', '0', '0', '1', '0', '0', '0', '0', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0',},
                {'0', '0', '0', '0', '1', '0', '0', '1', '0', '0', '0', '0', '0', '1', '0', '0', '1', '0', '0', '0',},
                {'1', '0', '0', '0', '1', '1', '1', '0', '1', '0', '0', '0', '0', '1', '1', '0', '1', '0', '0', '0',},
                {'0', '0', '0', '0', '0', '1', '1', '1', '1', '0', '0', '0', '0', '1', '0', '0', '1', '0', '0', '0',},
                {'1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '1', '0', '0', '1', '0', '0', '1',},
                {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '1', '0', '0', '0', '1', '0', '1',},
                {'0', '0', '0', '0', '1', '0', '1', '0', '0', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0',},
                {'1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',},
                {'0', '1', '0', '1', '0', '0', '0', '1', '0', '1', '0', '0', '0', '1', '0', '1', '0', '1', '0', '0',},
                {'0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '1', '0', '1', '0',},
                {'1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '1', '1', '0', '0', '0', '1', '0', '0',},
                {'0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0', '1', '0', '1', '0', '1', '0', '0',},
                {'0', '0', '0', '1', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '1', '0', '0', '0', '1', '0',},
                {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',},
                {'1', '0', '0', '0', '0', '1', '0', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '1', '0', '0',},
        };


        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int num = 1;
        //特殊情况：只有1格
        if (grid.length == 1 && grid[0].length == 1) {
            if (grid[0][0] == '0') {
                return 0;
            } else if (grid[0][0] == '1') {
                return 1;
            }
        }
        //特殊情况：0格
        if (grid.length == 0) {
            return 0;
        }
        /*
        给矩阵加上四条边 并将char转成int
        */
        int[][] fixedGrid = new int[grid.length + 2][grid[0].length + 2];
        for (int i = 0; i < fixedGrid.length; i++) {
            fixedGrid[i][0] = 0;
            fixedGrid[i][fixedGrid[i].length - 1] = 0;
        }
        for (int i = 0; i < fixedGrid[0].length; i++) {
            fixedGrid[0][i] = 0;
            fixedGrid[fixedGrid.length - 1][i] = 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                fixedGrid[i + 1][j + 1] = (int) grid[i][j] - 48;
            }
        }

        for (int i = 1; i < fixedGrid.length - 1; i++) {
            for (int j = 1; j < fixedGrid[i].length - 1; j++) {
                //如果是孤岛
                if (fixedGrid[i][j] == 1 && isIsland(fixedGrid, i, j) == true) {
                    num++;
                    fixedGrid[i][j] = (char) num;
                }
                //是新陆地，但不是孤岛
                else if (fixedGrid[i][j] == 1 && isIsland(fixedGrid, i, j) == false) {
                    num++;
                    fixedGrid[i][j] = (char) num;
                    checkAndMark(fixedGrid, i, j, num);
                }
            }
        }
        return num - 1;
    }

    public static int[][] checkAndMark(int[][] grid, int x, int y, int num) {
        if (grid[x + 1][y] == 1) {
            grid[x + 1][y] = grid[x][y];
            grid = checkAndMark(grid, x + 1, y, num);
        }
        if (grid[x - 1][y] == 1) {
            grid[x - 1][y] = grid[x][y];
            grid = checkAndMark(grid, x - 1, y, num);
        }
        if (grid[x][y + 1] == 1) {
            grid[x][y + 1] = grid[x][y];
            grid = checkAndMark(grid, x, y + 1, num);
        }
        if (grid[x][y - 1] == 1) {
            grid[x][y - 1] = grid[x][y];
            grid = checkAndMark(grid, x, y - 1, num);
        }
        return grid;
    }

    private static boolean isIsland(int[][] grid, int x, int y) {
        if (grid[x][y] == 1 && grid[x + 1][y] == 0 && grid[x - 1][y] == 0 && grid[x][y + 1] == 0 && grid[x][y - 1] == 0) {
            return true;
        } else return false;
    }


}
