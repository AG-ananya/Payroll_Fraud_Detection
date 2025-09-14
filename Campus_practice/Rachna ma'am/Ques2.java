//Valid IP address no. only in b/w 0-255 and any addition leading zero will consider invalid ip: IPv4 =222.111.111.111 op 1, 10.0.0.01 op 1

import java.util.HashSet;
import java.util.Scanner;

public class Ques2 {
    public static void isvalid(String str){
        HashSet<Character>x1=new HashSet<>();
        HashSet<Character>x2=new HashSet<>();
        HashSet<Character>x3=new HashSet<>();
        HashSet<Character>x4=new HashSet<>();
        int indx=0;
for(int i=0;i<str.length();i++){
    if(str.charAt(i)!='.'){
        x1.add(str.charAt(i));
indx=i;
    }
    else{
        break;
    }
}
for(int i=indx+1;i<str.length()-indx;i++){
if(str.charAt(i)!='.'){
        x2.add(str.charAt(i));
indx=i;
    }
    else{
        break;
    }
}
for(int i=indx+1;i<str.length()-indx;i++){
if(str.charAt(i)!='.'){
        x3.add(str.charAt(i));
indx=i;
    }
    else{
        break;
    }
}
for(int i=indx+1;i<str.length()-indx;i++){
if(str.charAt(i)!='.'){
        x4.add(str.charAt(i));
indx=i;
    }
    else{
        break;
    }
}
boolean ans=false;
String n1=String.valueOf(x1);
int X1=Integer.parseInt(n1);
String n2=String.valueOf(x2);
int X2=Integer.parseInt(n2);
String n3=String.valueOf(x3);
int X3=Integer.parseInt(n3);
String n4=String.valueOf(x4);
int X4=Integer.parseInt(n4);
if((X1>0 || X1<255) &&(X2>0 || X2<255) &&(X3>0 || X3<255) && (X4>0 || X4<255) ){
ans=true;
}
System.out.println(ans);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
isvalid(str);
    }
}
