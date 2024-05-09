package day0623;
/**
 * 학생의 점수를 처리하는 프로그램 작성
 * @author user
 */
public class Work0623 {

    public static final int TOTAL = 0;
    public static final int AVG = 1;

    /**
     * 학생의 총점을 구하는 일
     * @param score 점수를 저장한 일차원 배열
     * @return 일차원 배열의 누적합
     */
    public int studentTotal(int[] score) {
        int totalScore = 0;
        for(int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return totalScore;
    }

    /**
     * 점수를 구하는 일
     */
    public void scoreProcess() {
        //java, oracle, jdbc
        String[] names = {"김선경","김주민","박상준","서효민","송지하","오호수"};
        int[][] score = {{84,87,79},{91,100,97},{75,79,79},{63,66,62},{99,99,99},{82,86,83}};
        int total, top = 0;
        double avg, subjectAvg;
        int subjectTotal = 0;
        String topStudent = "";
        int topNo = 0;
        int[] subjectTotalArr = new int[score[0].length];
        double[] subjectAvgArr = new double[score[0].length];

        System.out.println("--------------------------------------------------------");
        System.out.println("번호\t이름\t자바\t오라클\tJDBC\t총점\t평균");
        System.out.println("--------------------------------------------------------");

        for(int i = 0; i < score.length; i++) {
            System.out.printf("%d\t%s\t",(i+1),names[i]);
            total = studentTotal(score[i]); //총점
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("%d\t",score[i][j]);
            }
            avg = (double)total/score[i].length; //평균
            System.out.printf("%d\t %.2f\n", total, avg);
            
            //1등 학생의 이름과 번호
            if(top < total) {
                topNo = i;
                top = total;
            }
        }//end for

        System.out.println("--------------------------------------------------------");

        //[방법1] 총점과 평균
        for(int i = 0; i < score[i].length; i++) { //열
            for(int j = 0; j < score.length; j++) { //행
                subjectTotalArr[i] += score[j][i];
            }
            subjectAvgArr[i] = (double)subjectTotalArr[i]/score.length;
        }

        //자바, 오라클, JDBC 과목별 총점
        System.out.printf("\t총점\t");
        for(int subTotal : subjectTotalArr) {
            System.out.printf("%d\t",subTotal);
        }

        //자바, 오라클, JDBC 과목별 평균
        System.out.printf("\n\t평균\t");
        for(double subAvg : subjectAvgArr) {
            System.out.printf("%.2f\t",subAvg);
        }
        
        //------------------------------------------------------------------------------

        //[방법2] 총점과 평균을 한 번에 출력
        String[] procTitle = {"총점","평균"};
        System.out.println();
        for(int proc = 0; proc < procTitle.length; proc++) {
            System.out.print("\t" + procTitle[proc] + "\t"); 
            for(int i = 0; i < score[0].length; i++) { //열
                for(int j = 0; j < score.length; j++) { //행
                    subjectTotal += score[j][i]; //총점
                }   subjectAvg = (double)subjectTotal / score.length; //평균
                if (proc == TOTAL) { //TOTAL = 0
                    System.out.printf("%d\t", subjectTotal); //총점 출력
                } else if(proc == AVG){ //AVG = 1
                    System.out.printf("%.2f\t", subjectAvg); //평균 출력
                }//end if
                subjectTotal = 0;    
            }//end for
            System.out.println();
        }//end for

        //1등 학생의 이름과 번호를 출력
        topStudent = names[topNo];
        System.out.println("\n\t[1등] " + (topNo+1) + "번 " + topStudent);
    }//scoreProcess

    public static void main(String[] args) {

        new Work0623().scoreProcess();

    }//main

}//class
