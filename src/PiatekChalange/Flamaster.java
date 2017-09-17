package PiatekChalange;

public class Flamaster {

    private static String word = ("AAAAAAAAAAAASSSSSSSSSSSSSSSSddFFFFFersdsdkkkkkkk");

    public static void main(String[] args) {

        char[] chars = word.toCharArray();


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <chars.length; i++){
            int countWord = 0;
            if(i+1 >= chars.length  ){
                sb.append(chars[i]);
               break;
            }
            countWord++;
            if (chars[i] == chars[i+1]) {
                sb.append(chars[i]);
                countWord++;
                while(chars[i]==chars[i+1]  && (i+2 < chars.length)) {
                    countWord++;
                    i++;
                }
                if(countWord == 2){
                    i++;
                } else if(countWord > 2) {
                    sb.append(countWord);
                    i++;
                }
            }
        }

        System.out.println(sb);

    }

}
