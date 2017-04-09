public class WordDictionary {
    class TrieNode{
        TrieNode[] childern=new TrieNode[26];
        boolean isword;
        TrieNode(){
            
        }
    }
    private TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root=new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();++i){
            int c=word.charAt(i)-'a';
            if(cur.childern[c]==null){
                cur.childern[c]=new TrieNode();
            }
            cur=cur.childern[c];
        }
        cur.isword=true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(word.toCharArray(),0,root);
    }
    public boolean match(char[] ch,int index,TrieNode tri){
        if(index==ch.length) return tri.isword;
        else if(ch[index]!='.'){
            return tri.childern[ch[index]-'a']!=null && match(ch,index+1,tri.childern[ch[index]-'a']);
        }
        else{
            for(int i=0;i<26;++i){
                if(tri.childern[i]!=null){
                    if(match(ch,index+1,tri.childern[i])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */