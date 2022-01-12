final class ImmutableClass {
	private int i;
	public ImmutableClass(int i) {
		this.i=i;
	}
	public ImmutableClass modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else {
			return (new ImmutableClass(i));
		}
	}
	public static void main(String[] args) {
		ImmutableClass c1=new ImmutableClass(10);
		ImmutableClass c2=c1.modify(100);
		ImmutableClass c3=c1.modify(10);
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		ImmutableClass c4=c1.modify(100);
		System.out.println(c2==c3);
		
	}

}
