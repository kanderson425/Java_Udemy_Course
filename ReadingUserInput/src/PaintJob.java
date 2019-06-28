public class PaintJob {

    public static void main(String[] args) {
        getBucketCount(3.26, 0.75);

    }

    //#1
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0 || height <= 0 || areaPerBucket <= 0) || (double) extraBuckets < 0) {
            System.out.println("-1");
            return -1;
        } else {

            double buckets = ((width * height) - (areaPerBucket * (double) extraBuckets)) / areaPerBucket;
            int converted = (int) Math.ceil(buckets);
            System.out.println(converted);
            return converted;
        }
    }

    // #2
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            int buckets = (int) Math.ceil((width * height) / areaPerBucket);
            System.out.println(buckets);
            return buckets;
        }

    }

    // #3
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            int buckets = (int) Math.ceil(area / areaPerBucket);
            System.out.println(buckets);
            return buckets;
        }
    }

}
