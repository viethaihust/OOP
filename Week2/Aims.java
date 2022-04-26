
public class Aims {

	public static void main(String[] args) {
		Order anOrder = new Order();
	   // Create a new dvd object and set the fields
	   DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king");
	   dvd1.setCategory("Animation");
	   dvd1.setCost(19.95f);
	   dvd1.setDirector("roger allers");
	   dvd1.setLength(87);
	   anOrder.addDigitalVideoDisc(dvd1);
	   
	   DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star war");
	   dvd2.setCategory("Science fiction");
	   dvd2.setCost(24.95f);
	   dvd2.setDirector("Geogre lucas");
	   dvd2.setLength(124);
	   anOrder.addDigitalVideoDisc(dvd2);
	   
	   DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
	   dvd3.setCategory("Animation");
	   dvd3.setCost(18.99f);
	   dvd3.setDirector("roger allers");
	   dvd3.setLength(90);
	   anOrder.addDigitalVideoDisc(dvd3);
	   
	   System.out.print("Total Cost is: ");
	   System.out.println(anOrder.totalCost());
	}

}
