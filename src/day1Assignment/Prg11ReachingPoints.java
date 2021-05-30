package day1Assignment;

public class Prg11ReachingPoints {

	public static void main(String[] args) {
		Prg11ReachingPoints reach = new Prg11ReachingPoints();
		System.out.println(reach.reachingPoints(1,1,2,2));

	}

	private boolean reachingPoints(int srcx, int srcy, int destx, int desty) {
		if(srcx == destx && srcy == desty) {
				return true;}
		else if(srcx > destx || srcy > desty) {
				return false;}
		else if(srcx < destx || srcy < desty) {
		return (reachingPoints(srcx+srcy, srcy, destx, desty) || (reachingPoints(srcx, srcx+srcy, destx, desty)));
		}
		return false;
	}

}
