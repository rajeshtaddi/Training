

public class InstrumentTest {
	public static void main(String[] args) {
		System.out.println("-----GUITAR------");
		Guitar gObj = new Guitar();
		gObj.use();
		gObj.play();
		gObj.tuneStrings();
		gObj.pluck();
		System.out.println("-----VIOLIN-------");
		Violin vObj = new Violin();
		vObj.use();
		vObj.play();
		vObj.tuneStrings();
		vObj.bow();
		System.out.println("-----FLUTE--------");
		Flute fObj=new Flute();
		fObj.use();
		fObj.play();
		fObj.blowAir();
		fObj.flautist();
		System.out.println("-------HARMONIUM-------");
		Harmonium hObj=new Harmonium();
		hObj.use();
		hObj.play();
		hObj.blowAir();
		hObj.harmoniumist();
		System.out.println("--------TABLA---------");
		Tabla tObj=new Tabla();
		tObj.use();
		tObj.play();
		tObj.tuneSurface();
		tObj.tabalchi();
		System.out.println("-------DHOL---------");
		Dhol dObj=new Dhol();
		dObj.use();
		dObj.play();
		dObj.tuneSurface();
		dObj.dholi();
		System.out.println("--------SURGICAL CUTTER-----");
		SurgicalCutter surCutObj=new SurgicalCutter();
		surCutObj.use();
		surCutObj.operate();
		surCutObj.sterile();
		surCutObj.sterilizes();
		System.out.println("--------SURGICAL NEEDLE-------");
		SurgicalNeedle surNedObj=new SurgicalNeedle();
		surNedObj.use();
		surNedObj.operate();
		surNedObj.sterile();
		surNedObj.stiching();
		System.out.println("---------GLUCOMETER-------");
		Glucometer gmObj=new Glucometer();
		gmObj.use();
		gmObj.operate();
		gmObj.reader();
		gmObj.sugarRead();
		System.out.println("--------ECG MACHINE-------");
		ECGMachine ecgObj=new ECGMachine();
		ecgObj.use();
		ecgObj.operate();
		ecgObj.reader();
		ecgObj.diagnose();
		
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}


class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
}
abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
} 
class Flute extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using flute...");
	}
	void play() {
		System.out.println("Playing flute...");

	}
	void blowAir() {
		System.out.println("Blowing Air into flute...");

	}
	void flautist() { //playing flute
		System.out.println("Flutist Playing Flute using mouth ");
	}
}
class Harmonium extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Harmonium...");
	}
	void play() {
		System.out.println("Playing Harmonium...");

	}
	void blowAir() {
		System.out.println("Blowing Air into Harmonium...");

	}
	void harmoniumist() {
		System.out.println("Harmoniumist is Playing Harmonium using Hands");
	}
}
abstract class DrumBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneSurface();
} 
class Tabla extends DrumBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Tabla...");
	}
	void play() {
		System.out.println("Playing Tabla...");

	}
	void tuneSurface() {
		System.out.println("Tuning the Surface of Tabla...");

	}
	void tabalchi() { //Tabla Player
		System.out.println("Tabalchi is Playing Tabla using Hands");
	}
}
class Dhol extends DrumBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Dhol...");
	}
	void play() {
		System.out.println("Playing Dhol...");

	}
	void tuneSurface() {
		System.out.println("Tuning the Surface of Dhol...");

	}
	void dholi() { //Dhol Player
		System.out.println("Dholi is Playing Dhol using Hands");
	}
}
abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}
abstract class SurgicalInstrument extends MedicalInstrument
{
	abstract void sterile();
}
class SurgicalCutter extends SurgicalInstrument
{
	public void use() {
		System.out.println("Using SurgicalCutter...");
	}
	void operate() {
		System.out.println("Operating SurgicalCutter....");
	}
	void sterile() {
		System.out.println("Sterilization using Surgical Cutter");
	}
	void sterilizes() {
		System.out.println("Sterile processing technician..");
	}
}
class SurgicalNeedle extends SurgicalInstrument
{
	public void use() {
		System.out.println("Using SurgicalNeedle...");
	}
	void operate() {
		System.out.println("Operating SurgicalNeedle....");
	}
	void sterile() {
		System.out.println("Sterilization using Surgical Needle");
	}
	void stiching() {
		System.out.println("Stiching using the Surgical Needle..");
	}
}
abstract class PathologicalInstrument extends MedicalInstrument
{
	abstract void reader();
}
class Glucometer extends PathologicalInstrument
{
	public void use() {
		System.out.println("Using Glucometer...");
	}
	void operate() {
		System.out.println("Operating Glucometer....");
	}
	void reader() {
		System.out.println("Reading using Glucometer");
	}
	void sugarRead() {
		System.out.println("Monitoring blood sugar using Glucometer");
	}
}
class ECGMachine extends PathologicalInstrument
{
	public void use() {
		System.out.println("Using ECGMachine...");
	}
	void operate() {
		System.out.println("Operating ECGMachine....");
	}
	void reader() {
		System.out.println("Reading using ECGMachine");
	}
	void diagnose() {
		System.out.println("Monitoring conditions effectinh heart using ECGMachine");
	}
}
