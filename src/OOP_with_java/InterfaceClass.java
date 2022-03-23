package OOP_with_java;
interface WriterInterface
{
	void writer();     		// any method in interface is by default public abstract.
}

class PenInterface implements WriterInterface
{
	@Override
	public void writer() {
		System.out.println("I am Pen");
	}	
}

class PencilInterface implements WriterInterface
{
	@Override
	public void writer() {
		System.out.println("I am Pencil");
	}
}

class KitInterface
{
	public void doSomething(WriterInterface write)
	{
		write.writer();
	}
}

public class InterfaceClass {

	public static void main(String[] args) {
		KitInterface kit = new KitInterface();
		WriterInterface pen = new PenInterface();
		WriterInterface pencil = new PencilInterface();
		
		kit.doSomething(pen);
		
		kit.doSomething(pencil);

	}

}
