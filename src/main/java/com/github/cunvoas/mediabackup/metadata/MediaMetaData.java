package com.github.cunvoas.mediabackup.metadata;

import java.util.Date;

/**
 * Bean for metadata extracted from file.
 * @author UNVOAS
 */
public class MediaMetaData {
	
	private String fileName;
	private Date fileDate;
	private Date recordDate;
	private long size;
	private int width;
	private int length;
	private long duration;

	/**
	 * Getter for fileName.
	 * @return the fileName
	 */
	public final String getFileName() {
		return fileName;
	}
	/**
	 * Setter for fileName.
	 * @param fileName the fileName to set
	 */
	public final void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * Getter for fileDate.
	 * @return the fileDate
	 */
	public final Date getFileDate() {
		return fileDate;
	}
	/**
	 * Setter for fileDate.
	 * @param fileDate the fileDate to set
	 */
	public final void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}
	/**
	 * Getter for recordDate.
	 * @return the recordDate
	 */
	public final Date getRecordDate() {
		return recordDate;
	}
	/**
	 * Setter for recordDate.
	 * @param recordDate the recordDate to set
	 */
	public final void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	/**
	 * Getter for size.
	 * @return the size
	 */
	public final long getSize() {
		return size;
	}
	/**
	 * Setter for size.
	 * @param size the size to set
	 */
	public final void setSize(long size) {
		this.size = size;
	}
	/**
	 * Getter for width.
	 * @return the width
	 */
	public final int getWidth() {
		return width;
	}
	/**
	 * Setter for width.
	 * @param width the width to set
	 */
	public final void setWidth(int width) {
		this.width = width;
	}
	/**
	 * Getter for length.
	 * @return the length
	 */
	public final int getLength() {
		return length;
	}
	/**
	 * Setter for length.
	 * @param length the length to set
	 */
	public final void setLength(int length) {
		this.length = length;
	}
	/**
	 * Getter for duration.
	 * @return the duration
	 */
	public final long getDuration() {
		return duration;
	}
	/**
	 * Setter for duration.
	 * @param duration the duration to set
	 */
	public final void setDuration(long duration) {
		this.duration = duration;
	}
	
	
	
}
