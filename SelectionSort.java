static void selectionSort (int [] arr){
    int n= arr.length;
    int temp = 0 ;
    for(int i = 0 ; i < n ; i++){
        for(int j =i ; j<n ; j++){
            if(arr[i]>arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

