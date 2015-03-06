package bufmgr;


import global.Page;
import global.PageId;

public class BufMgr {


	public BufMgr(int numbufs, int lookAheadSize, String replacementPolicy) {

	}

	public void pinPage(PageId pageno, Page page, boolean emptyPage) throws BufferPoolExceededException{

	}

	public void unpinPage(PageId pageno, boolean dirty) throws HashEntryNotFoundException {

	}

	public PageId newPage(Page firstpage, int howmany) {
		PageId pid = new PageId();		

		return pid;
	}


	public void freePage(PageId globalPageId) throws PagePinnedException {

	}


	public void flushPage(PageId pageid) {


	}


	public void flushAllPages() {

	}


	public int getNumBuffers() {

		return 0;
	}

	public int getNumUnpinned() {


		return 0;
	}

}
