package org.access;

public class AccessSpecifier {
	
 public void area()
 {
int a= 10;
int b = 20;
int ab = b-a;
System.out.println(ab);
 }
public static void main(String[] args) {
AccessSpecifier s = new AccessSpecifier();
s.area();
}
}
