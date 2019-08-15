class BubbleSort extends Array{
  void bubleSort()
  {
    int loc;
    int com=0;
    int dir;
    System.out.println("The Sorted Array is");
    for(int i= 0;i<size;i++){
      System.out.println("the vaue of i ="+i);
      arrayShow();
      for (int j=0;j<size ;j++ ) {
        com++;
        dir=i;
        if (arr[dir]<arr[j]){
          loc= i;
          int swap = arr[i];
          arr[i]=arr[j];
          arr[j]=swap;
          loc= j;
          dir=loc;
        }
      }
    }
    System.out.println("the value of inputs="+size);
    System.out.println("the value of inputs^2="+size*size);
    System.out.println("the value of complexity ="+com);
  }
}
