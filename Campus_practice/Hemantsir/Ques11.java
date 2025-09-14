//TCS
/*
 waiting>30m
 n station m buses 1to m represent u,v,s,e x<=s 
 n t m 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
public class Ques11 {  //AlicebusTravel
      static class Bus{
int to,start,end;
Bus(int to,int start,int end){
  this.to=to;
  this.start=start;
  this.end=end;
}
      }
static class State  implements Comparable<State>{
int station,time,maxwait;
State(int station,int time,int maxwait)
{
  this.station=station;
  this.time=time;
  this.maxwait=maxwait;
}                      
public int CompareTo(State other){
  return Integer.compare(this.maxwait, other.maxwait);
}
}
public static int minimizeWait(int n,int t,int m,int[][]buses){
  List<List<Bus>> graph=new ArrayList<>();
for(int i=0;i<=0;i++){
  graph.add(new ArrayList<>());
  for(int []bus:buses){
    int u=bus[0], v=bus[1],s=bus[2],e=bus[3];
    graph.get(u).add(new Bus(v, s, e));
  }
}
PriorityQueue<State>pq=new PriorityQueue<>();
pq.add(new State(1, 0, 0));
int [][]visited=new int[n+1][t+1];
for(int[]rows:visited) Arrays.fill(rows, Integer.MAX_VALUE);
while (!pq.isEmpty()) {
 State current=pq.poll();
 if(current.station==n) return current.maxwait;
 if(current.time>t || visited[current.station][current.time]==current.maxwait)
 continue;
 visited[current.station][current.time]=current.maxwait;
 for(Bus bus:graph.get[current.station]){
  if(current.time<=bus.start){
    int waittime=bus.start-current.time;
    int newTime=bus.end;
    int newmaxWait=Math.max(current.maxwait,waitTime);
    if(newTime<=t && visited[bus.to][newTime]>newmaxWait){
      pq.add(new State(bus.to, newTime,newmaxWait));
    }
  }
 } 
}
return -1;
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int t=sc.nextInt();
  int m=sc.nextInt();
  int[][]buses=new int[m][4];
  for(int i=0;i<m;i++){
  buses[i][0]=sc.nextInt();
  buses[i][1]=sc.nextInt();
  buses[i][2]=sc.nextInt();
  buses[i][3]=sc.nextInt();
int result=minimizeWait(n, t, m, buses);
System.out.println(result);
}
    }
  }
  //basic difference b/w syncronized keyword, lock and semaphore in multithreading