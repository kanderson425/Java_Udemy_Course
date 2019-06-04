public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println(isCatPlaying(true,45));
        System.out.println(isCatPlaying(false,45));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer == true) && (temperature <= 45 && temperature >=25)) {
            return true;
        } else if((summer == false) && (temperature <= 35 && temperature >= 25)) {
            return true;
        }
        return false;
    }
}
