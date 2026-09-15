class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] arr = new double[position.length][2];
        for(int i = 0 ; i<position.length ; i++){
            arr[i][0]=position[i];
            arr[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(arr,(a,b)->Double.compare(b[0],a[0]));
        int count = 0;
        double prevTime = 0;
        for(double[] car:arr){
            if(car[1]>prevTime){
                count++;
                prevTime=car[1];
            }
        }
        return count;
    }
}
