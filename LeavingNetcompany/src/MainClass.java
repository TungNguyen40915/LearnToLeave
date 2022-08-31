import model.ListNode;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello");

        isPalindrome();
    }

    public static void twoSum() {
        var solution = new ArraysAndHashing();
        var results = solution.twoSum(new int[] {2,7,11,15}, 9);

        if(results.length != 2) {
            System.out.println("Not found");
        } else {
            for (var result: results) {
                System.out.println(result);
            }
        }
    }

    public static void isValidParentheses() {
        var solution = new StringProblems();
        var result = solution.isValidParentheses("([])");

        System.out.println(result ? "Valid" : "Invalid");
    }

    public static void isPalindrome() {
        var solution = new StringProblems();
        var result = solution.isPalindrome("abcScba");

        System.out.println(result ? "is a Palindrome" : "is not a Palindrome");
    }

    public static void reverseList() {
        var solution = new LinkedList();
        var result = solution.reverseList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5))))));

        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }


}
