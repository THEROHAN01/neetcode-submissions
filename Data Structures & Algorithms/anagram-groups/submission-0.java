class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map = new HashMap<>();

        for (String str : strs ){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sorted = new String(word);

            map.putIfAbsent(sorted , new ArrayList<>());
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
