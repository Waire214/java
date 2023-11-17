public class multiArray {
    public static void main(String[] args) {
        twoDimenArrays arr = new twoDimenArrays();
        arr.loop();

        jaggedArrays jarr = new jaggedArrays();
        jarr.loop();

        students s1 = new students();
        s1.rollNo = 3;
        s1.name = "T";
        s1.mark = 13;

        students s2 = new students();
        s2.rollNo = 1;
        s2.name = "B";
        s2.mark = 10;

        students s3 = new students();
        s3.rollNo = 4;
        s3.name = "N";
        s3.mark = 19;

        // array of objects
        students students[] = new students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
        
        for (students n: students) {
            System.out.println(n.mark);
        }

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

class students {
    int rollNo;
    String name;
    int mark;
}