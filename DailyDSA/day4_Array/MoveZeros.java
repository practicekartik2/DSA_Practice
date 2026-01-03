public class MoveZeros {
    public int[] nums={1,2,3,4,5,6};

    public void moveZeros(){
        for(int n: nums){
            System.out.println(n);
        }
    }

    public static void main(String[] args){
        MoveZeros mz=new MoveZeros();
        mz.moveZeros();
    }
}
