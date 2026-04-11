/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee>map=new HashMap<>();
        for(Employee i:employees){
            map.put(i.id,i);
        }
        Queue<Employee>q=new LinkedList<>();
        q.add(map.get(id));
        int ans=0;
        while(!q.isEmpty()){
            Employee curr=q.remove();
            ans+=curr.importance;
            for(int i:curr.subordinates){
                q.add(map.get(i));
            }
        }
        return ans;
    }
}