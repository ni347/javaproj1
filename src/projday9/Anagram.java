package projday9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Anagram
{
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length())
    {
    return rst;
    }
        
    int[] map_p = new int[26];
    int[] map_s = new int[26];
    
    for (int i = 0; i < p.length(); i++)
    {
        map_p[p.charAt(i) - 'a']++;
    }
    for (int i = 0; i < p.length(); i++)
    {
        map_s[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length() - p.length(); i++)
    {
        if (isMatch(map_p, map_s))
        {
            rst.add(i);
        }
        
        map_s[s.charAt(i+p.length()) - 'a']++;
        map_s[s.charAt(i) - 'a']--;
    }
    if (isMatch(map_p, map_s))
    {
        rst.add(s.length() - p.length());
    }
    return rst;
}
public boolean isMatch(int[] arr1, int[] arr2)
{
    for (int i = 0; i < arr1.length; i++)
    {
        if (arr1[i] != arr2[i])
        {
            return false;
        }
    }
    return true;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = "cbaebabacd";
String p = "abc";
Anagram source = new Anagram();
System.out.println(source.findAnagrams(s,p));
sc.close(); }
}