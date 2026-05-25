public class Main {
    public static int binarySearch(int[] a, int target) {
        return binarySearchRec(a, target, 0, a.length - 1);
    }

    private static int binarySearchRec(int[] a, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (a[mid] == target) return mid;
        if (a[mid] > target) return binarySearchRec(a, target, left, mid - 1);
        return binarySearchRec(a, target, mid + 1, right);
    }

    public static int findIndexEqualValue(int[] a) {
        return findIndexEqualValueRec(a, 0, a.length - 1);
    }

    private static int findIndexEqualValueRec(int[] a, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (a[mid] == mid) return mid;
        if (a[mid] > mid) return findIndexEqualValueRec(a, left, mid - 1);
        return findIndexEqualValueRec(a, mid + 1, right);
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        reverseRec(chars, 0, chars.length - 1);
        return new String(chars);
    }

    private static void reverseRec(char[] chars, int left, int right) {
        if (left >= right) return;
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        reverseRec(chars, left + 1, right - 1);
    }

    public static Integer majorityElement(int[] a) {
        Integer candidate = majorityCandidateRec(a, 0, a.length - 1);
        if (candidate == null) return null;
        int count = 0;
        for (int v : a) {
            if (v == candidate) count++;
        }
        return count > a.length / 2 ? candidate : null;
    }

    private static Integer majorityCandidateRec(int[] a, int left, int right) {
        if (left > right) return null;
        if (left == right) return a[left];

        int mid = left + (right - left) / 2;
        Integer leftCand = majorityCandidateRec(a, left, mid);
        Integer rightCand = majorityCandidateRec(a, mid + 1, right);

        if (leftCand != null && rightCand != null && leftCand.equals(rightCand)) {
            return leftCand;
        }

        int leftCount = countInRange(a, leftCand, left, right);
        int rightCount = countInRange(a, rightCand, left, right);
        int size = right - left + 1;

        if (leftCand != null && leftCount > size / 2) return leftCand;
        if (rightCand != null && rightCount > size / 2) return rightCand;
        return null;
    }

    private static int countInRange(int[] a, Integer val, int left, int right) {
        if (val == null) return 0;
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (a[i] == val) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] q1 = {1, 3, 5, 7, 9};
        int q1Target = 7;
        System.out.println("Q1 index: " + binarySearch(q1, q1Target));

        int[] q2 = {-1, -1, 1, 3, 8, 9};
        System.out.println("Q2 index: " + findIndexEqualValue(q2));

        String q3 = "FURB";
        System.out.println("Q3 reverse: " + reverseString(q3));

        int[] q4 = {1, 2, 1, 1, 3};
        System.out.println("Q4 majority: " + majorityElement(q4));
    }
}
