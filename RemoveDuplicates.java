public class RemoveDuplicates{
    public int removeDuplicate(int[] arr){
        if(arr.length == 0) return 0;
        int write = 1;
        for(int read = 1; read < arr.length - 1;read++){
            if(arr[read] != arr[read-1]){
                arr[write] = arr[read];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4};
        RemoveDuplicates obj = new RemoveDuplicates();
        int result = obj.removeDuplicate(arr);
        System.out.println(result);
    }
}