class MyHashMap {
     public static List<int[]> li ;
    public MyHashMap() {
        li=new ArrayList<int[]>();
    }
    
    public void put(int key, int value) {
        int flag=0;
         for(int i=0;i<li.size();i++)
        {
            int arr[]=li.get(i);
            if(arr[0]==key)
            {
                arr[1]=value;
                flag=1;
            }
        }
        if(flag==0)
        {

        int arr2[]=new int[2];
        arr2[0]=key;
        arr2[1]=value;
        li.add(arr2);
        }
    }
    
    public int get(int key) {
        for(int i=0;i<li.size();i++)
        {
            int arr[]=li.get(i);
            if(arr[0]==key)
            {
                return arr[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
         for(int i=0;i<li.size();i++)
        {
            int arr[]=li.get(i);
            if(arr[0]==key)
            {
                li.remove(arr);
            }
        }
    }
}
