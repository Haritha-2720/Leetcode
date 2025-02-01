class Solution {
    public int distributeCandies(int[] candyType) {

        int n =candyType.length;

        int newNum = n/2;

        HashSet<Integer> uniqueCandies = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        
        return Math.min(uniqueCandies.size(), newNum);
    }
}