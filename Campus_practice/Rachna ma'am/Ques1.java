public class Ques1{
public static void main(String args[]){
    int x=3;
    String s="abcda";
    int st=0,e=s.length();
    int c=0;
    StringBuffer str=new StringBuffer();
for(int i=0;i<s.length();i++){
    for(int j=1;j<s.length();j++){
if(s.charAt(i)==s.charAt(j)){
    c++;
}
char c1=s.charAt(i);
int newchar=0;
char ans=' '; 
if(c%2==0){
newchar=(c1-'a'+x+26)%26+'a';
ans=char(newchar);
}
else{
 c1=s.charAt(i);
newchar=(c1-'a'-x+26)%26+'a';
}
    }
str.append((char)newchar);
}
System.out.println(str);
}
}