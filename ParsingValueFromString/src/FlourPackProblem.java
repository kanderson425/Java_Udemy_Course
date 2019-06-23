public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack2(2,1,5));
    }

//My attempt
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if( bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(((bigCount * 5) + smallCount) == goal) {
            return true;
        }
        if(((bigCount * 5) + smallCount) < goal) {
            return false;
        }
        if(((bigCount * 5) + smallCount) > goal) {
            if(bigCount > (goal / 5)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean canPack2(int bigCount, int smallCount, int goal) {
        if( bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(goal < 5) {
            if(goal <= smallCount) {
                return true;
            }
            return false;
        }
        if(goal % 5 <= smallCount && (bigCount * 5) + smallCount >= goal) {
            return true;
        }
        return false;
    }

}
