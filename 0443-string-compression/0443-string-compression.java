class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while(read < chars.length){
        char current = chars[read];

        int count = 0;
        while(read <  chars.length && chars[read]== current){
            read++;
            count++;
        }

            
        
        chars[write]= current;
        write++;

  

        if(count > 1){

                for (char c : String.valueOf(count).toCharArray()) {
chars[write] = c;
write++;

}
        }
        }
        return write;


    
}
}


// [a, a, b, b, c, c, c]
// iterations: 1
// read = 0, char = 1, current = a
// 

