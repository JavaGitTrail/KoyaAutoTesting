package com.koya.AutoFrame;

import com.koya.AutoFrame.Frameworks.Functions;

public class KoyaMain {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          
      Functions.Login("maniadmin", "123456","http://koyalawcus.cloudapp.net");  
      Functions.SearchAgreement();
      Functions.ExecutedAgreements();
      Functions.GoBack();
      Thread.sleep(2000);
      Functions.SearchAgreement();
      Functions.DraftAgreements();
	}

}
