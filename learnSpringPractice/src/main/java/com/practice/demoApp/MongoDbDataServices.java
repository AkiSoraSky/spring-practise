package com.practice.demoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataServices implements DataServices {

	@Override
	public int[] retreieveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
