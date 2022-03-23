package OOP_with_java;
class Engine {
	int speed;
	Engine(int speed){
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	@Override
	public String toString() {
		return " ---Engine [speed=" + speed + "]";
	}	
}
public final class ImmutableClass {
	private final int id;
	private final String name;
	private final Engine engine;
	public ImmutableClass(int id, String name, Engine engine) {
		this.id = id;
		this.name = name;
		this.engine = new Engine(engine.getSpeed()); // Always create new instance for mutable object.
//		this.engine = engine; //never do this.
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Engine getEngine() {
		return new Engine(engine.getSpeed());
	}
	public static void main(String[] args) {
		Engine eng= new Engine(50);
		ImmutableClass imclass = new ImmutableClass(1, "Toyota", eng);
		System.out.println(imclass.getId() +" "+  imclass.getName() + imclass.getEngine().toString());
		eng.speed= 70;
		System.out.println(imclass.getId() +" "+  imclass.getName() + imclass.getEngine().toString());
	}
}
