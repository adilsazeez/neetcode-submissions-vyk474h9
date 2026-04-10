class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freqMapS = new HashMap<>();
        for(char ch: s.toCharArray()){
            freqMapS.put(ch, freqMapS.getOrDefault(ch,0)+1);
        }
        System.out.println(freqMapS);
        Map<Character, Integer> freqMapT = new HashMap<>();
        for(char ch: t.toCharArray()){
            freqMapT.put(ch, freqMapT.getOrDefault(ch,0)+1);
        }
        System.out.println(freqMapT);
        boolean finalStatus = true;
        if(freqMapS.size() != freqMapT.size())
            return false;

        for(Map.Entry<Character, Integer> entry: freqMapS.entrySet()){
            char keyToCheck  = entry.getKey();
            Integer tValue = freqMapT.get(entry.getKey());
            if(tValue==null || !tValue.equals(entry.getValue())){
                finalStatus = false;
                System.out.print("False for "+ entry.getKey() + " "+entry.getValue() + " " + freqMapT.get(entry.getKey()) + " " +freqMapT.containsKey(entry.getKey()));
                break;
            }
        }
    return finalStatus;
    }
}
