package springtest;


public class Triangle {
private point p1;
private point p2;
private point p3;
public point getP1() {
	return p1;
}
public void setP1(point p1) {
	this.p1 = p1;
}
public point getP2() {
	return p2;
}
public void setP2(point p2) {
	this.p2 = p2;
}
public point getP3() {
	return p3;
}
public void setP3(point p3) {
	this.p3 = p3;
}

public void show(){
	System.out.println(getP2().getX()+" "+getP1().getX());
}




//pulling changes for remote to local
}
