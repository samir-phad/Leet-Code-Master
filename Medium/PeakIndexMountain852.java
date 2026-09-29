public class PeakIndexMountain852 {
   
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start )/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 0};
        PeakIndexMountain852 p = new PeakIndexMountain852();
        System.out.println(p.peakIndexInMountainArray(arr));
    }
}
