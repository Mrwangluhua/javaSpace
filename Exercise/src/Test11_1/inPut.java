package Test11_1;

public class inPut {
    public static void main(String[] args) {
        String[][] chengji = {
                {"小传", "D", "C", "B", "A", "D"},
                {"小智", "A", "D", "B", "C", "D"},
                {"小播", "A", "D", "B", "C", "A"},
                {"小课", "A", "B", "C", "D", "D"}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(chengji[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


