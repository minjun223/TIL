class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
         int maxCnt = 0;
        int lowCnt = 0;
        int[] win = {6, 6, 5, 4, 3, 2, 1};

        int[] answer = new int[2];

        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0){
                maxCnt++;
            }
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    maxCnt++;
                    lowCnt++;
                }
            }
        }

        answer[0] = win[maxCnt];
        answer[1] = win[lowCnt];

        return answer;
    }
}
