package OOP_with_java;

abstract class Writer
{
	public abstract void write();
}

class Pen extends Writer
{

	@Override
	public void write() {
		System.out.println("I am Pen");
	}
}

class Pencil extends Writer
{

	@Override
	public void write() {
		System.out.println("I am Pencil");
	}
}

class Kit
{
	public void doSomething(Writer writer) {
		writer.write();
	}
}

public class AbstructClass {
	public static void main(String args[])
	{
		Kit kit = new Kit();
		Writer pen = new Pen();
		Writer pencil = new Pencil();
		
//		kit.doSomething(pen);
		
		kit.doSomething(pencil);
	}
}
