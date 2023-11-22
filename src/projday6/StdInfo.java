package projday6;

import java.util.ArrayList;
public class StdInfo {
public ArrayList<String> changeOccurrence(ArrayList<String> a,String m,String n){
for(int i = 0; i<a.size(); i++) {
String currentStr = a.get(i);
if(currentStr.equals(m))
a.set(i, n);
}
return a;
}
public String listIndex(ArrayList<String> list) {
return list.get(0);
}
public ArrayList<String> listAfter(ArrayList<String> a, String m, String n){

int i = a.indexOf(m)+1;
a.set(2, "C");

a.add(i, n);

return a;
}
public static void main(String[] args) {
StdInfo st = new StdInfo();
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
list.add("D");

System.out.println(st.changeOccurrence(list, "C", "S"));

System.out.println(st.listIndex(list));

System.out.println(st.listAfter(list, "D", "E"));
}
}