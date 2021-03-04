interface ApiInterface{
	void printer();
}

class ApiClass{
	public m(ApiInterface ia)(){
		ia.printer();
	}
}

class Factory{
	public static ApiInterface factory(){
		return new ApiClass();
	}
}

class ApiMain{
	public static void main(String[] args){
		ApiInterface ap = Factory.factory();
		ap.printer();
	}
}
