class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> partitions = new ArrayList<>();
        solve(s, 0, new ArrayList<>(), partitions);
        return partitions;
    }

    private void solve(String s, int start, List<String> partition, List<List<String>> partitions) {
        if (start == s.length()) {
            partitions.add(new ArrayList<>(partition));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                partition.add(s.substring(start, i + 1));
                solve(s, i + 1, partition, partitions);
                partition.remove(partition.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}