# Algorithm Examples（算法示例）

## 1、 遍历字符串的连续子串

```java
    public static List<String> subStrList(String text) {
        if (text == null || text.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        for (int start = 0; start < text.length(); start++) {
            for (int end = start + 1; end <= text.length(); end++) {
                result.add(text.substring(start, end));
            }
        }
        return result;
    }

```

## 2、 在字符串空隙中补充字符（也可遍历全部子串）

```java
    public static List<String> charPadding(String str, char pad) {
        List<String> list = new ArrayList<>();
        int n = str.length();
        if (n <= 1) { // 处理边界情况：空字符串或单字符
            list.add(str);
            return list;
        }
        int gaps = n - 1; // 空隙数量 = 字符数 - 1
        int total = 1 << gaps; // 总组合数：2^(gaps)，位运算等价于2^gaps
        // 遍历所有组合 (0 到 total-1)，每次给mask+1即可将mask从00000000依次填充到11111111
        for (int mask = 0; mask < total; mask++) {
            StringBuilder sb = new StringBuilder();
            // 遍历每个字符位置
            for (int i = 0; i < n; i++) {
                sb.append(str.charAt(i)); // 添加当前字符
                //在当前字符后添加"+"的判断条件：
                // 1. 不是最后一个字符
                // 2. 当前位掩码为1（表示在此空隙添加+号），使用位运算检查第i位：(mask >> i) & 1
                if (i < gaps && ((mask >> i) & 1) == 1) {
                    sb.append(pad);
                }
            }
            list.add(sb.toString());
        }
        return list;
    }

```

## 3、 判断一个整数是否是质数

```java
    /**
     * 基础实现（试除法）
     */
    public static boolean isPrimeBasic(int n) {
        if (n <= 1) return false; // 1 和负数不是质数
        if (n == 2) return true; // 2 是质数
        if (n % 2 == 0) return false; // 排除偶数
        // 检查奇数因子
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 优化版本（6k±1 定理）
     */
    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false; // 1 和负数不是质数
        if (n <= 3) return true; // 2,3 是质数
        if (n % 2 == 0 || n % 3 == 0) return false; // 排除能被2或3整除的数
        // 检查 6k±1 形式的因子
        int sqrt = (int) Math.sqrt(n);
        for (int i = 5; i <= sqrt; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 大数优化（Miller-Rabin 概率测试），适用于超过 Integer.MAX_VALUE 的大数
     */
    public static boolean isPrimeBigNumber(long n) {
        return BigInteger.valueOf(n).isProbablePrime(10); // 10次测试，错误率<1/2^20
    }

```

## 4、 分解质因数

```java
    public static List<Integer> factorize(int n) {
        if (n == 0 || n == 1) {
            return Collections.singletonList(n);
        }
        List<Integer> factors = new ArrayList<>();
        int num = Math.abs(n);
        if (n < 0) { // 处理符号
            factors.add(-1);
        }
        while (num % 2 == 0) { // 处理偶数因子
            factors.add(2);
            num /= 2;
        }
        for (int i = 3; i * i <= num; i += 2) { // 处理奇数因子
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        if (num > 2) { // 处理最后剩余的质数
            factors.add(num);
        }
        return factors;
    }

```

## 5、 匹配子字符串（基础算法）

```java
    public static int countOccurrences(String string, String subStr) {
        if (string == null || subStr == null || subStr.isEmpty() || string.length() < subStr.length()) {
            // 处理特殊情况
            return 0;
        }
        int count = 0;
        int strLen = string.length();
        int subLen = subStr.length();
        for (int i = 0; i <= strLen - subLen; i++) { // 遍历所有可能的起始位置
            boolean match = true;
            for (int j = 0; j < subLen; j++) { // 检查当前起始位置是否匹配整个subStr
                if (string.charAt(i + j) != subStr.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }

```

## 6、 匹配子字符串（KMP 算法）

