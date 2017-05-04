package keyPoint3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

		assertTrue(filelist.getFilelist().size() == 1);
		assertTrue(fileOpened.equals(filelist.getFilelist().get(0)));
	}

	@Test
	public void testingFileOpenedBehaviourhgfhfjghfg() {
		// current status: File list it큦 half full and the file is not in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		filelist.addFile(fileOpened);

		assertTrue(filelist.getFilelist().size() == 1);
		assertTrue(fileOpened.equals(filelist.getFilelist().get(0)));
	}

	@Test
	public void testingFileOpenedBehaviour2() {
		// current status: File list it큦 half full and the file is in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		File fileOpened2 = new File("open");
		File fileOpened3 = new File("open");
		File fileOpened4 = new File("open");
		File fileOpened5 = new File("open");
		filelist.addFile(fileOpened);
		filelist.addFile(fileOpened2);
		filelist.addFile(fileOpened3);
		filelist.addFile(fileOpened4);
		filelist.addFile(fileOpened5);

		assertTrue(filelist.getFilelist().size() == 5);
		assertTrue(fileOpened5.equals(filelist.getFilelist().get(0)));

	}

	@Test
	public void testingFileOpenedBehaviour3() {
		// current status: File list it큦 full and the file is in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		assertEquals("File already exist in list; moved on top of the list", filelist.addFile(fileOpened));
	}

	@Test
	public void testingFileOpenedBehaviour4() {
		// current status: File list it큦 half full and the file is not in
		FileList filelist = new FileList();
		File fileOpened = new File("open");
		filelist.addFile(fileOpened);
		assertEquals("File not exists in the list; puted on top of the list", filelist.addFile(fileOpened));
	}

}
