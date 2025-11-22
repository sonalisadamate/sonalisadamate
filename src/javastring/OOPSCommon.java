package javastring;

public class OOPSCommon {   //encapculation
	
	private int length; //define data
	private int width;
	private int height;

	public void setBoxDimension(int l, int b, int h)
{
if(l>=1 && b>=1 && h>=1)
{
	System.out.println("Box created with dimensions "+l+" "+b+" "+h+" ");
}
else {
System.out.println("Invalid dimensions");
}
}
public int setLength(int l)
{
if(l>=1)
{
length=l;
}
else{
System.out.println("Invalid length");
}

return length;
}
public int setWidth(int w)
{
length=w;
return width;
}
public int setHeight(int h)
{
length=h;
return length;
}
public int getLength(int l)
{
return length;

}
public int getWidth(int w)
{
return width;

}
public int getHeight(int h)
{
return height;

}


}
