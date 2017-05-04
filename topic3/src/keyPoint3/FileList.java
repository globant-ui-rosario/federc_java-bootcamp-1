package keyPoint3;

import java.util.ArrayList;
import java.util.List;

public class FileList {

	List<File> filelist;
	boolean fullList;

	public boolean isFullList() {
		return fullList;
	}

	public void setFullList(boolean fullList) {
		this.fullList = fullList;
	}

	public List<File> getFilelist() {
		return filelist;
	}

	public void setFilelist(List<File> filelist) {
		this.filelist = filelist;
	}

	public FileList() {
		this.filelist = new ArrayList<File>();
		this.setFullList(false);
	}

	public String addFile(File file) {
		List<File> filelistAux = new ArrayList<File>();
		String behaviour;
		if (isFullList()) {
			if (filelist.contains(file)) {
				filelist.remove(file);
				filelistAux.add(file);
				for (File f : filelist) {
					filelistAux.add(f);
				}
				this.setFilelist(filelistAux);
				behaviour = "File already exist in list; moved on top of the list";
			} else {
				filelist.remove(14);
				filelistAux.add(file);
				for (File f : filelist) {
					filelistAux.add(f);
				}
				this.setFilelist(filelistAux);
				behaviour = "File not exists in the list; puted on top of the list";
			}
		} else {

			if (filelist.contains(file)) {
				filelistAux.add(file);
				filelist.remove(file);
				for (File f : filelist) {
					filelistAux.add(f);
				}
				this.setFilelist(filelistAux);
				behaviour = "File already exist in list; moved on top of the list";
			} else {
				filelistAux.add(file);
				for (File f : filelist) {
					filelistAux.add(f);
				}
				this.setFilelist(filelistAux);
				behaviour = "File not exists in the list; puted on top of the list";
				checkSize();
			}

		}

		return behaviour;
	}

	private void checkSize() {
		if (this.getFilelist().size() >= 14) {
			this.setFullList(true);
		}
	}

}
