class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int shortest=200;
        String ch= "";
        if(strs.length == 1) return strs[0];
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<shortest) shortest = strs[i].length();
        }
        for(int i=0; i<shortest; i++){
            for(int j=0; j<strs.length-1; j++){
                if(!strs[j].substring(i,i+1).equals(strs[j+1].substring(i,i+1))){
                    ch = "";
                    return str;
                }else ch=strs[j].substring(i,i+1);
            }
            str += ch;
        }       
        return str;
    }
}