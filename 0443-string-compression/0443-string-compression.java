class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;

        for (int i = 0 ; i < n ;){
         char ch = chars[i];
         int count = 0;
          while (i < n && chars[i]==ch){
            count++; i++;
          }
          if(count == 1){
            chars[index++] = ch;
          }
          else {
            chars[index++] = ch;
            for(char dig :Integer.toString(count).toCharArray()){
                chars[index++] = dig;
            }
          }
        }
        return index;
    }
}