```java
    public static int kmpCount(String string, String subStr) {
        if (string == null || subStr == null || subStr.isEmpty()) return 0;
        int count = 0;
        int[] lps = computeLPS(subStr); // 计算部分匹配表
        int i = 0, j = 0;
        while (i < string.length()) {
            if (string.charAt(i) == subStr.charAt(j)) {
                i++;
                j++;
                if (j == subStr.length()) {
                    count++;
                    j = lps[j - 1]; // 回退到最长公共前后缀的位置
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return count;
    }

    // 生成部分匹配表
    private static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // 当前最长的公共前后缀长度
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
```

## 7、 一维动态规划（斐波那契数列，跳台阶）

```java
public class Solution1 {
    private int[] dp = new int[40];

    public int jumpFloor (int number) {
        if (number < 2) {
            return 1;
        }
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[number];
    }
}
```

```java

public class Solution2 {
    public int jumpFloor (int number) {
        if (number < 2) {
            return 1;
        }
        int d_1 = 1, d_2 = 1, dp = 0;
        for (int i = 2; i <= number; i++) {
            dp = d_1 + d_2;
            d_2 = d_1;
            d_1 = dp;
        }
        return dp;
    }
}
```

## 8、 贪心算法（主持人调度）

- 首先建立两个数组分别存储开始时间（记为 start）和结束时间（记为 end）。
- 然后分别对 start 和 end 数组进行排序。
- 接着遍历 start 数组，判断当前开始时间是否大于等于最小的结束时间，如果是，则说明当前主持人就可以搞定（对应当前最小的结束时间的那个活动）；如果否，则需要新增一个主持人，并将 end 数组下标后移（表示对应的活动已经有人主持）。

```java
    public class Solution {
        public int minmumNumberOfHost (int n, int[][] startEnd) {
            //初始化两个数组，分别记录开始时间和结束时间
            int[] start = new int[n], end = new int[n];
            //将活动的开始和结束时间赋值道start和end数组
            for (int i = 0; i < n; i++) {
                start[i] = startEnd[i][0];
                end[i] = startEnd[i][1];
            }
            //按从小到大的顺序对start和end数组排序
            Arrays.sort(start);
            Arrays.sort(end);
            int res = 0, idx = 0;
            for (int i = 0; i < n; i++) {
                if (start[i] >= end[idx]) {
                    idx++; //如果大于等于当前最小的结束时间，说明当前主持人可以搞定
                } else {
                    res++; //否则，需要新增主持人
                }
            }
            return res;
        }
    }
```

## 9、 递归（括号生成）

给出 n 对括号，请编写一个函数来生成所有的由 n 对括号组成的合法组合。\
例如，给出 n=3，解集为："((()))", "(()())", "(())()", "()()()", "()(())"

```java
public class Solution {
    public ArrayList<String> generateParenthesis (int n) {
        ArrayList<String> list = new ArrayList<>();
        recursion(n, 0, 0, "", list);
        return list;
    }

    public void recursion(int n, int l, int r, String temp, ArrayList<String> list) {
        if (l == n && r == n) {
            list.add(temp);
            return;
        }
        if (l < n) { // 使用一次左括号
            recursion(n, l + 1, r, temp + "(", list);
        }
        if (r < n && l > r) { // 使用一次左括号，且使用右括号个数必须少于左括号
            recursion(n, l, r + 1, temp + ")", list);
        }
    }
}
```

## 10、 兑换零钱

给定数组 arr，arr 中所有的值都为正整数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个 aim，代表要找的钱数，求组成 aim 的最少货币数。如果无解，请返回-1。

- step 1：可以用 dp\[i]_dp_\[_i_]表示要凑出 i 元钱需要最小的货币数。
- step 2：一开始都设置为最大值 aim+1*aim*+1，因此货币最小 1 元，即货币数不会超过 aim*aim*.
- step 3：初始化 dp\[0]=0*dp*\[0]=0。
- step 4：后续遍历 1 元到 aim 元，枚举每种面值的货币都可能组成的情况，取每次的最小值即可，转移方程为 dp\[i]=min(dp\[i],dp\[i−arr\[j]]+1)_dp_\[_i_]=_min_(_dp_\[_i_],_dp_\[*i*−*arr*\[_j_]]+1).
- step 5：最后比较 dp\[aim]_dp_\[_aim_]的值是否超过 aim，如果超过说明无解，否则返回即可。

```java
public class Solution {
    public int minMoney (int[] arr, int aim) {
        // Arrays.sort(arr);
        if (aim < 0) {
            return -1;
        }
        if (aim == 0) {
            return 0;
        }
        //dp[i]表示凑齐i元最少需要多少货币数
        int[] dp = new int[aim + 1];
        Arrays.fill(dp, aim + 1);
        dp[0] = 0;
        for (int i = 1; i <= aim; i++) { // 遍历1-aim元
            for (int j = 0; j < arr.length; j++) { // 每种面值的货币都要枚举
                if (arr[j] <= i) { // 如果面值不超过要凑的钱才能用
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1); // 维护最小值
                }
            }
        }
        // 如果最终答案大于aim代表无解
        return dp[aim] > aim ? -1 : dp[aim];
    }
}
```

#11、 最大公约数和最小公倍数

```java
    /**
     * 计算两个数的最大公约数 - 递归版本
     * @param a 第一个数
     * @param b 第二个数
     * @return 最大公约数
     */
    public static long gcd(long a, long b) {
        // 处理负数
        a = Math.abs(a);
        b = Math.abs(b);
        // 基础情况
        if (b == 0) return a;
        // 递归调用
        return gcd(b, a % b);
    }

    /**
     * 计算两个数的最大公约数 - 迭代版本
     * @param a 第一个数
     * @param b 第二个数
     * @return 最大公约数
     */
    public static long gcdIterative(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * 计算两个数的最小公倍数
     * @param a 第一个数
     * @param b 第二个数
     * @return 最小公倍数
     */
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;

        // LCM(a,b) = |a*b| / GCD(a,b)
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * 安全的LCM计算，避免溢出
     */
    public static long lcmSafe(long a, long b) {
        if (a == 0 || b == 0) return 0;

        a = Math.abs(a);
        b = Math.abs(b);

        long gcdValue = gcd(a, b);

        // 先除后乘，避免溢出
        return (a / gcdValue) * b;
    }
```

## 12、 数字字符串连续递增或递减

```java
    /**
     * 判断数字字符串是否单调（连续递增或连续递减）
     *
     * @param chars 纯数字组成的字符串（不能包含非数字字符）
     * @return true-递增/递减；false-非单调或无效输入
     */
    public static boolean isConsecutive(char[] chars) {
        int trend = 0; // 0:未定义, 1:递增, -1:递减
        for (int i = 1; i < chars.length; i++) {
            char prev = chars[i - 1];
            char curr = chars[i];
            if (prev == curr) { // 检查数字连续性
                return false; // 相邻相等立即失败
            }
            if (trend == 0) { // 首次确定趋势
                trend = (prev < curr) ? 1 : -1;
            } else if ((trend == 1 && prev >= curr) || (trend == -1 && prev <= curr)) { // 校验趋势一致性
                return false;
            }
        }
        return true;
    }

    /**
     * 判断数字字符串是否严格单调
     *
     * @param chars 纯数字组成的字符串（不能包含非数字字符）
     * @return true-递增/递减；false-非单调或无效输入
     */
    public static boolean isConsecutiveStrictly(char[] chars) {
        int trend = 0;
        for (int i = 1; i < chars.length; i++) {
            char prev = chars[i - 1];
            char curr = chars[i];
            if (prev == curr) {
                return false;
            }
            if (trend == 0) {
                trend = curr - prev;
                if (Math.abs(trend) != 1) {
                    return false;
                }
            } else {
                if (curr - prev != trend) {
                    return false;
                }
            }
        }
        return true;
    }
```
