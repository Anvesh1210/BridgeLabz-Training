class Solution {
    public int calPoints(String[] operations) {
        int [] arr =new int[ operations.length];
        int count=0;
        for(int i=0;i<operations.length;i++){
            switch(operations[i]){
                case "+":
                arr[count]=arr[count-2]+arr[count-1];
                count++;
                break;

                case "D":
                arr[count]=arr[count-1]*2;
                count++;
                break;

                case "C":
                count--;
                break;

                default:
                int a=Integer.parseInt(operations[i]);
                arr[count]=a;
                count++;
                break;
            }
        }
        int sum=0;
        for(int i=0;i<count;i++){
            sum+=arr[i];
        }
        return sum;
    }
}