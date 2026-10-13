// class OrderedStream {
//     TreeMap<Integer,String>map;
//     int N;
//     public OrderedStream(int n) {
//         map=new TreeMap<>();
//         N=n;
//     }
//     public List<String> insert(int idKey, String value) {
//         map.put(idKey,value);
//         boolean b=true;
//         for(int i=1;i<=idKey;i++){
//             if(!map.containsKey(i)){
//                 return new ArrayList<>();
//             }
//         }
//         List<String>ans=new ArrayList<>();
//         for(int i=idKey;i<=N;i++){
//             if(!map.containsKey(i)){
//                 break;
//             }
//             ans.add(map.get(i));
//         }
//         return ans;
//     }
// }
class OrderedStream {
    String arr[];
    int N;
    public OrderedStream(int n) {
        arr=new String[n];
        N=n;
    }
    public List<String> insert(int idKey, String value) {
        arr[idKey-1]=value;
        List<String>ans=new ArrayList<>();
        for(int i=0;i<idKey-1;i++){
            if(arr[i]==null){
                return new ArrayList<>();
            }
        }
        for(int i=idKey-1;i<N;i++){
            if(arr[i]==null){
                break;
            }
            ans.add(arr[i]);
        }
        return ans;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */