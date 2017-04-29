package keyPoint3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileListBehaviourTest {

	@Test
	public void testingFirstRun() {
		FileList filelist = new FileList();
		assertTrue(filelist.getFilelist().isEmpty());
	}
	
	@Test
	public void testingFileOpenedBehaviour() {
		// current status: File list it큦 half full and the file is not in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		assertEquals("File not exists in the list; puted on top of the list",filelist.addFile(fileOpened));
	}
	
	@Test
	public void testingFileOpenedBehaviour2() {
		// current status: File list it큦 half full and the file is in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		assertEquals("File already exist in list; moved on top of the list",filelist.addFile(fileOpened));
	}
	
	@Test
	public void testingFileOpenedBehaviour3() {
		// current status: File list it큦 full and the file is in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		assertEquals("File already exist in list; moved on top of the list",filelist.addFile(fileOpened));
	}
	
	@Test
	public void testingFileOpenedBehaviour4() {
		// current status: File list it큦 half full and the file is not in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		assertEquals("File not exists in the list; puted on top of the list",filelist.addFile(fileOpened));
	}

}
