interface ApiInterface{
	void printer();
}

class Api implements ApiInterface{
	public void printer(){
		System.out.println("api-printer");
	}
}

class Factory{
	public static ApiInterface factory(){
		return new Api();
	}
}

class ApiMain{
	public static void main(String[] args){
		ApiInterface ap = Factory.factory();
		ap.printer();
	}
}
