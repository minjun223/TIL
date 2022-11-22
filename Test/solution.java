
import java.util.*;
class solution {
    public String solution(String[] participant, String[] completion) {//프로그램어스 변수에 값을 넣어줌

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){//completion의 길이 만큼 반복

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
        
    }
}
