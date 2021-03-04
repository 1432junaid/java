class AllMethods{
	public static void main(String[] args){
		String s1 = "Lucknow";
		String s2 = "lucknow";
		System.out.println(s1.indexOf('k'));
		char[] ca = s1.toCharArray();
		System.out.println(ca.length);
		System.out.println(ca[4]);
		ca[4] = 'j';
		String s3 = new String(ca);
		System.out.println(s3);
		String sp = "my name is jd";
		String[] sa = sp.split("na");		//mind this argument [note: not a character]
		System.out.println(sa[0]);
		System.out.println(sa[1]);
	}
}
