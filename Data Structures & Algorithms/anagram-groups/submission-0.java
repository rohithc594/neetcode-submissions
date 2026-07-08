class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map =new HashMap<>();
        for(String i : strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(i);
        }
        return new ArrayList<>(map.values());
    }
}
