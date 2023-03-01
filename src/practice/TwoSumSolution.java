package practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumSolution {
    boolean isTwoSum(List<Integer> nums, int targetNum) {
        Set<Integer> numSet = new HashSet<>(); //numSet 초기화

        for (int num : nums) { //nums 리스트의 요소들을 하나씩 순회하면서, 현재 처리 중인 요소를 num 이라고 하자
            if (numSet.contains(targetNum - num)) { //만약 HashSet 인 numSet 에 (target-num)이 존재한다면,
                return true; // 두 수의 합이 'targetNum' 과 같은 경우가 있기 떄문에 true 반환

            } //만약 HashSet 인 numSet 에 targetNum - num 이 존재하지 않는다면,두 개의 수의 합이 targetNum 과 같은 경우가 아직 발견되지 않았다는 것
            numSet.add(num); // 따라서, 이후에 처리할 요소들과도 비교하기 위해 num 을 HashSet 인 numSet 에 추가해줍니다.
        }
        return false;
    }
}
