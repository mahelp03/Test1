
public class Sample {
	static int classVar=0;
	int instVar = 0;
	int instVar1 =0;
	
	static {
		if(Math.abs(classVar) < 0)
			classVar = 10;
	}
	static int incrNum(int iv) {
		int ic = iv +1;
		
		return ic;
	}
	Sample(){
		instVar =0;
		instVar1 =0;
	}
	Sample(int i){
		instVar =0;
		instVar1 = i;
	}
	public static void main(String []args) {
		System.out.println(Sample.classVar);
		Sample sp = new Sample();
		Sample sp1 = new Sample(1);
		System.out.println(Sample.incrNum(sp.instVar));
		System.out.println(Sample.incrNum(sp.instVar1));
		System.out.println(Sample.incrNum(sp1.instVar));
		System.out.println(Sample.incrNum(sp1.instVar1));
	}
}
