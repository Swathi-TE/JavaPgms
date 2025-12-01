package SessionPgms;

public class VariablePgm {
public static void m1()
{
	System.out.println("hi");
}
public void m2()
{
	System.out.println("Hello");
}

public static void main(String[] args)
{
	m1();
	VariablePgm p=new VariablePgm();
	p.m2();
}
}
