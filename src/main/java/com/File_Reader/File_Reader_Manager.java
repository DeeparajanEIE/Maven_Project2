package com.File_Reader;

import com.CofigrationReader.Configration_Reader;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		// Restrict to create object in File_Reader_Manager in another class
	}

	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	public Configration_Reader getInstanceCR() throws Throwable {
		Configration_Reader cr=new Configration_Reader();
		return cr;
	}
}
