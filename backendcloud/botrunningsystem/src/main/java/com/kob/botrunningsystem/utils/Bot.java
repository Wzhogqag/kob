package com.kob.botrunningsystem.utils;

import java.util.ArrayList;
import java.util.List;

public class Bot implements com.kob.botrunningsystem.utils.BotInterface {
    static class Cell {
        public int x, y;
        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private boolean check_tail_increasing(int step) {
        if (step <= 10) return true;
        return step % 3 == 1;
    }

    public List<Cell> getCells(int sx, int sy, String steps) {
        // 处理空字符串或格式错误的情况
        if (steps == null || steps.length() <= 2) {
            // 如果steps为空或过短，直接返回初始位置
            List<Cell> cells = new ArrayList<>();
            cells.add(new Cell(sx, sy));
            return cells;
        }

        // 移除首尾括号
        steps = steps.substring(1, steps.length() - 1);

        List<Cell> res = new ArrayList<>();
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int x = sx, y = sy;
        int step = 0;

        res.add(new Cell(x, y)); // 添加初始位置

        for (int i = 0; i < steps.length(); i++) {
            char c = steps.charAt(i);
            // 验证字符是否为合法方向
            if (c < '0' || c > '3') {
                // 非法字符，跳过或返回当前结果
                continue;
            }
            int d = c - '0';
            x += dx[d];
            y += dy[d];
            res.add(new Cell(x, y));
            if (!check_tail_increasing(++step)) {
                res.remove(0); // 移除尾部
            }
        }
        return res;
    }

    @Override
    public Integer nextMove(String input) {
        // 验证输入是否合法
        if (input == null) {
            return 0; // 默认返回上
        }

        String[] strs = input.split("#");
        // 验证输入数组长度
        if (strs.length != 7) {
            return 0;
        }

        int[][] g = new int[13][14];
        for (int i = 0, k = 0; i < 13; i++) {
            for (int j = 0; j < 14; j++, k++) {
                if (k < strs[0].length() && strs[0].charAt(k) == '1') {
                    g[i][j] = 1;
                }
            }
        }

        try {
            int aSx = Integer.parseInt(strs[1]), aSy = Integer.parseInt(strs[2]);
            int bSx = Integer.parseInt(strs[4]), bSy = Integer.parseInt(strs[5]);

            List<Cell> aCells = getCells(aSx, aSy, strs[3]);
            List<Cell> bCells = getCells(bSx, bSy, strs[6]);

            for (Cell c : aCells) {
                if (c.x >= 0 && c.x < 13 && c.y >= 0 && c.y < 14) {
                    g[c.x][c.y] = 1;
                }
            }
            for (Cell c : bCells) {
                if (c.x >= 0 && c.x < 13 && c.y >= 0 && c.y < 14) {
                    g[c.x][c.y] = 1;
                }
            }

            int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
            Cell head = aCells.get(aCells.size() - 1);
            for (int i = 0; i < 4; i++) {
                int x = head.x + dx[i];
                int y = head.y + dy[i];
                if (x >= 0 && x < 13 && y >= 0 && y < 14 && g[x][y] == 0) {
                    return i;
                }
            }
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            // 处理解析错误
            e.printStackTrace();
        }

        return 0; // 默认返回上
    }
}