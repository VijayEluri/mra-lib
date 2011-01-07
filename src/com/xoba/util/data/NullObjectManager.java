package com.xoba.util.data;

public class NullObjectManager implements IObjectManager {

	public <T> T evaluateData(IManagedData<T> managedData) throws Exception {
		return managedData.createData();
	}

	@Override
	public boolean removeDataFromManagement(String id) {
		return true;
	}

}
