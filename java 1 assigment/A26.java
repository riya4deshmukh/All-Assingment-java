public class A26 {
      public static void main(String[] args) {
 int  pathlength=12000;
int pathbreadth=240;
int baselength=24; 
int basebreadth=15;
int pathArea=pathlength* pathbreadth;
 int basearea=pathlength*basebreadth;
 int numberofbricks=pathArea/basearea;
 System.out.println("number of bricks needed:"+numberofbricks);
 
}
}
