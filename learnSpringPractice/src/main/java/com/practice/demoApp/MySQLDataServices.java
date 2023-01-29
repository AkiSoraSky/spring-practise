package com.practice.demoApp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class MySQLDataServices implements DataServices {

	@Override
	public int[] retreieveData() {
		// TODO Auto-generated method stub
		return new int[] {11,22,33,44,55};

	}

}
