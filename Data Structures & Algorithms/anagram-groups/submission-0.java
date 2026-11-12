class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);

            if (m.containsKey(sorted)) {
                m.get(sorted).add(strs[i]);
            } else {
                m.put(sorted, new ArrayList<>());
                m.get(sorted).add(strs[i]);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (String str : m.keySet()) {
            result.add(m.get(str));
        } 

        return result;

        
    }
}
