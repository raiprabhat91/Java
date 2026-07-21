String[] IMPERIAL_UNITS = new String[3];
IMPERIAL_UNITS[0] = "FT";
IMPERIAL_UNITS[0] = "ft";
IMPERIAL_UNITS[1] = "lb";
IMPERIAL_UNITS[2] = "f";
IMPERIAL_UNITS;
IMPERIAL_UNITS[2] = IMPERIAL_UNITS[2].toUpperCase();
IMPERIAL_UNITS;
String[] SI_UNITS = {"s","m","kg","A","K","mol","cd"};
String n1 = "Is it cold?", n2 = "Is it heavy?", n3 = "Is it long?";
String n1 = "Is it cold?", n2 = "Is it heavy?", n3 = "Is it long?";
String n1 = "Is it cold?", n2 = "Is it heavy?", n3 = "Is it long?";
String[] notes = {n1,n2,n3};
var values = new double[]{142.7,12.52,36.9}; // we need to mention new double because we are using var(type referance)
String[] units = {SI_UNITS[4],IMPERIAL_UNITS[1],IMPERIAL_UNITS[0]};
final double ft2m = 0.3048;
final double lb2kb = 0.4536;
values[1] = values[1] *ft2m;
units[1] = SI_UNITS[1];
values[2] *= lb2kb;
units[2] = SI_UNITS[2];
values
units
String[] measurements = new String[3];
measurements[0] = notes[0] + '\t' + values[0] + ' ' + units[0];
measurements[1] = notes[1] + '\t' + values[1] + ' ' + units[1];
measurements[2] = notes[2] + '\t' + values[2] + ' ' + units[2];
int counter = 0;
String measurementsReport = (++counter) + " " +measurements[counter-1] + "\n" + (++counter) + " " + measurements[counter-1] + "\n" + (++counter) + " " + measurements[counter-1]+"\n";
measurementsReport
System.out.print(measurementsReport);