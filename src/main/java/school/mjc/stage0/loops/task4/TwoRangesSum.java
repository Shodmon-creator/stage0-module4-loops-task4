package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int countedSum = 0;
        int skippedSum = 0;

        for (int i = 0; i < Math.abs(lastInRow); i++) {
            if (i!=numberToSkip){
                countedSum+=i;
            }else {
                skippedSum+=i;
            }


            if (countedSum > lastInRow) {
                System.out.println("number to skip is bugger then the last");
                break;
            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");
                break;
            } else {
                System.out.println("skipped sum is " + skippedSum);
                System.out.println("counted sum is " + countedSum);
                break;
            }
        }





    }
}
