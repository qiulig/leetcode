package zijie.zijie_7_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 ■题目描述
 小W有个键盘，他都用它来输入数字，键盘长下图这样:
 123|4|5678  90
 小W打字都用一指禅，就是左右手各用一个手指打字，在同一单位时间两个手指都可以做出操作。可以做两种操作:
 1按下手指所在的键
 2.往左/右移一格
 但是需要注意的是:
 1.在任何时间，左手的手指会在右手手指的左边
 2.同一单位时间只有一个手指可以按下键盘，当然啦，另-个手指可以移动
 现在给你一些数字，你能不能算出小W最少需要多少时间输入这个数字?
 在每次开始输入一个数字的时候，左手手指放在'5'上，右手手指放在6上
 输入描述:
 有多组输入，每行一个字符串3, 3由数字组成，长度不大于100
 输出描述:
 对于每行输出一个数字，小w输入最少需要多少单位时间
 输入:
    434
    56
    57
    47
 输出：
    5
    2
    2
    3
 */
public class Main_2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        long N = sr.nextLong();

    }

}