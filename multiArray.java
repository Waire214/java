public class multiArray {
    public static void main(String[] args) {
        twoDimenArrays arr = new twoDimenArrays();
        arr.loop();

        jaggedArrays jarr = new jaggedArrays();
        jarr.loop();
    }
}

class twoDimenArrays {
    int nums[][] = new int[3][4];

    
    public int loop() {
    
        for(int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.println(nums[i][j] + " ");
            } 
            System.out.println();
        }

        for(int n[]: nums) {
            for(int m: n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }

        return 1;
    }
}

class jaggedArrays {
    int nums[][] = new int[3][];

    
    public int loop() {
    
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0; i<nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
                System.out.println(nums[i][j] + " ");
            } 
            System.out.println();
        }

        for(int n[]: nums) {
            for(int m: n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }

        return 1;
    }
}
