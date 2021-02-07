package com.company;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        double sum = subject1Marks+subject2Marks+subject3Marks;
        String result = "";

        if(subject1Marks>60||subject2Marks>60||subject3Marks>60||sum<60)
        {
            result = "failed";
        }
        else if((subject1Marks+subject2Marks)>60||(subject2Marks+subject3Marks)>60||(subject1Marks+subject3Marks)>60)
        {
            result = "Passed \npromoted";
        }
        else if(sum>60)
        {
            result = "passed";
        }

        return result;
    }
}

public class Assignmenet1Q4 {
    public static void main(String[] args) {
        ResultDeclaration obj = new ResultDeclaration();
        System.out.println(obj.declareResults(10,30,40));

    }
}
