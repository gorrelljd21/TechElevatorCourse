package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Weave {
    public static void main(String[] args) {

        List<Integer> one = new ArrayList<>();
        one.add(1);

        List<Integer> two = new ArrayList<>();
        two.add(4);
        two.add(5);
        two.add(6);

        List<Integer> result = interLeaveList(one, two);
        System.out.println(result);

    }

    public static List<Integer> interLeaveList(List<Integer> listOne, List<Integer> listTwo){
        List<Integer> results = new ArrayList<>();

        int shortSize = listOne.size();
        if (listTwo.size() < listOne.size()) {
            shortSize = listTwo.size();
        }

        for(int index = 0; index < shortSize; index++){
            results.add(listOne.get(index));
            results.add(listTwo.get(index));
        }

        List<Integer> longList = null;

        if(listOne.size() > listTwo.size()){
            longList = listOne;
        } else {
            longList = listTwo;
        }

        // use Ternary -->>> List<Integer> longList = (listOne.size() > listTwo.size() ? lineOne : listTwo)

        for(int index = shortSize; index < longList.size(); index++){
            results.add(longList.get(index));
        }
        return results;
    }
}
