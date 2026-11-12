class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = createMap(s);
        Map<Character, Integer> mapT = createMap(t);

        if (mapS.size() != mapT.size()) {
            return false;
        }

        for (Character c : mapS.keySet()) {
            System.out.println(c);
            System.out.println(mapT.containsKey(c));

            if (!mapT.containsKey(c)) {
                return false;
            }

            if (!mapS.get(c).equals(mapT.get(c))) {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }

        return m;
    }
}
