package PiatekChalange;

public class Flamaster {

    private static String word = ("Abbbhhhkkk");

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
            sb.append(chars[i]);
                while(chars[i] == chars[i+1]) {
                    countWord++;
                    i++;
                    if(i+1 >= chars.length){
                        break;
                    }
                }
                if(countWord == 2){
                    sb.append(chars[i]);
                } else if(countWord > 2 ) {
                    sb.append(countWord);

            }

        }

        System.out.println(sb);

    }

}
