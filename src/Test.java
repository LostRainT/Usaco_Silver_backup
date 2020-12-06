public class Test {
    public static void main(String[] args) {
//        char[][] grid = {
//                {'0', '0', '0', '0', '0', '0', '0'},
//                {'0', '2', '0', '1', '1', '1', '0'},
//                {'0', '1', '0', '1', '0', '1', '0'},
//                {'0', '1', '1', '1', '0', '1', '0'},
//                {'0', '0', '0', '0', '0', '0', '0'},
//        };
//        grid = checkAndMark(grid, 1, 1, 2);
//        System.out.println(grid);
//    }
//
//    public static char[][] checkAndMark(char[][] grid, int x, int y, int num) {
//        if (grid[x + 1][y] == '1') {
//            grid[x + 1][y] = grid[x][y];
//            grid = checkAndMark(grid, x + 1, y, num);
//        }
//        if (grid[x - 1][y] == '1') {
//            grid[x - 1][y] = grid[x][y];
//            grid = checkAndMark(grid, x - 1, y, num);
//        }
//        if (grid[x][y + 1] == '1') {
//            grid[x][y + 1] = grid[x][y];
//            grid = checkAndMark(grid, x, y + 1, num);
//        }
//        if (grid[x][y - 1] == '1') {
//            grid[x][y - 1] = grid[x][y];
//            grid = checkAndMark(grid, x, y - 1, num);
//        }
//        return grid;

        char c1 = '1';
        char c2 = '0';
        int i1 = (int) c1 - 48;
        int i2 = (int) c2 - 48;
        System.out.println(c1);
        System.out.println(c2);

    }
}
