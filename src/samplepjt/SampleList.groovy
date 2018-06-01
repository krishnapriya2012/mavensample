package samplepjt

import groovy.beans.PropertyReader

class SampleList {
	static def z=[1:"x",2:"y",3:"z"]
	static def a=["a","b","c","d"];
	void interg()
	{
		println a;
		println a.get(1);
		a.pop();
		a.putAt 5, "z";
		println a;
		println z;
		
		z.put(3,"z1");
		println z;
		z.remove(1);
		println z;
		def m=z.get(-5);
		println m;
		def k=z.values();
		println k;
		def f1=new File("./config.properties").getText();
		println f1;
	}
}