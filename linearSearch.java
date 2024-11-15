static void linearSearch (int [] arr, int item){
    int n = arr.length;
    boolean flag = true;
    for(int i = 0 ; i < n ; i++){
        if(arr[i]==item){
            flag=false;
            System.out.println("Found item in index = " + i );
        }
    }
    if (flag){
        System.out.println("This item not found !! ");
    }
}