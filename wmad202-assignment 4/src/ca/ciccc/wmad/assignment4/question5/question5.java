//Write a Java method which has a list of points as its input parameter. Each point is
//represented by a dictionary with 3 keys and each key has a value. The keys of the point
//dictionary is “x”, “y” and “z”. Each point represent a position in the 3D coordination
//system (space). The method should find and return the point in the input list which has
//the minimum distance to the center of the coordination system. The center of the
//coordination system is a point whose values for all the keys are 0 (i.e: center = {“x”=0,
//“y”=0, “z”=0}
//- The distance between two points (x1,y1,z1) and (x2, y2, z2) in coordination system is
//calculated using the following formula:
//distance = Sqrt ((x1-x2)**2 + (y1-y2)**2 + (z1-z2)**2)
//for example:
//point1=(2,5,6) and point2 = (1,1,1) then the distance is
//distance = sqrt ((2-1)**2 + (5-1)**2 + (6-1)**2) = sqrt (1+16+25) = sqrt (42)
//some sample data point
//samplePointList = [{“x”:1, ”y”:4, ”z”:1},{“x”:3, ”y”:7, ”z”:10},
//                                      {“x”:-1, ”y”:3, ”z”:4},{“x”:4, ”y”:4, ”z”:2},
//                                      {“x”:7,” y”:-4, ”z”:0},{“x”:10, ”y”:4, ”z”:1}]
package ca.ciccc.wmad.assignment4.question5;

import java.util.ArrayList;
import java.util.HashMap;

public class question5 {

    public void closestPoint() {
        HashMap<Character, Integer> point1 = sampleList().get(0);
        double minimumDistance = calculateMinimumDistance(sampleList().get(0), centrePoint());
        int i;
        for (i = 1; i < sampleList().size(); i++) {
            if (calculateMinimumDistance(sampleList().get(i),centrePoint()) < minimumDistance) {
                minimumDistance = calculateMinimumDistance(sampleList().get(i), centrePoint());
                point1 = (sampleList().get(i));
            }
        }
        System.out.println("Closest Point from centre of coordinate is : ");
        System.out.print(point1);
    }
    private double calculateMinimumDistance(HashMap<Character,Integer> p1,HashMap<Character,Integer> p2){
        return Math.sqrt(Math.pow(p1.get('x')-p2.get('x'),2)+Math.pow(p1.get('y')-p2.get('y'),2)+Math.pow(p1.get('z')-p2.get('z'),2));
    }

    private HashMap<Character,Integer> centrePoint(){

        HashMap<Character,Integer> constantCentrePoint=new HashMap<>();
        constantCentrePoint.put('x',0);
        constantCentrePoint.put('y',0);
        constantCentrePoint.put('z',0);

        return constantCentrePoint;
    }
    private ArrayList<HashMap<Character,Integer> > sampleList(){
       ArrayList<HashMap<Character,Integer> > samplePointList= new ArrayList<>();

        samplePointList.add(samplePoint(1,4,1));
        samplePointList.add(samplePoint(3,7,10));
        samplePointList.add(samplePoint(-1,3,4));
        samplePointList.add(samplePoint(4,4,2));
        samplePointList.add(samplePoint(7,-4,0));
        samplePointList.add(samplePoint(10,4,1));

        return samplePointList;
    }

    private HashMap<Character,Integer> samplePoint(int x,int y, int z ){
       HashMap<Character,Integer> Point=new HashMap<>();
       Point.put('x',x);
       Point.put('y',y);
       Point.put('z',z);
       return Point;
   }
}
