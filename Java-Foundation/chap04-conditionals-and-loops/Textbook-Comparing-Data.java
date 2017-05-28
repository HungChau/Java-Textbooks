if (Math.abs(f1 - f2) < TOLERANCE)
	System.out.println ("Essentially equal.");

if (ch1 > ch2)
	System.out.println (ch1 + " is greater than " + ch2);
else
	System.out.println (ch1 + " is NOT greater than " + ch2);    

if (name1.equals(name2))
	System.out.println ("The names are the same.");
else
	System.out.println ("The names are not the same.");

String str = "software";
if (str == "software")
	System.out.println ("References are the same");

if (str.equals("software"))
	System.out.println ("Characters are the same");

int result = name1.compareTo(name2);
if (result < 0)
	System.out.println (name1 + " comes before " + name2);
else
	if (result == 0)
	System.out.println ("The names are equal.");
else
	System.out.println (name1 + " follows " + name2);